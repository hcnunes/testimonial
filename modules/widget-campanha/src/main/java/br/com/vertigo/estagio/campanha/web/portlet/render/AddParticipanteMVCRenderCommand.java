package br.com.vertigo.estagio.campanha.web.portlet.render;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import br.com.vertigo.estagio.campanha.exception.NoSuchParticipanteException;
import br.com.vertigo.estagio.campanha.exception.NoSuchPromocaoException;
import br.com.vertigo.estagio.campanha.model.Participante;
import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.ParticipanteService;
import br.com.vertigo.estagio.campanha.service.ParticipanteService;
import br.com.vertigo.estagio.campanha.service.PromocaoService;
import br.com.vertigo.estagio.campanha.web.constants.CampanhaPortletKeys;
import br.com.vertigo.estagio.campanha.web.constants.MVCCommandKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true, 
    property = {
    	"javax.portlet.name=" + CampanhaPortletKeys.CAMPANHA,
        "mvc.command.name=" + MVCCommandKeys.ADD_PARTICIPANTE
    }, 
    service = MVCRenderCommand.class
)
public class AddParticipanteMVCRenderCommand implements MVCRenderCommand {

    @Reference
    private ParticipanteService _participanteService;
    
    @Reference
    private PromocaoService _promocaoService;
	

	@Override
    public String render(
        RenderRequest renderRequest, RenderResponse renderResponse)
        throws PortletException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

        Participante participante = null;
        
        long participanteId = ParamUtil.getLong(renderRequest, "participanteId", 0);

        long promocaoId = ParamUtil.getLong(renderRequest, "promocaoId");
              
        if (participanteId > 0) {
            participante = _participanteService.getParticipante(participanteId);         			
        }
        
        
        boolean testeVerificacao = false;
        User user = null;
        try {
        	user = UserLocalServiceUtil.getUser(themeDisplay.getUserId());
            testeVerificacao = _participanteService.verificaParticipante(promocaoId, user.getUserId());
        } catch (PortalException e) {
        	e.printStackTrace();
        }

        
        Promocao promocao = null;
        if (promocaoId > 0) {
            try {

                // Call the service to get the participante for editing.

            	promocao = _promocaoService.getPromocao(promocaoId);
            }
            catch (NoSuchPromocaoException nsae) {
                nsae.printStackTrace();
            }
            catch (PortalException pe) {
                pe.printStackTrace();
            }
        }
       

        // Set back icon visible.

        PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();

        portletDisplay.setShowBackIcon(true);

        String redirect = renderRequest.getParameter("redirect");

        portletDisplay.setURLBack(redirect);


        
        // Set participante to the request attributes.
        renderRequest.setAttribute("promocao", promocao);
        renderRequest.setAttribute("participante", participante);
        renderRequest.setAttribute("participanteClass", Participante.class);
		renderRequest.setAttribute("testeVerificacao", testeVerificacao);

        return "/promocao/finalizada.jsp";
    }



}
