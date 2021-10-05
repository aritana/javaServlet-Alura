<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
%>

<%@page import="java.util.List" %>
<%@page import="gerenciador.servlet.Empresa"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%
	List<Empresa>lista =(List<Empresa>) request.getAttribute("listaEmpresas");
%>    

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de empresas</title>
</head>
<body>
	<ul>
		<c:forEach items="${listaEmpresas}" var="empresa" >
			
			<li>
				 ${empresa.nome} -  <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
			
				<a href="/gerenciador/removeEmpresa?id=${empresa.id}">Remove</a>
			</li>
		</c:forEach>
			
	</ul>
</body>
</html>