<%@ include file="../init.jsp"%>

 <c:set var="premio" value="${SEARCH_CONTAINER_RESULT_ROW.object}" />

 <liferay-ui:icon-menu markupView="lexicon">

     <%-- View action. --%>
    <c:if test="${premioPermission.contains(permissionChecker, premio.premioId, 'VIEW' )}">
         <portlet:renderURL var="viewPremioURL">
             <portlet:param name="mvcRenderCommandName"
                 value="<%=MVCCommandKeys.VIEW_PREMIO %>" />
             <portlet:param name="redirect" value="${currentURL}" />
             <portlet:param name="premioId" value="${premio.premioId}" />
         </portlet:renderURL>
    
         <liferay-ui:icon message="Visualizar" url="${viewPremioURL}" />
    </c:if>

     <%-- Edit action. --%>
    <c:if test="${premioPermission.contains(permissionChecker, premio.premioId, 'UPDATE' )}">
         <portlet:renderURL var="editPremioURL">
             <portlet:param name="mvcRenderCommandName"
                 value="<%=MVCCommandKeys.UPDATE_PREMIO %>" />
             <portlet:param name="redirect" value="${currentURL}" />
             <portlet:param name="premioId" value="${premio.premioId}" />
         </portlet:renderURL>
    
         <liferay-ui:icon message="Editar" url="${editPremioURL}" />    
    </c:if>
     
     <%-- Delete action. --%>
    <c:if test="${premioPermission.contains(permissionChecker, premio.premioId, 'DELETE' )}">
         <portlet:actionURL name="<%=MVCCommandKeys.DELETE_PREMIO %>" var="deletePremioURL">
             <portlet:param name="redirect" value="${currentURL}" />
             <portlet:param name="premioId" value="${premio.premioId}" />
         </portlet:actionURL>
    
         <liferay-ui:icon-delete message="Excluir" url="${deletePremioURL}" />
    </c:if>
    
    <%-- Sortear action --%>
	<c:if test="${premio.userIdPremiado.equals(0)}">
		<portlet:actionURL name="<%=MVCCommandKeys.SORTEAR_PREMIO %>" var="sortearPremioURL">
	        <portlet:param name="redirect" value="${currentURL}" />
	        <portlet:param name="premioId" value="${premio.premioId}" />
	    </portlet:actionURL>
	
	    <liferay-ui:icon message="Apurar vencedor" url="${sortearPremioURL}" />
	
	</c:if>
	
	
 </liferay-ui:icon-menu>
 