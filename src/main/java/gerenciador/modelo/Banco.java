package gerenciador.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	
	static {
		Empresa p1= new Empresa();
		Empresa p2 = new Empresa();
		p1.setNome("Gasmig");
		p1.setCeo("Fernando");
	    p1.setId(chaveSequencial++);
		p2.setNome("SuperGasBras");
		p2.setCeo("Junior Aparecido");
	    p2.setId(chaveSequencial++);
		lista.add(p1);
		lista.add(p2);
		
	}
	public void adiciona(Empresa empresa) {
		// TODO Auto-generated method stub
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
		
	}
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	public void removeEmpresa(Integer id) {
		// TODO Auto-generated method stub
		
		java.util.Iterator<Empresa> it  = lista.iterator();
		
		while(it.hasNext()) {
			Empresa empresa = it.next();
			if(empresa.getId()== id) {
				it.remove();
				
			}
		}		
		
	}
	public Empresa bucaEmpresaPeloId(Integer id) {
			
		for (Empresa empresa : lista) {
			if(empresa.getId()== id) {
				return empresa;
			}
		}
		return null;
		
	}
}
