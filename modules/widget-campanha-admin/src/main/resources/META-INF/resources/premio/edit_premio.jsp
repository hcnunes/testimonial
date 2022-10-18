<%@ include file="../init.jsp"%>


 <%-- Generate add / edit action URL and set title. --%>

 <c:choose>
     <c:when test="${not empty premio}">
         <portlet:actionURL var="premioActionURL" name="<%=MVCCommandKeys.UPDATE_PREMIO %>">
             <portlet:param name="redirect" value="${param.redirect}" />
         </portlet:actionURL>

         <c:set var="editTitle" value="edit-premio"/>
     </c:when>
     <c:otherwise>
         <portlet:actionURL var="premioActionURL" name="<%=MVCCommandKeys.ADD_PREMIO %>">
             <portlet:param name="redirect" value="${param.redirect}" />
         </portlet:actionURL>

         <c:set var="editTitle" value="add-premio"/>
     </c:otherwise>
 </c:choose>

 <div class="container-fluid-1280 edit-premio">

     <h1><liferay-ui:message key="${editTitle}" /></h1>

     <aui:model-context bean="${premio}" model="${premioClass}" />

     <aui:form action="${premioActionURL}" method="post"
        enctype="multipart/form-data" name="fm">

         <aui:input name="premioId" field="premioId" type="hidden" />
		 <aui:input name="promocaoId" type="hidden" 
                value="${promocao.promocaoId}"                
            />
		 
         <aui:fieldset-group markupView="lexicon">

             <aui:fieldset>

                 <%-- Nome. --%>

                 <aui:input name="nome" label="premio-nome" required="true">
					 <aui:validator errorMessage="error.premio-title-format" name="custom">
					     function(val, fieldNode, ruleValue) {
					         var wordExpression = 
					             new RegExp("^[^\\[\\]\\^$<>]*$");
					
					         return wordExpression.test(val);
					     }
					 </aui:validator>
					
                 </aui:input>

                 <%-- Descricao . --%>

                 <aui:input name="descricao" label="premio-descricao" required="true">
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