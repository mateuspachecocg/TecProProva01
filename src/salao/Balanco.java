package salao;

import java.util.ArrayList;

public class Balanco {
	
	private ArrayList<Servico> listaDeServicos;
	
	public Balanco() {
		this.listaDeServicos = new ArrayList<Servico>();
	}

	public ArrayList<Servico> getListaDeServicos() {
		return listaDeServicos;
	}

	public void addListaDeServicos(Servico servico) {
		this.listaDeServicos.add(servico);
	}
	
	
}
