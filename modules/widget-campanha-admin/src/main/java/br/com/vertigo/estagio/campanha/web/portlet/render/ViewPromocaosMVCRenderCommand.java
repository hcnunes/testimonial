package br.com.vertigo.estagio.campanha.web.portlet.render;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
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
import com.liferay.portal.search.query.DateRangeTermQuery;
import com.liferay.portal.search.query.MatchQuery;
import com.liferay.portal.search.query.Queries;
import com.liferay.portal.search.query.TermsQuery;
import com.liferay.portal.search.searcher.SearchRequest;
import com.liferay.portal.search.searcher.SearchRequestBuilder;
import com.liferay.portal.search.searcher.SearchRequestBuilderFactory;
import com.liferay.portal.search.searcher.SearchResponse;
import com.liferay.portal.search.searcher.Searcher;

import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.PremioLocalService;
import br.com.vertigo.estagio.campanha.service.PromocaoLocalService;
import br.com.vertigo.estagio.campanha.service.PromocaoService;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;
import br.com.vertigo.estagio.campanha.web.admin.internal.security.permission.resource.PromocaoPermission;
import br.com.vertigo.estagio.campanha.web.display.context.PromocaosManagementToolbarDisplayContext;

/**
 * MVC command
 * 
 * 
 */
@Component(immediate = true, property = { "javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
		"mvc.command.name=/", "mvc.command.name=" + MVCCommandKeys.VIEW_PROMOCAOS }, service = MVCRenderCommand.class)

public class ViewPromocaosMVCRenderCommand implements MVCRenderCommand {

	@Reference
	protected PromocaoService _promocaoService;

	@Reference
	protected PromocaoLocalService _promocaoLocalService;

	@Reference
	protected PremioLocalService _premioLocalService;
	
	@Reference
	private Portal _portal;

	@Reference
	protected PromocaoPermission _promocaoPermission;

	@Reference
	protected Queries queries;

	@Reference
	protected Searcher searcher;

	@Reference
	protected SearchRequestBuilderFactory searchRequestBuilderFactory;

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		try {
			addPromocaoListAttributes(renderRequest, renderResponse);

			addManagementToolbarAttributes(renderRequest, renderResponse);
		} catch (Exception ex) {
			SessionErrors.add(renderRequest, "erro-listar-promocoes");
			throw new PortletException(ex);
		}

		renderRequest.setAttribute("promocaoPermission", _promocaoPermission);

		return "/view.jsp";
	}

	// ------------

	private void addPromocaoListAttributes(RenderRequest renderRequest, RenderResponse renderResponse)
			throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String strDate = dateFormat.format(date);
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

		MatchQuery titleQuery = queries.match("nome", keywords);

		DateRangeTermQuery dataTerminoRangeTerm = queries.dateRangeTerm("dataTermino", true, false, strDate, null);
		
		BooleanQuery booleanQuery = queries.booleanQuery();
		
		if(Validator.isNotNull(keywords)) {
			booleanQuery.addMustQueryClauses(titleQuery);
		}
		
		booleanQuery.addMustQueryClauses(termsQuery, dataTerminoRangeTerm);

		SearchRequestBuilder searchRequestBuilder = searchRequestBuilderFactory.builder().query(booleanQuery);

		searchRequestBuilder.emptySearchEnabled(true).withSearchContext(searchContext -> {
			String[] entryClassNames = { Promocao.class.getName() };
			searchContext.setEntryClassNames(entryClassNames);
			searchContext.setCompanyId(companyId);
			//searchContext.setKeywords(keywords);
			searchContext.setStart(start);
			searchContext.setEnd(end);

		}

		);

		SearchRequest searchRequest = searchRequestBuilder.query(booleanQuery).build();

		SearchResponse searchResponse = searcher.search(searchRequest);

		SearchHits searchHits = searchResponse.getSearchHits();

		List<SearchHit> searchHitsList = searchHits.getSearchHits();

		List<Promocao> resultsList = new ArrayList<>(searchHitsList.size());

		resultsList.forEach(a -> {
			try {
				;
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		
		searchHitsList.forEach(searchHit -> {
			Document doc = searchHit.getDocument();
			try {
				resultsList.add(_promocaoService.getPromocao(GetterUtil.getLong(doc.getString("entryClassPK"))));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		
		System.out.println(searchResponse.getRequestString());
	

		renderRequest.setAttribute("promocaos", resultsList);
		renderRequest.setAttribute("promocaoCount", searchHitsList.size());
		renderRequest.setAttribute("promocaoSorteado", searchHitsList.size());
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

		PromocaosManagementToolbarDisplayContext promocaosManagementToolbarDisplayContext = new PromocaosManagementToolbarDisplayContext(
				liferayPortletRequest, liferayPortletResponse, _portal.getHttpServletRequest(renderRequest));

		renderRequest.setAttribute("promocaosManagementToolbarDisplayContext",
				promocaosManagementToolbarDisplayContext);

	}

}
