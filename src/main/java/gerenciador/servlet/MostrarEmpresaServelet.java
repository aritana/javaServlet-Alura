package gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gerenciador.modelo.Banco;
import gerenciador.modelo.Empresa;

/**
 * Servlet implementation class EditarEmpresa
 */
@WebServlet("/mostrarEmpresa")
public class MostrarEmpresaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);	
		System.out.println(id);
		
		Banco banco = new Banco();
		Empresa empresa = banco.bucaEmpresaPeloId(id);
		
		String destiny = "/formAlteraEmpresa.jsp";			
		RequestDispatcher rd =  request.getRequestDispatcher(destiny);
		
		request.setAttribute("empresa", empresa);
		rd.forward(request, response);	
	}

}
