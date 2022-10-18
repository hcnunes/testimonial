<%@ include file="../init.jsp"%>


 <%-- Generate add / edit action URL and set title. --%>

 <c:choose>
     <c:when test="${not empty participante}">
         <portlet:actionURL var="participanteActionURL" name="<%=MVCCommandKeys.UPDATE_PARTICIPANTE %>">
             <portlet:param name="redirect" value="${param.redirect}" />
         </portlet:actionURL>

         <c:set var="editTitle" value="edit-participante"/>
     </c:when>
     <c:otherwise>
         <portlet:actionURL var="participanteActionURL" name="<%=MVCCommandKeys.ADD_PARTICIPANTE %>">
             <portlet:param name="redirect" value="${param.redirect}" />
         </portlet:actionURL>

         <c:set var="editTitle" value="add-participante"/>
     </c:otherwise>
 </c:choose>

 <div class="container-fluid-1280 edit-participante">

     <h1><liferay-ui:message key="${editTitle}" /></h1>

     <aui:model-context bean="${participante}" model="${participanteClass}" />

     <aui:form action="${participanteActionURL}" method="post"
        enctype="multipart/form-data" name="fm">

         <aui:input name="participanteId" field="participanteId" type="hidden" />
		 <aui:input name="promocaoId" type="hidden" 
                value="${promocao.promocaoId}"                
            />
		 
         <aui:fieldset-group markupView="lexicon">

             <aui:fieldset>

         <aui:input name="primeiroNome" field="primeiroNome" value="${primeiroNome}" />
         <aui:input name="primeiroNome" field="primeiroNome" value="${participante.getPrimeiroNome}" />
         
 


             </aui:fieldset>
         </aui:fieldset-group>

         <%--Buttons. --%>

         <aui:button-row>
             <aui:button cssClass="btn btn-primary" type="submit" />
             <aui:button cssClass="btn btn-secondary" onClick="${param.redirect}" type="cancel" />
         </aui:button-row>
     </aui:form>

 </div>