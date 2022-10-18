<%@ include file="../init.jsp"%>


<%--  <liferay-ui:error key="serviceErrorDetails">
     <liferay-ui:message key="error.testament-service-error" arguments='<%= SessionErrors.get(liferayPortletRequest, "serviceErrorDetails") %>' />
 </liferay-ui:error>
 <liferay-ui:error key="testamentTitleEmpty" message="error.testament-title-empty" />
 <liferay-ui:error key="testamentDescriptionEmpty" message="error.testament-description-empty" /> --%>

<%-- Generate add / edit action URL and set title. --%>

<c:choose>
	<c:when test="${not empty testament}">
		<portlet:actionURL var="testamentActionURL"
			name="<%=MVCCommandKeys.UPDATE_TESTAMENT%>">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>

		<c:set var="editTitle" value="edit-testament" />
	</c:when>
	<c:otherwise>
		<portlet:actionURL var="testamentActionURL"
			name="<%=MVCCommandKeys.ADD_TESTAMENT%>">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>

		<c:set var="editTitle" value="add-testament" />
	</c:otherwise>
</c:choose>

<div class="container-fluid-1280 edit-testament">

	<h1>
		<liferay-ui:message key="${editTitle}" />
	</h1>

	<aui:model-context bean="${testament}" model="${testamentClass}" />

	<aui:form action="${testamentActionURL}" method="post"
		enctype="multipart/form-data" name="fm">

		<aui:input name="testamentId" field="testamentId" type="hidden" /> 

		<aui:fieldset-group markupView="lexicon">

			<aui:fieldset>

				<aui:input name="title" label="testament-title" required="true">
				</aui:input>

				<aui:input name="message" label="testament-message" required="true">
				</aui:input>

				<aui:input name="dueDate" label="testament-dueDate" type="date"
					required="true" value="${testament.dueDate}">
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