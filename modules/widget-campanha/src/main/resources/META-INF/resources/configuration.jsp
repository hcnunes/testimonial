<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="br.com.vertigo.estagio.campanha.web.configuration.CampanhaPortletInstanceConfiguration"%>
<%@ include file="./init.jsp"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<%
	CampanhaPortletInstanceConfiguration portletInstanceConfig = portletDisplay.getPortletInstanceConfiguration(CampanhaPortletInstanceConfiguration.class);
	pageContext.setAttribute("nomeCampanha", portletInstanceConfig.nomeCampanha());
	
	String[] listaDeUf = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
	String ufSelecionadas = String.join(" ", portletInstanceConfig.ufCampanha());
	
	System.out.println(ufSelecionadas);
%>

<liferay-portlet:actionURL portletConfiguration="<%= true %>"
	var="configurationActionURL" />

<liferay-portlet:renderURL portletConfiguration="<%= true %>"
	var="configurationRenderURL" />
	
<liferay-frontend:edit-form
	action="<%= configurationActionURL %>"
	method="post"
	name="fm"
>
	<aui:input name="<%=Constants.CMD%>" type="hidden"
		value="<%=Constants.UPDATE%>" />

	<aui:input name="redirect" type="hidden"
		value="<%=configurationRenderURL%>" />



	<liferay-frontend:edit-form-body>
		<liferay-frontend:fieldset-group>
			<liferay-frontend:fieldset>
				<aui:input label="config.nome-campanha" name="nomeCampanha" 
					value="${nomeCampanha}" required="true"></aui:input>
				
		        <aui:select label="config.uf-campanha" name="ufCampanha" multiple="true">
		      	  	<c:set var="selecionadasUf" value="<%=ufSelecionadas%>" ></c:set>
		      	  	
		      	  	<c:forEach var="uf" items="<%=listaDeUf%>" >
		      	  		<c:choose>
		      	  			<c:when test="${fn:contains(selecionadasUf, uf)}">
		      	  				<aui:option label="${uf}" style="background: #c5c5c5"></aui:option>
		      	  			</c:when>
		      	  			
		      	  			<c:otherwise>
		      	  				<aui:option label="${uf}"></aui:option>
		      	  			</c:otherwise>
		      	  		</c:choose>
		      	  	</c:forEach>
		      	  				
		        </aui:select>
			</liferay-frontend:fieldset>		
		</liferay-frontend:fieldset-group>	
	</liferay-frontend:edit-form-body>
	<liferay-frontend:edit-form-footer>
		<aui:button id="btnSalvar" value="Salvar"  type="submit" />

		<aui:button value="Cancelar" type="cancel" />
	</liferay-frontend:edit-form-footer>	
</liferay-frontend:edit-form>

<%-- 
<script>

	$('#<portlet:namespace/>btnSalvar').on('click', function(){
	    console.log('botao acionado');
	    
	    console.log(document.getElementById("DF"));
	    document.getElementById("GO").style.background = "#c2c2c2";
	    document.getElementById("CE").classList.add("selecionado");
	});

</script> --%>

