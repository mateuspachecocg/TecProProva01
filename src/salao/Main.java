package salao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static Scanner inputPrincipal = new Scanner(System.in);
	// Criando a persistência de dados
	public static ArrayList<Cliente> listCliente = new ArrayList<Cliente>();
	public static ArrayList<Cabelereiro> listCabelereiro = new ArrayList<Cabelereiro>();
	public static ArrayList<Servico> listServico = new ArrayList<Servico>();
	public static ArrayList<Atendimento> listAtendimento = new ArrayList<Atendimento>();
	public static ArrayList<Agendamento> listAgendamento = new ArrayList<Agendamento>();

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
		// Instanciando atendimento
		Atendimento atendimento1 = new Atendimento(cl1);
		Atendimento atendimento2 = new Atendimento(cl2);
		Atendimento atendimento3 = new Atendimento(cl3);
		// Instanciando Agendamento
		Agendamento agendamento1 = new Agendamento(cl1, cabelereiro1);
		Agendamento agendamento2 = new Agendamento(cl2, cabelereiro2);
		Agendamento agendamento3 = new Agendamento(cl3, cabelereiro3);

		// Criando interface de cadastro

		int control = 1;
		while (control != 0) {
			menuPrincipal();
			control = Integer.parseInt(inputPrincipal.nextLine());
			switch (control) {
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

	// PART B: QUESTION 01
	public static double calcValorAPagar(Cliente c, Atendimento atendimento) {
		double valorAPagar = 0;
		for (Servico serv : atendimento.getServico()) {
			valorAPagar += serv.getValor();
		}

		return valorAPagar;
	}

	// PART B: QUESTION 02
	public static int numberRequestedServices(int id) {
		int numberResquestedServices = 0;
		for (Atendimento atendimento : listAtendimento) {
			if (atendimento.getCliente().getId() == id) {
				numberResquestedServices += atendimento.getServico().size();
			}
		}
		return numberResquestedServices;
	}

	// PART B: QUESTION 03
	public static boolean haveClienteEqualCabelereiroName() {
		boolean testResult = true;
		for (Cliente cliente : listCliente) {
			for (Cabelereiro cabelereiro : listCabelereiro) {
				testResult = testResult && !(cliente.getNome().equals(cabelereiro.getNome()));
			}
		}
		return testResult;
	}

	// PART B: QUESTION 04
	public static String whoIsTheSpender() {

		String name = "";
		Double mostWasted = -1.0;
		Double wastedWithServices;

		for (Cliente cliente : listCliente) {
			wastedWithServices = 0.0;
			for (Atendimento atendimento : listAtendimento) {
				if (atendimento.getCliente().getId() == cliente.getId()) {
					wastedWithServices += calcValorAPagar(cliente, atendimento);
				}
			}

			if (wastedWithServices > mostWasted) {
				mostWasted = wastedWithServices;
				name = cliente.getNome();
			}
		}
		return name;
	}
	
	// PART B: QUESTION 05
	public static Cabelereiro cabelereiroMostActive() {
		
		Cabelereiro cabelereiroMostActive = null;
		int theMostActivity = -1;
		int activityCount;
		for(Cabelereiro cabelereiro : listCabelereiro) {
			activityCount = 0;
			for(Agendamento agendamento : listAgendamento) {
				if(agendamento.getCabelereiro().getId() == cabelereiro.getId()) {
					activityCount++;
				}
			}
			
			if (activityCount > theMostActivity) {
				theMostActivity = activityCount;
				cabelereiroMostActive = cabelereiro;
			}
		}
		
		return cabelereiroMostActive;
	}
	
	// PART B: QUESTION 06
	public static ArrayList<Servico> getServicesByDate(int day, int hour, int minute) {
		Calendar dataTal;
		dataTal = Calendar.getInstance();
		dataTal.set(22, 30, 25);
		
		ArrayList<Servico> servicosOfTheDay = new ArrayList<Servico>();
		for(Agendamento agendamento : listAgendamento) {
			Calendar dataDoAgendamento = agendamento.getData();
			if(dataDoAgendamento.DAY_OF_MONTH == day && dataDoAgendamento.HOUR_OF_DAY == hour && dataDoAgendamento.MINUTE == minute) {
				
			}
		}
		
		return null;
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
		System.out.println();

	}

	public static void cadastrarAgendamento() {
		System.out.println("------------------------- CADASTRO DE AGENDAMENTO -------------------------");
		System.out.print("\nID DO CLIENTE:");
		int idCliente = Integer.parseInt(inputPrincipal.nextLine());
		System.out.print("\nID DO CABELEREIRO:");
		int idCabelereiro = Integer.parseInt(inputPrincipal.nextLine());
		// Pedir a data

		listAgendamento.add(new Agendamento(listCliente.get(idCliente), listCabelereiro.get(idCabelereiro)));
	}

	public static void cadastrarAtendimento() {
		System.out.println("------------------------- CADASTRO DE ATENDIMENTO -------------------------");
		System.out.print("\nID DO CLIENTE:");
		int idCliente = Integer.parseInt(inputPrincipal.nextLine());
		System.out.print("\nID DO CABELEREIRO:");
		int idCabelereiro = Integer.parseInt(inputPrincipal.nextLine());

		Atendimento novoAtendimento = new Atendimento(listCliente.get(idCliente), listCabelereiro.get(idCabelereiro));

		System.out.print("\nQUANTOS SERVICOS SERAO REALIZADOS:");
		int quantServicos = Integer.parseInt(inputPrincipal.nextLine());
		for (int i = 0; i < quantServicos; i++) {
			System.out.printf("\nID DO %d° SERVICO:", i + 1);
			int id = Integer.parseInt(inputPrincipal.nextLine());
			novoAtendimento.addServico(listServico.get(id));
		}

		listAtendimento.add(novoAtendimento);
	}

	public static void cadastrarServico() {
		System.out.println("------------------------- CADASTRO DE SERVICO -------------------------");
		System.out.print("ID DO SERVICO:");
		int id = Integer.parseInt(inputPrincipal.nextLine());
		System.out.print("\nNOME DO SERVICO:");
		String nome = inputPrincipal.nextLine();
		System.out.print("\nVALOR DO SERIVCO: ");
		double valor = Double.parseDouble(inputPrincipal.nextLine());
		System.out.print("\nDESCRICAO DO SERVICO:");
		String descricao = inputPrincipal.nextLine();
		listServico.add(new Servico(id, nome, valor, descricao));
	}

	public static void cadastrarCabelereiro() {
		System.out.println("------------------------- CADASTRO DE CABELEREIRO -------------------------");
		System.out.println("NOME DO CABELEREIRO:");
		String nome = inputPrincipal.nextLine();
		System.out.println("CPF DO CABELEREIRO:");
		String cpf = inputPrincipal.nextLine();

		listCabelereiro.add(new Cabelereiro(nome, cpf));
	}

	public static void cadastrarCliente() {
		System.out.println("------------------------- CADASTRO DE CLIENTE -------------------------");
		System.out.println("NOME DO CLIENTE:");
		String nome = inputPrincipal.nextLine();
		System.out.println("CPF DO CLIENTE:");
		String cpf = inputPrincipal.nextLine();
		listCliente.add(new Cliente(nome, cpf));
	}

}
