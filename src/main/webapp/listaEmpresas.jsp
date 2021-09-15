<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
%>

<%@page import="java.util.List" %>
<%@page import="gerenciador.servlet.Empresa" %>
    
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
		<% for (Empresa empresa : lista) {%>
		<li>
			 <%=empresa.getNome()%>
		</li>
		<% } %>
		
	</ul>
</body>
</html>