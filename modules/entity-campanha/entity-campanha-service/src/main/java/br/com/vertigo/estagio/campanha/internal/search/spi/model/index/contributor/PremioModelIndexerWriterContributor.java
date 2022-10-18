 package br.com.vertigo.estagio.campanha.internal.search.spi.model.index.contributor;

 import com.liferay.portal.kernel.search.Document;
 import com.liferay.portal.search.batch.BatchIndexingActionable;
 import com.liferay.portal.search.batch.DynamicQueryBatchIndexingActionableFactory;
 import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
 import com.liferay.portal.search.spi.model.index.contributor.helper.ModelIndexerWriterDocumentHelper;
 import br.com.vertigo.estagio.campanha.model.Premio;
 import br.com.vertigo.estagio.campanha.service.PremioLocalService;

 import org.osgi.service.component.annotations.Component;
 import org.osgi.service.component.annotations.Reference;

 @Component(
     immediate = true, 
     property = "indexer.class.name=br.com.vertigo.estagio.campanha.model.Premio", 
     service = ModelIndexerWriterContributor.class
 )
 public class PremioModelIndexerWriterContributor
     implements ModelIndexerWriterContributor<Premio> {

     @Reference
     protected PremioLocalService premioLocalService;

     @Reference
     protected DynamicQueryBatchIndexingActionableFactory dynamicQueryBatchIndexingActionableFactory;
	 
     @Override
     public void customize(
         BatchIndexingActionable batchIndexingActionable,
         ModelIndexerWriterDocumentHelper modelIndexerWriterDocumentHelper) {

         batchIndexingActionable.setPerformActionMethod(
             (Premio premio) -> {
                 Document document =
                     modelIndexerWriterDocumentHelper.getDocument(premio);

                 batchIndexingActionable.addDocuments(document);
             });
     }

     @Override
     public BatchIndexingActionable getBatchIndexingActionable() {

         return dynamicQueryBatchIndexingActionableFactory.getBatchIndexingActionable(
             premioLocalService.getIndexableActionableDynamicQuery());
     }

     @Override
     public long getCompanyId(Premio premio) {

         return premio.getCompanyId();
     }



 }