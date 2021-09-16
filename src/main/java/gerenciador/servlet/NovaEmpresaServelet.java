package gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		String data = request.getParameter("data");
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
				
		empresa.setNome(nomeEmpresa);
		empresa.setCeo(ceo);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);				
//chamar o JPS
		response.sendRedirect("listaEmpresas");
	/*	String destiny = "/listaEmpresas";
		RequestDispatcher rd =  request.getRequestDispatcher(destiny);
		request.setAttribute("empresa", empresa.getNome());
		request.setAttribute("ceo", empresa.getCeo());
		rd.forward(request, response);*/

	}

}
