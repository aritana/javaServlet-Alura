package gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@WebFilter("/entrada")//as requisicoes chegam primento no filtro antes do UnicaEntradaServlet
public class MonitoramentoFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Monitoramento Filter");
		long antes = System.currentTimeMillis();
		String acao = request.getParameter("acao");
		
		chain.doFilter(request, response);//vai para unicaEntrada faz tudo e volta
		
		long depois = System.currentTimeMillis();		
		
		System.out.println("tempo execucao da ação: "+acao +" tempo: "+ (depois - antes));

		
	}

}
