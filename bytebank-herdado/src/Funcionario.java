
// nao pode instanciar objetos dessa classe, pq é abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario; // o protected torna o atributo publico somente para os filhos
	
	/*
	public Funcionario() {
		// o método construtor sempre tem o nome da classe, mas ele não retorna nada
		// construtor padrão do compilador
	}
	
	public double getBonificacao() {
		return this.salario * 0.05;
	}*/
	
	// método sem corpo, não há implementação na classe mãe
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
