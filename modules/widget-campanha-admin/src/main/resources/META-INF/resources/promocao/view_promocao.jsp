 <%@ include file="../init.jsp"%>

<portlet:resourceURL id="/ajax/contagem" var="contagemURL"> 
     		     <portlet:param name="promocaoId" value="${promocao.promocaoId}" />
</portlet:resourceURL>

 <div class="container-fluid-1280">

     <h1>${promocao.getNome()}</h1>

     <h2><liferay-ui:message key="promocao-information" /></h2>

     <div class="promocao-metadata">

         <dl>
             <dt><liferay-ui:message key="promocao-created" /></dt>
             <dd>${createDate}</dd>

             <dt><liferay-ui:message key="promocao-created-by" /></dt>
             <dd>${promocao.userName}</dd>

             <dt><liferay-ui:message key="promocao-dataInicio" /></dt>
             <dd>${dataInicio}</dd>
             
             <dt><liferay-ui:message key="promocao-dataTermino" /></dt>
             <dd>${dataTermino}</dd>

             <dt><liferay-ui:message key="promocao-descricao" /></dt>
             <dd>${promocao.getDescricao()}</dd>
             
             <dt><liferay-ui:message key="promocao-sorteado" /></dt>
             <dd>${promocao.getSorteado()}</dd>
             
             <dt><liferay-ui:message key="promocao-imagem" /></dt>
             <img SRC="${promocao.getFileUrl()}" width="200" height="200">

             
         </dl>
     </div>
     
     
     
     <div>
     
      	<h2 > Numero de participantes nesta promoção: <div id="quantidadeParticipantes"> ~Clique para gerar~ </div>   </h2>
     	
     	<a class="button" href="${contagemURL}"> Contagem</a>  	
     	
     </div>   
     
 </div>
 
 
 
 <script>
 
	 var interna = document.getElementById('quantidadeParticipantes');
	
	 interna.style.cursor = 'pointer';
	 interna.onclick = function() {
		 $.ajax({
     		url: '${contagemURL}',
     	<%--data: '${promocao.promocaoId}', --%>
     		type: 'POST',
     		dataType: "json",
     		success: function(data){
     			$("#quantidadeParticipantes").text(data.contagemParticipante);
     		}
     	});
	 };  	
</script>
     	
     	
     	