<%@ include file="../init.jsp"%>

<div class="container-fluid-1280">
	
	<br />
    <h1><liferay-ui:message key="premio-principal" /></h1>
    <br />
    
    <%-- Clay management toolbar. --%>

    <clay:management-toolbar
        disabled="${premioCount eq 0}"
        displayContext="${premiosManagementToolbarDisplayContext}"
        itemsTotal="${premioCount}"
        searchContainerId="premioEntries"
        selectable="false"
    />

    <%-- Search container. --%>

    <liferay-ui:search-container 
        emptyResultsMessage="Nenhum premio foi adicionado"
        id="premioEntries"
        iteratorURL="${portletURL}" 
        total="${premioCount}">

        <liferay-ui:search-container-results results="${premios}" />

        <liferay-ui:search-container-row
            className="br.com.vertigo.estagio.campanha.model.Premio"
            modelVar="entryPremio">

            <%@ include file="/premio/entry_search_columns.jspf" %>

        </liferay-ui:search-container-row>

        <%-- Iterator / Paging --%>

        <liferay-ui:search-iterator 
            displayStyle="${premiosManagementToolbarDisplayContext.getDisplayStyle()}"
            markupView="lexicon" 
        />
    </liferay-ui:search-container>
</div>

