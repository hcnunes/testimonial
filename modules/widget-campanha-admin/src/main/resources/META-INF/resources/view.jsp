<%@ include file="./init.jsp"%>
	
<div class="container-fluid-1280">
	
	<br />
    <h1><liferay-ui:message key="campanhaadmin.caption" /></h1>
    <br />
    
    <%-- Clay management toolbar. --%>

    <clay:management-toolbar
        disabled="${promocaoCount eq 0}"
        displayContext="${promocaosManagementToolbarDisplayContext}"
        itemsTotal="${promocaoCount}"
        searchContainerId="promocaoEntries"
        selectable="false"
    />

    <%-- Search container. --%>

    <liferay-ui:search-container 
        emptyResultsMessage="Nenhuma promoção foi adicionada"
        id="promocaoEntries"
        iteratorURL="${portletURL}" 
        total="${promocaoCount}">

        <liferay-ui:search-container-results results="${promocaos}" />

        <liferay-ui:search-container-row
            className="br.com.vertigo.estagio.campanha.model.Promocao"
            modelVar="entry">

            <%@ include file="/promocao/entry_search_columns.jspf" %>

        </liferay-ui:search-container-row>

        <%-- Iterator / Paging --%>

        <liferay-ui:search-iterator 
            displayStyle="${promocaosManagementToolbarDisplayContext.getDisplayStyle()}"
            markupView="lexicon" 
        />
    </liferay-ui:search-container>
</div>
