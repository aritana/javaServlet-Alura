package gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServelet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa =  request.getParameter("nome");		
		String ceo =  request.getParameter("ceo");
		Empresa empresa = new Empresa();
		
		empresa.setNome(nomeEmpresa);
		empresa.setCeo(ceo);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);				
//chamar o JPS
		String destiny = "/novaEmpresaCriada.jsp";
		RequestDispatcher rd =  request.getRequestDispatcher(destiny);
		request.setAttribute("empresa", empresa.getNome());
		request.setAttribute("ceo", empresa.getCeo());
		rd.forward(request, response);

	}

}
