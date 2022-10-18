<%@ include file="../init.jsp"%>


<%--  <liferay-ui:error key="serviceErrorDetails">
     <liferay-ui:message key="error.contact-service-error" arguments='<%= SessionErrors.get(liferayPortletRequest, "serviceErrorDetails") %>' />
 </liferay-ui:error>
 <liferay-ui:error key="contactTitleEmpty" message="error.contact-title-empty" />
 <liferay-ui:error key="contactDescriptionEmpty" message="error.contact-description-empty" /> --%>

<%-- Generate add / edit action URL and set title. --%>

 <c:choose>
	<c:when test="${not empty contact}">
		<portlet:actionURL var="contactActionURL"
			name="<%=MVCCommandKeys.UPDATE_CONTACT%>">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>

		<c:set var="editTitle" value="edit-contact" />
	</c:when>
	<c:otherwise>
		<portlet:actionURL var="contactActionURL"
			name="<%=MVCCommandKeys.ADD_CONTACT%>">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>

		<c:set var="editTitle" value="add-contact" />
	</c:otherwise>
</c:choose> 
<%--
<portlet:actionURL var="contactActionURL"
			name="<%=MVCCommandKeys.ADD_CONTACT%>">
			<portlet:param name="redirect" value="${param.redirect}" />
			<portlet:param name="testamentId" value="${testament.testamentId}" />
</portlet:actionURL> --%>

<div class="container-fluid-1280 edit-contact">

	<h1>
		<liferay-ui:message key="${editTitle}" />
	</h1>

	<aui:model-context bean="${contact}" model="${contactClass}" />

	<aui:form action="${contactActionURL}" method="post"
		enctype="multipart/form-data" name="fm">

		<aui:input name="testamentId" type="hidden"
                value="${testament.testamentId}" />	
		<aui:input name="contactId" field="contactId" type="hidden" /> 


		<aui:fieldset-group markupView="lexicon">

			<aui:fieldset>



				<aui:input name="email" label="contact-email" required="true">
				</aui:input>

				<aui:input name="name" label="contact-name" required="true">
				</aui:input>
				
				<aui:input name="phoneNumber" label="contact-phoneNumber" required="true">
				</aui:input>



			</aui:fieldset>
		</aui:fieldset-group>

		<%--Buttons. --%>

		<aui:button-row>
			<aui:button cssClass="btn btn-primary" type="submit" />
			<aui:button cssClass="btn btn-secondary" onClick="${param.redirect}"
				type="cancel" />
		</aui:button-row>
	</aui:form>

</div>