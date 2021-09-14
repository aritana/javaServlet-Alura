<%
	String nomeEmpresa = (String) request.getAttribute("empresa");	
    String ceoEmpresa = (String) request.getAttribute("ceo");
	System.out.println(nomeEmpresa);
%>

<html>
	<body>
		Empresa: <%= nomeEmpresa %> | CEO <%=ceoEmpresa%> cadastrada com sucesso!
	</body>
</html>
		
	