<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkServeletNovaEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action = "${linkServeletNovaEmpresa }" method="post">
		Nome da Empresa: <input type="text" name="nome"/>
		CEO: <input type="text" name="ceo"/>
		Data Abertura: <input type="text" name="data"/>
		<input type="hidden" name="acao" value="novaEmpresa" />
		<input type="submit"/>
		
	</form>
</body>
</html>