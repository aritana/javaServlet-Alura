package gerenciador.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresasServelet
 */
@WebServlet("/listaEmpresas")
public class ListaEmpresasServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa>lista = banco.getEmpresas();

		String destiny = "/listaEmpresas.jsp";
		RequestDispatcher rd =  request.getRequestDispatcher(destiny);
		request.setAttribute("listaEmpresas", lista);
		rd.forward(request, response);		
		
	}

}
