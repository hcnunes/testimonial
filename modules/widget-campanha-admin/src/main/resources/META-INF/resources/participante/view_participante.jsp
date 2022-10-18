 <%@ include file="../init.jsp"%>

 <div class="container-fluid-1280">

     <h1>${participante.getUserName()}</h1>

     <h2><liferay-ui:message key="participante-information" /></h2>

     <div class="participante-metadata">

         <dl>
             <dt><liferay-ui:message key="participante-primeiro-nome" /></dt>
             <dd>${primeiroNome}</dd>
				
             <dt><liferay-ui:message key="participante-ultimo-nome" /></dt>
             <dd>${ultimoNome}</dd>
             
			 <dt><liferay-ui:message key="participante-email" /></dt>
             <dd>${email}</dd>


             
         </dl>
     </div>
     
      
 </div>