package salao;

import java.util.ArrayList;
import java.util.Calendar;

public class Atendimento {
	private Cliente cliente;
	private Calendar data;
	private ArrayList<Servico> servicos;
	private Cabelereiro cabelereiro;

	public Atendimento() {
		super();
	}
	
	
	
	
	public Atendimento(Cliente cliente, Cabelereiro cabelereiro) {
		super();
		this.cliente = cliente;
		this.cabelereiro = cabelereiro;
	}




	public Atendimento(Cliente cliente) {
		this.cliente = cliente;
		this.data = Calendar.getInstance();
	}

	public ArrayList<Servico> getServico() {
		return servicos;
	}

	public void addServico(Servico servico) {
		servicos.add(servico);
	}

	public Cabelereiro getCabelereiro() {
		return cabelereiro;
	}

	public void setCabelereiro(Cabelereiro cabelereiro) {
		this.cabelereiro = cabelereiro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Calendar getData() {
		return data;
	}
	
	
}
