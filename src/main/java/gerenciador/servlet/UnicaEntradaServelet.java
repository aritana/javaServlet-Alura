package gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gerenciador.acao.ListarEmpresas;

@WebServlet("/entrada")
public class UnicaEntradaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");

		switch (paramAcao) {
		case "listarEmpresas":
			
			System.out.println("Listando empresas");
			ListarEmpresas acao = new ListarEmpresas();
			acao.executa(request, response);
			break;
			
		case "removerEmpresa":
			System.out.println("Remover empresa");
			break;
		case "mostrarEmpresa":
			System.out.println("Mostrar empresa");
			break;

		}

	}

}
