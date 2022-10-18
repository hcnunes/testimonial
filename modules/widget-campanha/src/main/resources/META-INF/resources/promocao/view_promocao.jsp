<%@ include file="../init.jsp"%>

<portlet:resourceURL id="<%=MVCCommandKeys.CEP%>" var="cepBuscaUrl"> 
     		      
</portlet:resourceURL>

<portlet:renderURL var="addParticipanteURL">
				<portlet:param name="mvcRenderCommandName"
					value="<%=MVCCommandKeys.ADD_PARTICIPANTE%>" />
				<portlet:param name="redirect" value="${currentURL}" />
				<portlet:param name="promocaoId" value="${promocao.promocaoId}" />
</portlet:renderURL> 


<div class="container-fluid-1280">
	
	<div>

		<h1>${promocao.getNome()}</h1>
		
		<input name="cepUser" label="cepUser" id="cepUser"
	                type="text" style="width:120px"/>
	                
		<button class="btn btn-primary" type="submit" 
					id="btnCepUser"> Checar </button>
		
		<div id="logradouroUser"></div>
		<div id="bairroUser"></div>
		<div id="localidadeUser"></div>
		<div id="ufUser"></div>
		<div id="checagemResposta"></div>
		
	</div>

	<div class="promocao-metadata">

		<dl>
			<dt>
				<liferay-ui:message key="promocao-descricao" />
			</dt>
			<dd>${promocao.getDescricao()}</dd>

			<dt>
				<liferay-ui:message key="promocao-imagem" />
			</dt>
			<img SRC="${promocao.getFileUrl()}" width="200" height="200">
		</dl>

		<dl>
		 	

			<%-- Teste lógico de login --%>
			
			<c:if test="${signedIn}">
						 	
		 		<c:if test="${testeVerificacao}">
					<a class="button hidden" href="${addParticipanteURL}" id="btnParticipar"> Participar</a>	
				</c:if>
				<c:if test="${!testeVerificacao}">
					<a class="button-off" href="${param.redirect}"> Você já participa desta promoção</a>	
				</c:if>
					
			</c:if>
			<c:if test="${!signedIn}">
				<a class="button-off"
					href="/c/portal/login">
					Realize o Login para participar</a>
			</c:if>  

		</dl>

		<dl>
			<dt>
				<liferay-ui:message key="lista-premio" />
			</dt>
			
			<%-- Search container. --%>
			<liferay-ui:search-container
				emptyResultsMessage="Esta promoção ainda não possui prêmios cadastrados"
				id="premioEntries" iteratorURL="${portletURL}"
				total="${premioCount}">

				<liferay-ui:search-container-results results="${premios}" />

				<liferay-ui:search-container-row
					className="br.com.vertigo.estagio.campanha.model.Premio"
					modelVar="entryPremio">
					<%@ include file="/promocao/listar_premio.jspf"%>
				</liferay-ui:search-container-row>


				<%-- Iterator / Paging --%>
				<liferay-ui:search-iterator markupView="lexicon" />
			</liferay-ui:search-container>
		</dl>
	</div>
	
</div>

 <script>
 
	 $('#btnCepUser').on('click', function(){
	     let interna = $("#cepUser").val();

	     $.ajax('${cepBuscaUrl}&<portlet:namespace/>cep=' + interna,{
	         success: function(dds){
	        	 if(dds.ufChecagem == true){
	        		 $("#logradouroUser").text(dds.logradouro);
		             $("#bairroUser").text(dds.bairro);
		             $("#localidadeUser").text(dds.localidade);
		             $("#ufUser").text(dds.uf);
		             $("#checagemResposta").text("Campanha invalida para este Estado");
		             document.getElementById("btnParticipar").classList.remove("hidden");
		             $("#checagemResposta").text("");
		             
	        	 } else if (dds.ufChecagem == false) {
	        		 $("#checagemResposta").text("Campanha invalida para este Estado");
	        		 document.getElementById("btnParticipar").classList.add("hidden");
	        		 
	        	 } else {
	        		 $("#checagemResposta").text("Endereço não encontrado para este CEP");
	        		 document.getElementById("btnParticipar").classList.add("hidden");
	        	 }
	        	 
	         }
	     });
	 });  	
 
</script>


