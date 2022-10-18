<%@ include file="../init.jsp"%>

<div class="container-fluid-1280">
	
	<br />
    <h1><liferay-ui:message key="participante-principal" /></h1>
    <br />
    
    <%-- Clay management toolbar. --%>

    <clay:management-toolbar
        disabled="${participanteCount eq 0}"
        displayContext="${participantesManagementToolbarDisplayContext}"
        itemsTotal="${participanteCount}"
        searchContainerId="participanteEntries"
        selectable="false"
    />

    <%-- Search container. --%>

    <liferay-ui:search-container 
        emptyResultsMessage="Nenhum participante foi adicionado"
        id="participanteEntries"
        iteratorURL="${portletURL}" 
        total="${participanteCount}">

        <liferay-ui:search-container-results results="${participantes}" />

        <liferay-ui:search-container-row
            className="br.com.vertigo.estagio.campanha.model.Participante"
            modelVar="entryParticipante">

            <%@ include file="/participante/entry_search_columns.jspf" %>

        </liferay-ui:search-container-row>

        <%-- Iterator / Paging --%>

        <liferay-ui:search-iterator 
            displayStyle="${participantesManagementToolbarDisplayContext.getDisplayStyle()}"
            markupView="lexicon" 
        />
    </liferay-ui:search-container>
</div>

