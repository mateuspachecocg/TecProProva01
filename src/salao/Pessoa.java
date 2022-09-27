package salao;

public class Pessoa {
	private int id;
	private String nome;
	private String cpf;
	
	public Pessoa(String cpf) {
		this.cpf = cpf;
	}
	
	public Pessoa(String nome,String cpf) {
		this.cpf = cpf;
		this.setNome(nome);
		
	}

	public void setNome(String nome) {
		if (nome.length() > 2)
			this.nome = nome;
		else 
			System.out.println("Nome muito pequeno");
	}
	
	protected void setId(int id) {
		if (id > 0)
			this.id = id;
		else 
			System.out.println("Esse id nao eh maior que zero.");
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	
}
