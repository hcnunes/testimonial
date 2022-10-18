package br.com.vertigo.estagio.campanha.web.portlet.render;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.search.document.Document;
import com.liferay.portal.search.hits.SearchHit;
import com.liferay.portal.search.hits.SearchHits;
import com.liferay.portal.search.query.BooleanQuery;
import com.liferay.portal.search.query.MatchQuery;
import com.liferay.portal.search.query.Queries;
import com.liferay.portal.search.query.TermsQuery;
import com.liferay.portal.search.searcher.SearchRequest;
import com.liferay.portal.search.searcher.SearchRequestBuilder;
import com.liferay.portal.search.searcher.SearchRequestBuilderFactory;
import com.liferay.portal.search.searcher.SearchResponse;
import com.liferay.portal.search.searcher.Searcher;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.model.Premio;
import br.com.vertigo.estagio.campanha.service.ParticipanteLocalService;
import br.com.vertigo.estagio.campanha.service.PremioLocalService;
import br.com.vertigo.estagio.campanha.service.PremioService;
import br.com.vertigo.estagio.campanha.service.PromocaoLocalService;
import br.com.vertigo.estagio.campanha.service.PromocaoService;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;
import br.com.vertigo.estagio.campanha.web.admin.internal.security.permission.resource.PremioPermission;
import br.com.vertigo.estagio.campanha.web.display.context.PremiosManagementToolbarDisplayContext;

/**
 * MVC Command
 * 
 */
@Component(immediate = true, property = { "javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
		"mvc.command.name=" + MVCCommandKeys.VIEW_PREMIOS }, service = MVCRenderCommand.class)

public class ViewPremiosMVCRenderCommand implements MVCRenderCommand {

	@Reference
	protected PromocaoService _promocaoService;
	
	@Reference
	protected PromocaoLocalService _promocaoLocalService;
	
	@Reference
	protected ParticipanteLocalService _participanteLocalService;

	@Reference
	protected PremioService _premioService;

	@Reference
	protected PremioLocalService _premioLocalService;

	@Reference
	private Portal _portal;

	@Reference
	protected PremioPermission _premioPermission;
	
	@Reference
	protected Queries queries;

	@Reference
	protected Searcher searcher;

	@Reference
	protected SearchRequestBuilderFactory searchRequestBuilderFactory;

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		try {
			// Add premio list related attributes.
			addPremioListAttributes(renderRequest, renderResponse);

			// Add Clay management toolbar related attributes.
			addManagementToolbarAttributes(renderRequest, renderResponse);

		} catch (Exception e) {
			SessionErrors.add(renderRequest, "erro-listar-premios");
			throw new PortletException(e);
		}

		renderRequest.setAttribute("premioPermission", _premioPermission);

		return "/premio/listar.jsp";
	}

	/**
	 * Adds premio list related attributes to the request.
	 * 
	 * @param renderRequest
	 */

	private void addPremioListAttributes(RenderRequest renderRequest, RenderResponse renderResponse) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long promocaoId = ParamUtil.getLong(renderRequest, "promocaoId");
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		int currentPage = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_CUR_PARAM,
				SearchContainer.DEFAULT_CUR);
		int delta = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_DELTA_PARAM,
				SearchContainer.DEFAULT_DELTA);
		int start = ((currentPage > 0) ? (currentPage - 1) : 0) * delta;
		int end = start + delta;

		String orderByCol = ParamUtil.getString(renderRequest, "orderByCol", "nome");
		String orderByType = ParamUtil.getString(renderRequest, "orderByType", "asc");
		String keywords = ParamUtil.getString(renderRequest, "keywords");

		TermsQuery termsQuery = queries.terms(Field.GROUP_ID);
		termsQuery.addValues(String.valueOf(themeDisplay.getScopeGroupId()));
		
		TermsQuery promocaoQuery = queries.terms("promocaoId");
		promocaoQuery.addValue(String.valueOf(promocaoId));

		MatchQuery titleQuery = queries.match("nome", keywords);

		BooleanQuery booleanQuery = queries.booleanQuery();

		if (!Validator.isNull(keywords)) {
			booleanQuery.addMustQueryClauses(titleQuery);
		}

		booleanQuery.addMustQueryClauses(termsQuery, promocaoQuery);

		SearchRequestBuilder searchRequestBuilder = searchRequestBuilderFactory.builder().query(booleanQuery);

		searchRequestBuilder.emptySearchEnabled(true).withSearchContext(searchContext -> {
			String[] entryClassNames = { Premio.class.getName() };
			searchContext.setEntryClassNames(entryClassNames);
			searchContext.setCompanyId(companyId);
			searchContext.setKeywords(keywords);
			searchContext.setStart(start);
			searchContext.setEnd(end);
		});

		SearchRequest searchRequest = searchRequestBuilder.query(booleanQuery).build();

		SearchResponse searchResponse = searcher.search(searchRequest);

		SearchHits searchHits = searchResponse.getSearchHits();

		List<SearchHit> searchHitsList = searchHits.getSearchHits();

		List<Premio> resultsList = new ArrayList<>(searchHitsList.size());

		searchHitsList.forEach(searchHit -> {
			Document doc = searchHit.getDocument();
			try {
				resultsList.add(_premioService.getPremio(GetterUtil.getLong(doc.getString("entryClassPK"))));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		
		//comunica que todos os premios foram sorteados
		_promocaoLocalService.updatePromocao(promocaoId, _participanteLocalService.findPromocaoFinalizada(promocaoId));
		
		System.out.println(searchResponse.getRequestString());

		renderRequest.setAttribute("premios", resultsList);
		renderRequest.setAttribute("premioCount", searchHitsList.size());

	}


	/**
	 * Adds Clay management toolbar context object to the request.
	 * 
	 * @param renderRequest
	 * @param renderResponse
	 */
	private void addManagementToolbarAttributes(RenderRequest renderRequest, RenderResponse renderResponse) {

		LiferayPortletRequest liferayPortletRequest = _portal.getLiferayPortletRequest(renderRequest);

		LiferayPortletResponse liferayPortletResponse = _portal.getLiferayPortletResponse(renderResponse);

		PremiosManagementToolbarDisplayContext premiosManagementToolbarDisplayContext = new PremiosManagementToolbarDisplayContext(
				liferayPortletRequest, liferayPortletResponse, _portal.getHttpServletRequest(renderRequest));

		renderRequest.setAttribute("premiosManagementToolbarDisplayContext", premiosManagementToolbarDisplayContext);

	}

}
