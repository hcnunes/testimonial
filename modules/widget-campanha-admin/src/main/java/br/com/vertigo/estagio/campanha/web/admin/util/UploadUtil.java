package br.com.vertigo.estagio.campanha.web.admin.util;

import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.File;

import org.osgi.service.component.annotations.Component;

/**
 * Exemplo de componente reutilizável para 
 * gravar arquivo no documentos e mídias a partir de upload pelo formulário JSP.
 * @author henrique
 *
 */
@Component(
	immediate = true,
	service = UploadUtil.class
)
public class UploadUtil {

	public FileEntry gravarDocumentLibrary(UploadPortletRequest uploadRequest, 
			String campoArquivo, String descricao, String nomePasta) throws Exception {
		ThemeDisplay themeDisplay = (ThemeDisplay) uploadRequest.getAttribute(WebKeys.THEME_DISPLAY);

		File arquivoEnviado = uploadRequest.getFile(campoArquivo);
		
		if (arquivoEnviado.exists()) {
			System.out.println("Arquivo temporário gravado no servidor: " + arquivoEnviado.getPath() + ", " + arquivoEnviado.getName());
		}
		else {
			SessionErrors.add(uploadRequest, "erro-arquivo-nao-encontrado");
			throw new PortalException("Arquivo não encontrado.");
		}
		
		System.out.println("Descricao: " + descricao);

		ServiceContext sc = ServiceContextFactory.getInstance(uploadRequest);
		sc.setAddGuestPermissions(true);
		sc.setAddGroupPermissions(true);
		
		Folder folder = DLAppLocalServiceUtil.getFolder(sc.getScopeGroupId(), 0, nomePasta);
		
		FileEntry fileEntry = DLAppLocalServiceUtil.addFileEntry(sc.getUserId(), sc.getScopeGroupId(), folder.getFolderId(), 
				arquivoEnviado.getName(), MimeTypesUtil.getContentType(arquivoEnviado), 
				arquivoEnviado.getName(), descricao, null, arquivoEnviado, sc);
				
		System.out.println("Arquivo enviado para Documentos e Mídias, fileEntryId: " + fileEntry.getFileEntryId());
		
		System.out.println("URL de visualização: " + 
				DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, 
						StringPool.BLANK, false, true));
		
		return fileEntry;
	}
	
}
