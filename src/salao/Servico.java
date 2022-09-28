package salao;

public class Servico {
	private int id;
	private String nome;
	private double valor;
	private String descricao;
	
	public Servico () {
		
	}
	
	
	public Servico(int id, String nome, double valor, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id > 0)
			this.id = id;
		else 
			System.out.println("Valor informado menor que zero.");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 4)
			this.nome = nome;
		else
			System.out.println("Tamanho de nome invalido.");
	}
	public double getValor() {
		return valor;
	}
	protected void setValor(double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if(descricao.length() > 4)
			this.descricao= descricao;
		else
			System.out.println("Tamanho de descricao invalido.");
	}
	
	
	
}
