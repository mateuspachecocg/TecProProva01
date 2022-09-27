package salao;

import java.util.Calendar;

public class Atendimento {
	private Cliente cliente;
	private Calendar data;
	private Servico servico[];
	private Cabelereiro cabelereiro;
	
	public Atendimento(Cliente cliente) {
		this.cliente = cliente;
		this.data = Calendar.getInstance();
	}

	public Servico[] getServico() {
		return servico;
	}

	public void setServico(Servico[] servico) {
		this.servico = servico;
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
