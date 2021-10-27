<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkServeletAlteraEmpresa"/>


<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="logout-partial.jsp"></c:import>
	<form action = "${linkServeletAlteraEmpresa}" method="post">
		Nome da Empresa: <input type="text" name="nome" value="${empresa.nome}"/>
		CEO: <input type="text" name="ceo" value="${empresa.ceo}"/>
		Data Abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>"/>
		<input type="hidden" name="id" value="${empresa.id}" />
		<input type="hidden" name="acao" value="AlterarEmpresa" />
		<input type="submit"/>
		
	</form>
</body>
</html>