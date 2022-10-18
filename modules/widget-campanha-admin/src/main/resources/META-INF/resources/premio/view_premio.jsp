 <%@ include file="../init.jsp"%>

 <div class="container-fluid-1280">

     <h1>${premio.getNome()}</h1>

     <h2><liferay-ui:message key="premio-information" /></h2>

     <div class="premio-metadata">

         <dl>
             <dt><liferay-ui:message key="premio-created" /></dt>
             <dd>${createDate}</dd>
				
			 <dt><liferay-ui:message key="premio-promocaoId" /></dt>
             <dd>${premio.promocaoId}</dd>          
				
             <dt><liferay-ui:message key="premio-created-by" /></dt>
             <dd>${premio.userName}</dd>

             <dt><liferay-ui:message key="premio-descricao" /></dt>
             <dd>${premio.getDescricao()}</dd>
             
             <dt><liferay-ui:message key="premio-sorteado" /></dt>
             <dd>${premio.getUserIdPremiado()}</dd>
             
             <dt><liferay-ui:message key="premio-imagem" /></dt>
             <img SRC="${premio.getFileUrl()}" width="200" height="200">
             
         </dl>
     </div>
     
      
 </div>