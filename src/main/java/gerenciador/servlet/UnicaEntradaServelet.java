package gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gerenciador.acao.AlterarEmpresa;
import gerenciador.acao.ListarEmpresas;
import gerenciador.acao.MostrarEmpresas;
import gerenciador.acao.NovaEmpresa;
import gerenciador.acao.RemoverEmpresas;

@WebServlet("/entrada")
public class UnicaEntradaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");

		switch (paramAcao) {
		case "listarEmpresas":

			System.out.println("Listando empresas");
			ListarEmpresas listarEmpresas = new ListarEmpresas();
			listarEmpresas.executa(request, response);
			break;

		case "removerEmpresa":

			System.out.println("Remover empresa");
			RemoverEmpresas removerEmpresas = new RemoverEmpresas();
			removerEmpresas.executa(request, response);
			break;
		
		case "mostrarEmpresa":

			System.out.println("Mostrar empresa");
			MostrarEmpresas mostrarEmpresas = new MostrarEmpresas();
			mostrarEmpresas.executa(request, response);
			break;
			
		case "alterarEmpresa":

			System.out.println("Alterar empresa");
			AlterarEmpresa alterarEmpresa = new AlterarEmpresa();
			alterarEmpresa.executa(request, response);
			break;
			
		case "novaEmpresa":
			System.out.println("Cadastrando nova empresa");
			NovaEmpresa novaEmpresa = new NovaEmpresa();
			novaEmpresa.executa(request, response);
			break;
			
			
		}

	}

}
