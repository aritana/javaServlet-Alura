package gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gerenciador.modelo.Banco;
import gerenciador.modelo.Empresa;

public class ListarEmpresas {

	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Listando empresas");
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();

		String destiny = "/listaEmpresas.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(destiny);
		request.setAttribute("listaEmpresas", lista);
		rd.forward(request, response);
	}

}
