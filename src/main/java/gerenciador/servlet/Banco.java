package gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa p1= new Empresa();
		Empresa p2 = new Empresa();
		p1.setNome("Gasmig");
		p1.setCeo("Fernando");
		p2.setNome("SuperGasBras");
		p2.setCeo("Junior Aparecido");
		lista.add(p1);
		lista.add(p2);
	}
	public void adiciona(Empresa empresa) {
		// TODO Auto-generated method stub
		lista.add(empresa);
		
	}
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
}
