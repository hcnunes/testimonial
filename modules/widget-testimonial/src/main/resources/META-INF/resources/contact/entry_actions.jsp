<%@ include file="../init.jsp"%>

 <c:set var="contact" value="${SEARCH_CONTAINER_RESULT_ROW.object}" />

 <liferay-ui:icon-menu markupView="lexicon">

     <%-- View. --%>

	     <portlet:renderURL var="viewContactURL">
	         <portlet:param name="mvcRenderCommandName"
	             value="<%=MVCCommandKeys.VIEW_CONTACT %>" />
	         <portlet:param name="redirect" value="${currentURL}" />
	         <portlet:param name="contactId" value="${contact.contactId}" />
	     </portlet:renderURL>
	
	     <liferay-ui:icon message="view" url="${viewContactURL}" />


     <%-- Edit. --%>

	     <portlet:renderURL var="editContactURL">
	         <portlet:param name="mvcRenderCommandName"
	             value="<%=MVCCommandKeys.UPDATE_CONTACT %>" />
	         <portlet:param name="redirect" value="${currentURL}" />
	         <portlet:param name="contactId" value="${contact.contactId}" />
	     </portlet:renderURL>

     	<liferay-ui:icon message="edit" url="${editContactURL}" />  


     <%-- Delete. --%>

	     <portlet:actionURL name="<%=MVCCommandKeys.DELETE_CONTACT %>" var="deleteContactURL">
	         <portlet:param name="redirect" value="${currentURL}" />
	         <portlet:param name="contactId" value="${contact.contactId}" />
	     </portlet:actionURL>
	
	     <liferay-ui:icon-delete url="${deleteContactURL}" />



 </liferay-ui:icon-menu>