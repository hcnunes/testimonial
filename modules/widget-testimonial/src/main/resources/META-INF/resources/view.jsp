<%@ include file="./init.jsp"%>

<p>
	<b><liferay-ui:message key="testimonial.caption"/></b>
</p>


<liferay-ui:error key="serviceErrorDetails">
    <liferay-ui:message arguments='<%= SessionErrors.get(liferayPortletRequest, 
    "serviceErrorDetails") %>' key="error.testament-service-error" />
</liferay-ui:error>
<liferay-ui:success key="testamentAdded" message="testament-added-successfully" />
<liferay-ui:success key="testamentUpdated" message="testament-updated-successfully" />
<liferay-ui:success key="testamentDeleted" message="testament-deleted-successfully" />

<div class="container-fluid-1280">

    <h1><liferay-ui:message key="testaments" /></h1>

    <%-- Clay management toolbar. --%>

    <clay:management-toolbar
        disabled="${testamentCount eq 0}"
        displayContext="${testamentsManagementToolbarDisplayContext}"
        itemsTotal="${testamentCount}"
        searchContainerId="testamentEntries"
        selectable="false"
    />

    <%-- Search container. --%>

    <liferay-ui:search-container 
        emptyResultsMessage="no-testaments"
        id="testamentEntries"
        iteratorURL="${portletURL}" 
        total="${testamentCount}">

        <liferay-ui:search-container-results results="${testaments}" />

        <liferay-ui:search-container-row
            className="com.liferay.testimonial.model.Testament"
            modelVar="entry">

            <%@ include file="/testament/entry_search_columns.jspf" %>

        </liferay-ui:search-container-row>

        <%-- Iterator / Paging --%>

        <liferay-ui:search-iterator 
            displayStyle="${testamentsManagementToolbarDisplayContext.getDisplayStyle()}"
            markupView="lexicon" 
        />
    </liferay-ui:search-container>
</div>