package gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServelet
 */
@WebServlet("/novaEmpresaServelet")
public class NovaEmpresaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Cadastrando nova empresa");		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Cadastro loja");
		out.println("</body>");
		out.println("</html>");
	}

}
