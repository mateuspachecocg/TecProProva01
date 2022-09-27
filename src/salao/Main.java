package salao;

import java.util.Scanner;

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
		
		
		// Criando interface de cadastro
		
	
		Scanner inputPrincipal = new Scanner(System.in);
		int control = -1;
		while(control != 0) {
			menuPrincipal();
			control = inputPrincipal.nextInt();
			switch(control) {
				case 1:
					cadastrarCliente();
					break;
				case 2:
					cadastrarCabelereiro();
					break;
				case 3:
					cadastrarServico();
					break;
				case 4:
					cadastrarAtendimento();
					break;
				case 5:
					cadastrarAgendamento();
					break;
				case 0:
					control = 0;
					break;
			}
		}
	
		inputPrincipal.close();
	}
	
	public static void menuPrincipal() {
		System.out.println("------------------------- ESCOLHA UMA OPCAO -------------------------");
		System.out.println("1 - CADASTRAR CLIENTE");
		System.out.println("2 - CADASTRAR CABELEREIRO");
		System.out.println("3 - CADASTRAR SERVICO");
		System.out.println("4 - CADASTRAR ATENDIMENTO");
		System.out.println("5 - CADASTRAR AGENDAMENTO");
		System.out.println("0 - PARA SAIR DO PROGRAMA");
		System.out.print("ESCOLHA:");
		
	}
	
	public static Cliente cadastrarAgendamento() {
		Scanner input = new Scanner(System.in);
		
		
		input.close();
		
		return null;
	}
	
	public static Cliente cadastrarAtendimento() {
		Scanner input = new Scanner(System.in);
		
		
		input.close();
		
		return null;
	}
	
	public static Cliente cadastrarServico() {
		Scanner input = new Scanner(System.in);
		
		
		input.close();
		
		return null;
	}
	
	public static Cliente cadastrarCabelereiro() {
		Scanner input = new Scanner(System.in);
		
		input.close();
		
		return null;
	}
	
	public static Cliente cadastrarCliente() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("INFORME O NOME DO CLIENTE:");
		String nome = input.nextLine();
		System.out.println("INFORME O CPF DO CLIENTE:");
		String cpf= input.nextLine();
		
		input.close();
		
		return null;
	}

}
