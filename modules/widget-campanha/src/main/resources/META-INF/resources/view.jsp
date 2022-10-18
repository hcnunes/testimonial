<%@ include file="./init.jsp"%>

<div class="promocao">
	
	<br />
    <h1> ${nomeCampanha} </h1>
    <br />
    

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

            <%@ include file="/promocao/listar.jspf" %>

        </liferay-ui:search-container-row>


        <%-- Iterator / Paging --%>

        <liferay-ui:search-iterator          
            markupView="lexicon" 
        />
    </liferay-ui:search-container>
 
</div>
