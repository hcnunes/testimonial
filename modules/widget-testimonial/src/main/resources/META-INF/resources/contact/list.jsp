<%@ include file="../init.jsp"%>

<p>
	<b><liferay-ui:message key="testimonial.caption"/></b>
</p>


<liferay-ui:error key="serviceErrorDetails">
    <liferay-ui:message arguments='<%= SessionErrors.get(liferayPortletRequest, 
    "serviceErrorDetails") %>' key="error.contact-service-error" />
</liferay-ui:error>
<liferay-ui:success key="contactAdded" message="contact-added-successfully" />
<liferay-ui:success key="contactUpdated" message="contact-updated-successfully" />
<liferay-ui:success key="contactDeleted" message="contact-deleted-successfully" />

<div class="container-fluid-1280">

    <h1><liferay-ui:message key="contacts" /></h1>

    <%-- Clay management toolbar. --%>

    <clay:management-toolbar
        disabled="${contactCount eq 0}"
        displayContext="${contactsManagementToolbarDisplayContext}"
        itemsTotal="${contactCount}"
        searchContainerId="contactEntries"
        selectable="false"
    />

    <%-- Search container. --%>

    <liferay-ui:search-container 
        emptyResultsMessage="no-contacts"
        id="contactEntries"
        iteratorURL="${portletURL}" 
        total="${contactCount}">

        <liferay-ui:search-container-results results="${contacts}" />

        <liferay-ui:search-container-row
            className="com.liferay.testimonial.model.Contact"
            modelVar="entry">

            <%@ include file="/contact/entry_search_columns.jspf" %>

        </liferay-ui:search-container-row>

        <%-- Iterator / Paging --%>

        <liferay-ui:search-iterator 
            displayStyle="${contactsManagementToolbarDisplayContext.getDisplayStyle()}"
            markupView="lexicon" 
        />
    </liferay-ui:search-container>
</div>