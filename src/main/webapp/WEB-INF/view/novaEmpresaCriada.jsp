<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>
		<c:import url="logout-partial.jsp"></c:import>
		<c:if test="${not empty empresa}">
			Empresa: ${empresa} | CEO ${ceo} - cadastro realizado com sucesso!
		</c:if>	
		 <c:if test="${empty empresa}">
			Nenhuma empresa cadastrada!
		</c:if>	
	</body>
</html>
		
	