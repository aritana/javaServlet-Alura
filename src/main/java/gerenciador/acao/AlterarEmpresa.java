package gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gerenciador.modelo.Banco;
import gerenciador.modelo.Empresa;

public class AlterarEmpresa  implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Alterando empresa");

		String nomeEmpresa = request.getParameter("nome");
		String ceo = request.getParameter("ceo");
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

		return "redirect:entrada?acao=ListarEmpresas";

	}

}
