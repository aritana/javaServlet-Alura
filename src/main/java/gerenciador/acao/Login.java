package gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import gerenciador.modelo.Banco;
import gerenciador.modelo.Usuario;

public class Login implements Acao {
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");


		Banco banco = new Banco();
		Usuario usuario = banco.existeUsuario(login, senha);
		
		if (usuario != null) {
			System.out.println("Usuário Existe!");
			HttpSession sessao = request.getSession();
			//mesmo navegador mesmo http session		
			sessao.setAttribute("usuarioLogado", usuario);
			return "redirect:entrada?acao=ListarEmpresas";
		}
		System.out.println("Usuário Não Existe!");
		return "redirect:entrada?acao=LoginForm";
	
	}
	
}
