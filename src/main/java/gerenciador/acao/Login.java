package gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gerenciador.modelo.Banco;
import gerenciador.modelo.Usuario;

public class Login implements Acao {
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

/*
		Usuario usuario = new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(senha);
*/
		Banco banco = new Banco();
		//banco.adiciona(usuario);
		Usuario usuario = banco.existeUsuario(login, senha);
		
		if (usuario != null) {
			System.out.println("Usuário Existe!");
			return "redirect:entrada?acao=ListarEmpresas";
		}
		System.out.println("Usuário Não Existe!");
		return "redirect:entrada?acao=LoginForm";
		

	}

	private void existeUsuario(String login, String senha) {
		// TODO Auto-generated method stub
		
	}
	
}
