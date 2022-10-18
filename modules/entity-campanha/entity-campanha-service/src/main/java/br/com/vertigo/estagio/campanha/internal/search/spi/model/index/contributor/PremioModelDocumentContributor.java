package br.com.vertigo.estagio.campanha.internal.search.spi.model.index.contributor;

 import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;

import org.osgi.service.component.annotations.Component;

import br.com.vertigo.estagio.campanha.model.Premio;

 @Component(
     immediate = true, 
     property = "indexer.class.name=br.com.vertigo.estagio.campanha.model.Premio", 
     service = ModelDocumentContributor.class
 )
 public class PremioModelDocumentContributor
     implements ModelDocumentContributor<Premio> {

     @Override
     public void contribute(Document document, Premio premio) {

         // Strip HTML.

         String description = HtmlUtil.extractText(premio.getDescricao());
         document.addText("descricao", description);

         String title = HtmlUtil.extractText(premio.getNome());
         document.addText("nome", title);

         document.addDate(Field.MODIFIED_DATE, premio.getModifiedDate());
         
         document.addNumber("promocaoId", premio.getPromocaoId());
         

     }
 }