 package br.com.vertigo.estagio.campanha.internal.search.spi.model.index.contributor;

 import com.liferay.portal.kernel.search.Document;
 import com.liferay.portal.search.batch.BatchIndexingActionable;
 import com.liferay.portal.search.batch.DynamicQueryBatchIndexingActionableFactory;
 import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
 import com.liferay.portal.search.spi.model.index.contributor.helper.ModelIndexerWriterDocumentHelper;
 import br.com.vertigo.estagio.campanha.model.Promocao;
 import br.com.vertigo.estagio.campanha.service.PromocaoLocalService;

 import org.osgi.service.component.annotations.Component;
 import org.osgi.service.component.annotations.Reference;

 @Component(
     immediate = true, 
     property = "indexer.class.name=br.com.vertigo.estagio.campanha.model.Promocao", 
     service = ModelIndexerWriterContributor.class
 )
 public class PromocaoModelIndexerWriterContributor
     implements ModelIndexerWriterContributor<Promocao> {

     @Reference
     protected PromocaoLocalService promocaoLocalService;

     @Reference
     protected DynamicQueryBatchIndexingActionableFactory dynamicQueryBatchIndexingActionableFactory;
	 
     @Override
     public void customize(
         BatchIndexingActionable batchIndexingActionable,
         ModelIndexerWriterDocumentHelper modelIndexerWriterDocumentHelper) {

         batchIndexingActionable.setPerformActionMethod(
             (Promocao promocao) -> {
                 Document document =
                     modelIndexerWriterDocumentHelper.getDocument(promocao);

                 batchIndexingActionable.addDocuments(document);
             });
     }

     @Override
     public BatchIndexingActionable getBatchIndexingActionable() {

         return dynamicQueryBatchIndexingActionableFactory.getBatchIndexingActionable(
             promocaoLocalService.getIndexableActionableDynamicQuery());
     }

     @Override
     public long getCompanyId(Promocao promocao) {

         return promocao.getCompanyId();
     }



 }