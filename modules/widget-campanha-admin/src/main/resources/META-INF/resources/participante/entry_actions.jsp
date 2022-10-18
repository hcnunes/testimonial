<%@ include file="../init.jsp"%>

 <c:set var="participante" value="${SEARCH_CONTAINER_RESULT_ROW.object}" />

 <liferay-ui:icon-menu markupView="lexicon">

     <%-- View action. --%>

     <portlet:renderURL var="viewParticipanteURL">
         <portlet:param name="mvcRenderCommandName"
             value="<%=MVCCommandKeys.VIEW_PARTICIPANTE %>" />
         <portlet:param name="redirect" value="${currentURL}" />
         <portlet:param name="participanteId" value="${participante.participanteId}" />
     </portlet:renderURL>

     <liferay-ui:icon message="view" url="${viewParticipanteURL}" />


     <%-- Edit action. --%>

     <portlet:renderURL var="editParticipanteURL">
         <portlet:param name="mvcRenderCommandName"
             value="<%=MVCCommandKeys.UPDATE_PARTICIPANTE %>" />
         <portlet:param name="redirect" value="${currentURL}" />
         <portlet:param name="participanteId" value="${participante.participanteId}" />
     </portlet:renderURL>

     <liferay-ui:icon message="edit" url="${editParticipanteURL}" />    

     <%-- Delete action. --%>

     <portlet:actionURL name="<%=MVCCommandKeys.DELETE_PARTICIPANTE %>" var="deleteParticipanteURL">
         <portlet:param name="redirect" value="${currentURL}" />
         <portlet:param name="participanteId" value="${participante.participanteId}" />
     </portlet:actionURL>

     <liferay-ui:icon-delete url="${deleteParticipanteURL}" />

 </liferay-ui:icon-menu>