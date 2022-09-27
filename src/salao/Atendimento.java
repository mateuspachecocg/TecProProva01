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
}
