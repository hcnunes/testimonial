<%@ include file="../init.jsp"%>

 <c:set var="promocao" value="${SEARCH_CONTAINER_RESULT_ROW.object}" />

 <liferay-ui:icon-menu markupView="lexicon">

     <%-- Visualizar. --%>
	<c:if test="${promocaoPermission.contains(permissionChecker, promocao.promocaoId, 'VIEW' )}">
	     <portlet:renderURL var="viewPromocaoURL">
	         <portlet:param name="mvcRenderCommandName"
	             value="<%=MVCCommandKeys.VIEW_PROMOCAO %>" />
	         <portlet:param name="redirect" value="${currentURL}" />
	         <portlet:param name="promocaoId" value="${promocao.promocaoId}" />
	     </portlet:renderURL>
	
	     <liferay-ui:icon message="view" url="${viewPromocaoURL}" />
	</c:if>

     <%-- Editar. --%>
	<c:if test="${promocaoPermission.contains(permissionChecker, promocao.promocaoId, 'UPDATE' )}">
	     <portlet:renderURL var="editPromocaoURL">
	         <portlet:param name="mvcRenderCommandName"
	             value="<%=MVCCommandKeys.UPDATE_PROMOCAO %>" />
	         <portlet:param name="redirect" value="${currentURL}" />
	         <portlet:param name="promocaoId" value="${promocao.promocaoId}" />
	     </portlet:renderURL>

     	<liferay-ui:icon message="edit" url="${editPromocaoURL}" />  
     </c:if>  

     <%-- Deletar. --%>
	<c:if test="${promocaoPermission.contains(permissionChecker, promocao.promocaoId, 'DELETE')}">
	     <portlet:actionURL name="<%=MVCCommandKeys.DELETE_PROMOCAO %>" var="deletePromocaoURL">
	         <portlet:param name="redirect" value="${currentURL}" />
	         <portlet:param name="promocaoId" value="${promocao.promocaoId}" />
	     </portlet:actionURL>
	
	     <liferay-ui:icon-delete url="${deletePromocaoURL}" />
	</c:if>
	
     <%-- Gerenciar Premios. --%>
     
     <portlet:renderURL var="viewPremioURL">
         <portlet:param name="mvcRenderCommandName"
             value="<%=MVCCommandKeys.VIEW_PREMIOS %>" />
         <portlet:param name="redirect" value="${currentURL}" />
         <portlet:param name="promocaoId" value="${promocao.promocaoId}" />
     </portlet:renderURL>
     <liferay-ui:icon message="Premios" url="${viewPremioURL}" />  
     
     <%-- Gerenciar Participantes. --%>
     
     <portlet:renderURL var="viewParticipanteURL">
         <portlet:param name="mvcRenderCommandName"
             value="<%=MVCCommandKeys.VIEW_PARTICIPANTES %>" />
         <portlet:param name="redirect" value="${currentURL}" />
         <portlet:param name="promocaoId" value="${promocao.promocaoId}" />
     </portlet:renderURL>
     <liferay-ui:icon message="Participantes" url="${viewParticipanteURL}" />  

 </liferay-ui:icon-menu>