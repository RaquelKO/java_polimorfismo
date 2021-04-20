
public class ContaCorrente extends Conta implements Tributavel {
	// herda atributos e métodos mas não herda construtores
	
	//new ContaCorrente()
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); // chamada do construtor da classe mãe
	}
	
	@Override //anotação, configuração para o compilador
	public boolean saca(double valor) {
		double valorASacar =  valor + 0.2;
		return super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
