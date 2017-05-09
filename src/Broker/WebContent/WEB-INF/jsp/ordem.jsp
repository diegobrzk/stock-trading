<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/ordem.js"></script>

<script type="text/javascript">
	var comprarOrdemUrl = '${comprarOrdemUrl}'
	var venderOrdemUrl = '${venderOrdemUrl}'
</script>

<c:choose>
	<c:when test="${statusPregao}">
		<div>
			<span>Valor:</span><br>
			<input id="valor" type="text"></input>
			<button id="comprarButton" type="button">Comprar</button>
			<button id="venderButton" type="button">Vender</button>
		</div>
	</c:when>
	<c:otherwise>
		<div>
			<span>Pregão não está disponível!</span>
		</div>
	</c:otherwise>
</c:choose>