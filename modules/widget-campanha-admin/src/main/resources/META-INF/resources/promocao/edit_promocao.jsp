<%@ include file="../init.jsp"%>


 <%--  <liferay-ui:error key="serviceErrorDetails">
     <liferay-ui:message key="error.promocao-service-error" arguments='<%= SessionErrors.get(liferayPortletRequest, "serviceErrorDetails") %>' />
 </liferay-ui:error>
 <liferay-ui:error key="promocaoTitleEmpty" message="error.promocao-title-empty" />
 <liferay-ui:error key="promocaoDescriptionEmpty" message="error.promocao-description-empty" /> --%>

 <%-- Generate add / edit action URL and set title. --%>

 <c:choose>
     <c:when test="${not empty promocao}">
         <portlet:actionURL var="promocaoActionURL" name="<%=MVCCommandKeys.UPDATE_PROMOCAO %>">
             <portlet:param name="redirect" value="${param.redirect}" />
         </portlet:actionURL>

         <c:set var="editTitle" value="edit-promocao"/>
     </c:when>
     <c:otherwise>
         <portlet:actionURL var="promocaoActionURL" name="<%=MVCCommandKeys.ADD_PROMOCAO %>">
             <portlet:param name="redirect" value="${param.redirect}" />
         </portlet:actionURL>

         <c:set var="editTitle" value="add-promocao"/>
     </c:otherwise>
 </c:choose>

 <div class="container-fluid-1280 edit-promocao">

     <h1><liferay-ui:message key="${editTitle}" /></h1>

     <aui:model-context bean="${promocao}" model="${promocaoClass}" />

     <aui:form action="${promocaoActionURL}" method="post"
        enctype="multipart/form-data" name="fm">

         <aui:input name="promocaoId" field="promocaoId" type="hidden" />

         <fmt:formatDate var="dataInicio" pattern='yyyy-MM-dd' value="${promocao.dataInicio}"/>         
         <fmt:formatDate var="dataTermino" pattern='yyyy-MM-dd' value="${promocao.dataTermino}"/>

         <aui:fieldset-group markupView="lexicon">

             <aui:fieldset>

                 <%-- Nome. --%>

                 <aui:input name="nome" label="promocao-nome" required="true">
					 <aui:validator errorMessage="error.promocao-title-format" name="custom">
					     function(val, fieldNode, ruleValue) {
					         var wordExpression = 
					             new RegExp("^[^\\[\\]\\^$<>]*$");
					
					         return wordExpression.test(val);
					     }
					 </aui:validator>
					
                 </aui:input>

                 <%-- Descricao . --%>

                 <aui:input name="descricao" label="promocao-descricao" required="true">
                 </aui:input>
                 
                 <%-- Data de inicio. --%>
				

 
                <aui:input name="dataInicio" label="promocao-dataInicio" 
                type="date" required="true" value="${promocao.dataInicio}">
                </aui:input>              
   
               <%-- Data de termino. --%>
               
               <aui:input name="dataTermino" label="promocao-dataTermino" 
               type="date" required="true" value="${promocao.dataTermino}">
               </aui:input>
               
               <%-- Upload dos arquivos --%>
			   <aui:input name="arquivo" type="file" required="true">
	                <aui:validator name="acceptFiles">'pdf,png,jpg,txt'</aui:validator>
	           </aui:input>       


             </aui:fieldset>
         </aui:fieldset-group>

         <%--Buttons. --%>

         <aui:button-row>
             <aui:button cssClass="btn btn-primary" type="submit" />
             <aui:button cssClass="btn btn-secondary" onClick="${param.redirect}" type="cancel" />
         </aui:button-row>
     </aui:form>

 </div>