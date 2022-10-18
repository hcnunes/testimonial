package br.com.vertigo.estagio.campanha.web.portlet.render;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;

import java.text.DateFormat;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.exception.NoSuchParticipanteException;
import br.com.vertigo.estagio.campanha.model.Participante;
import br.com.vertigo.estagio.campanha.model.Premio;
import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.ParticipanteService;
import br.com.vertigo.estagio.campanha.service.PremioService;
import br.com.vertigo.estagio.campanha.service.PromocaoService;
import br.com.vertigo.estagio.campanha.web.configuration.CampanhaPortletInstanceConfiguration;
import br.com.vertigo.estagio.campanha.web.constants.CampanhaPortletKeys;
import br.com.vertigo.estagio.campanha.web.constants.MVCCommandKeys;
import br.com.vertigo.estagio.campanha.web.internal.security.permission.resource.PremioPermission;

/**
 * MVC Command
 * 
 */
@Component(immediate = true, property = { 
		"javax.portlet.name=" + CampanhaPortletKeys.CAMPANHA,
		"mvc.command.name=" + MVCCommandKeys.DETAIL_CAMPANHA }, 
		service = MVCRenderCommand.class)

public class AbrirCampanhaMVCRenderCommand implements MVCRenderCommand {

	@Reference
	protected PromocaoService _promocaoService;

	@Reference
	protected PremioService _premioService;

	@Reference
	protected ParticipanteService _participanteService;

	@Reference
	private Portal _portal;

	@Reference
	protected PremioPermission _premioPermission;

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		// dados da promocao
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		  	
    	try {
    		CampanhaPortletInstanceConfiguration prefs = themeDisplay.getPortletDisplay()
    				.getPortletInstanceConfiguration(CampanhaPortletInstanceConfiguration.class);

    		renderRequest.setAttribute("ufCampanha", prefs.ufCampanha());
		
    	} catch (Exception e) {
			e.printStackTrace();
		}

		long promocaoId = ParamUtil.getLong(renderRequest, "promocaoId");
		
        Participante participante = null;
        
        long participanteId = ParamUtil.getLong(renderRequest, "participanteId", 0);
		
		boolean signedIn = themeDisplay.isSignedIn();
		
		boolean activity = false;
        if (participanteId > 0) {
        	activity = true;
        }
        
		
		try {
			
	        User user = null;
	        try {
	        	user = UserLocalServiceUtil.getUser(themeDisplay.getUserId());
	        } catch (PortalException e) {
	        	e.printStackTrace();
	        }
			boolean testeVerificacao = _participanteService.verificaParticipante(promocaoId, user.getUserId());
	        
			
			
			Promocao promocao = _promocaoService.getPromocao(promocaoId);
			DateFormat dateFormat = DateFormatFactoryUtil.getSimpleDateFormat("EEEEE, MMMMM dd, yyyy",
					renderRequest.getLocale());

			// Set attributes to the request. 

			renderRequest.setAttribute("promocao", promocao);
			renderRequest.setAttribute("dataInicio", dateFormat.format(promocao.getDataInicio()));
			renderRequest.setAttribute("dataTermino", dateFormat.format(promocao.getDataTermino()));
			renderRequest.setAttribute("createDate", dateFormat.format(promocao.getCreateDate()));
			renderRequest.setAttribute("fileUrl", promocao.getFileUrl());
			renderRequest.setAttribute("fileEntryId", promocao.getFileEntryId());
			
			renderRequest.setAttribute("signedIn", signedIn);
			renderRequest.setAttribute("activity", activity);
			renderRequest.setAttribute("testeVerificacao", testeVerificacao);
			
	        renderRequest.setAttribute("participante", participante);
	        renderRequest.setAttribute("participanteClass", Participante.class);
	        
	        	        

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Set back icon visible.

		PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();

		String redirect = renderRequest.getParameter("redirect");

		portletDisplay.setShowBackIcon(true);
		portletDisplay.setURLBack(redirect);
		// /dados da promocao

		// Add premio list related attributes.

		addPremioListAttributes(renderRequest);

		// renderRequest.setAttribute("premioPermission", _premioPermission);

		return "/promocao/view_promocao.jsp";
	}

	/**
	 * Adds premio list related attributes to the request.
	 * 
	 * @param renderRequest
	 */
	private void addPremioListAttributes(RenderRequest renderRequest) {

		long promocaoId;

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		// Resolve start and end for the search.

		int currentPage = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_CUR_PARAM,
				SearchContainer.DEFAULT_CUR);

		int delta = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_DELTA_PARAM,
				SearchContainer.DEFAULT_DELTA);

		int start = ((currentPage > 0) ? (currentPage - 1) : 0) * delta;
		int end = start + delta;

		// Get sorting options.
		// Notice that this doesn't really sort on title because the field is
		// stored in XML. In real world this search would be integrated to the
		// search engine to get localized sort options.

		String orderByCol = ParamUtil.getString(renderRequest, "orderByCol", "nome");
		String orderByType = ParamUtil.getString(renderRequest, "orderByType", "asc");

		// Create comparator

		OrderByComparator<Premio> comparator = OrderByComparatorFactoryUtil.create("Premio", orderByCol,
				!("asc").equals(orderByType));

		// Get keywords.
		// Notice that cleaning keywords is not implemented.

		String keywords = ParamUtil.getString(renderRequest, "keywords");

		// Call the service to get the list of premios.
		promocaoId = ParamUtil.getLong(renderRequest, "promocaoId");

		List<Premio> premios = _premioService.getPremiosByPromocaoId(themeDisplay.getScopeGroupId(), promocaoId, start,
				end, comparator);

		renderRequest.setAttribute("premios", premios);
		renderRequest.setAttribute("premioCount",
				_premioService.getPremiosCountByKeywords(themeDisplay.getScopeGroupId(), keywords));

	}
	
}
