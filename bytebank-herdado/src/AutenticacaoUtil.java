
public class AutenticacaoUtil {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	// O relacionamento entre a classe AutenticacaoUtil e o Cliente, Gerente e o Administrador � do tipo COMPOSI��O
	// O cliente, gerente e administrador TEM UM AutenticacaoUtil
	// A l�gica se encontra em apenas uma classe (AutenticacaoUtil), evitando a reutiliza��o de c�digo
}
