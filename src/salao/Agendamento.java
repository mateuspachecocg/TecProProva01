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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public Calendar getData() {
		return data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Cabelereiro getCabelereiro() {
		return cabelereiro;
	}
	
	
}
