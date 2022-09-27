package salao;

import java.util.Calendar;

public class Agendamento {
	private int id;
	private Calendar data;
	private Cliente cliente;
	private int hora;
	private int minuto;
	private Cabelereiro cabelereiro;
	
	public Agendamento(Cliente cliente, Cabelereiro cabelereiro) {
		this.cliente = cliente;
		this.cabelereiro = cabelereiro;
		this.data = Calendar.getInstance();
	}
	
	
}
