<%@ include file="../init.jsp"%>

 <c:set var="testament" value="${SEARCH_CONTAINER_RESULT_ROW.object}" />

 <liferay-ui:icon-menu markupView="lexicon">

     <%-- View. --%>

	     <portlet:renderURL var="viewTestamentURL">
	         <portlet:param name="mvcRenderCommandName"
	             value="<%=MVCCommandKeys.VIEW_TESTAMENT %>" />
	         <portlet:param name="redirect" value="${currentURL}" />
	         <portlet:param name="testamentId" value="${testament.testamentId}" />
	     </portlet:renderURL>
	
	     <liferay-ui:icon message="view" url="${viewTestamentURL}" />


     <%-- Edit. --%>

	     <portlet:renderURL var="editTestamentURL">
	         <portlet:param name="mvcRenderCommandName"
	             value="<%=MVCCommandKeys.UPDATE_TESTAMENT %>" />
	         <portlet:param name="redirect" value="${currentURL}" />
	         <portlet:param name="testamentId" value="${testament.testamentId}" />
	     </portlet:renderURL>

     	<liferay-ui:icon message="edit" url="${editTestamentURL}" />  


     <%-- Delete. --%>

	     <portlet:actionURL name="<%=MVCCommandKeys.DELETE_TESTAMENT %>" var="deleteTestamentURL">
	         <portlet:param name="redirect" value="${currentURL}" />
	         <portlet:param name="testamentId" value="${testament.testamentId}" />
	     </portlet:actionURL>
	
	     <liferay-ui:icon-delete url="${deleteTestamentURL}" />
	     
	     
	 <%-- Update Time. --%>

	     <portlet:actionURL name="<%=MVCCommandKeys.UPDATE_TESTAMENTTIME %>" var="updateTestamentTimeURL">
	         <portlet:param name="redirect" value="${currentURL}" />
	         <portlet:param name="testamentId" value="${testament.testamentId}" />
	     </portlet:actionURL>
	
	     <liferay-ui:icon message="Update Time" url="${updateTestamentTimeURL}" />    

	
     <%-- Manage Contacts . --%>
     
     <portlet:renderURL var="viewContactURL">
         <portlet:param name="mvcRenderCommandName"
             value="<%=MVCCommandKeys.VIEW_CONTACTS %>" />
         <portlet:param name="redirect" value="${currentURL}" />
         <portlet:param name="testamentId" value="${testament.testamentId}" />
     </portlet:renderURL>
     <liferay-ui:icon message="Contacts" url="${viewContactURL}" />   


 </liferay-ui:icon-menu>