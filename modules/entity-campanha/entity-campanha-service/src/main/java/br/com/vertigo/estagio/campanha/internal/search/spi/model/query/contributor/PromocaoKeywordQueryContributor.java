 package br.com.vertigo.estagio.campanha.internal.search.spi.model.query.contributor;

 import com.liferay.portal.kernel.search.BooleanQuery;
 import com.liferay.portal.kernel.search.Field;
 import com.liferay.portal.kernel.search.SearchContext;
 import com.liferay.portal.search.query.QueryHelper;
 import com.liferay.portal.search.spi.model.query.contributor.KeywordQueryContributor;
 import com.liferay.portal.search.spi.model.query.contributor.helper.KeywordQueryContributorHelper;

 import org.osgi.service.component.annotations.Component;
 import org.osgi.service.component.annotations.Reference;

 @Component(
     immediate = true,
     property = "indexer.class.name=br.com.vertigo.estagio.campanha.model.Promocao",
     service = KeywordQueryContributor.class
 )
 public class PromocaoKeywordQueryContributor
     implements KeywordQueryContributor {

     @Override
     public void contribute(
         String keywords, BooleanQuery booleanQuery,
         KeywordQueryContributorHelper keywordQueryContributorHelper) {

         SearchContext searchContext =
             keywordQueryContributorHelper.getSearchContext();

         queryHelper.addSearchTerm(
             booleanQuery, searchContext, "descricao", true);
         queryHelper.addSearchTerm(
             booleanQuery, searchContext, "nome", true);
     }

     @Reference
     protected QueryHelper queryHelper;

 }