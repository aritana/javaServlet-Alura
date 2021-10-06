package gerenciador.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;


/**
 * Servlet implementation class AlterarEmpresaServelet
 */
@WebServlet("/alterarEmpresa")
public class AlterarEmpresaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Alterando empresa");
		
		String nomeEmpresa =  request.getParameter("nome");		
		String ceo =  request.getParameter("ceo");
		String data = request.getParameter("data");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Date dataAbertura = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		
		Empresa empresa = banco.bucaEmpresaPeloId(id);
		empresa.setNome(nomeEmpresa);
		empresa.setCeo(ceo);
		empresa.setDataAbertura(dataAbertura);
		
		response.sendRedirect("listaEmpresas");			
	}
}
