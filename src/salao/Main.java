package salao;

public class Main {

	public static void main(String[] args) {
		// Instanciando clientes
		Cliente cl1 = new Cliente("61046998390");
		Cliente cl2 = new Cliente("61046994444");
		Cliente cl3 = new Cliente("61045555550");
		// Instanciando cabelereiro
		Cabelereiro cabelereiro1 = new Cabelereiro("Danilo", "22222222222");
		Cabelereiro cabelereiro2 = new Cabelereiro("Danilo", "77777777777");
		Cabelereiro cabelereiro3 = new Cabelereiro("Danilo", "99999999999");
		// Instanciando Servicos
		Servico servico1 = new Servico();
		Servico servico2 = new Servico();
		Servico servico3 = new Servico();
		//Instanciando atendimento
		Atendimento atendimento1 = new Atendimento(cl1);
		Atendimento atendimento2 = new Atendimento(cl2);
		Atendimento atendimento3 = new Atendimento(cl3);
		//Instanciando Agendamento
		Agendamento agendamento1 = new Agendamento(cl1, cabelereiro1);
		Agendamento agendamento2 = new Agendamento(cl2, cabelereiro2);
		Agendamento agendamento3 = new Agendamento(cl3, cabelereiro3);
	
	
	}

}
