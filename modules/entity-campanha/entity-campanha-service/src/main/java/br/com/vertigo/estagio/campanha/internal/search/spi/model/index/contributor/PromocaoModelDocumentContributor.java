package br.com.vertigo.estagio.campanha.internal.search.spi.model.index.contributor;

 import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.osgi.service.component.annotations.Component;

import br.com.vertigo.estagio.campanha.model.Promocao;

 @Component(
     immediate = true, 
     property = "indexer.class.name=br.com.vertigo.estagio.campanha.model.Promocao", 
     service = ModelDocumentContributor.class
 )
 public class PromocaoModelDocumentContributor
     implements ModelDocumentContributor<Promocao> {

     @Override
     public void contribute(Document document, Promocao promocao) {

         // Strip HTML.

         String description = HtmlUtil.extractText(promocao.getDescricao());
         document.addText("descricao", description);

         String title = HtmlUtil.extractText(promocao.getNome());
         document.addText("nome", title);

         document.addDate(Field.MODIFIED_DATE, promocao.getModifiedDate());
         
         document.addDate("dataTermino", promocao.getDataTermino());
         
         document.addDate("dataInicio", promocao.getDataInicio());


     }
 }