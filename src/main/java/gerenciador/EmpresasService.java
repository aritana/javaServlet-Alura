package gerenciador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import gerenciador.modelo.Banco;
import gerenciador.modelo.Empresa;

/**
 * Servlet implementation class EmpresasService
 */
@WebServlet("/empresas")
public class EmpresasService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String type = request.getHeader("Accept");
		System.out.println(type);
		
		if (type.contains("xml")) {
			System.out.println("processando via xml");
			List<Empresa> empresas = new Banco().getEmpresas();
			XStream xstream = new XStream();
			xstream.alias("empresa", Empresa.class);
			String xml = xstream.toXML(empresas);
			response.setContentType("application/xml");
			response.getWriter().print(xml);

		} else if (type.contains("json")) {
			System.out.println("processando via json");
			List<Empresa> empresas = new Banco().getEmpresas();
			Gson gson = new Gson();
			String json = gson.toJson(empresas);
			response.setContentType("application/json");
			response.getWriter().print(json);
			
		}
		else {
			response.setContentType("application/json");
			response.getWriter().print("'message': 'no content'");
		}

	}

}
