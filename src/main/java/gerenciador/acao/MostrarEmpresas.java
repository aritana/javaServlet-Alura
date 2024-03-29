package gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gerenciador.modelo.Banco;
import gerenciador.modelo.Empresa;

public class MostrarEmpresas implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Mostrar empresa");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		System.out.println(id);

		Banco banco = new Banco();
		Empresa empresa = banco.bucaEmpresaPeloId(id);
		request.setAttribute("empresa", empresa);

		return "forward:formAlteraEmpresa.jsp";
	}

}
