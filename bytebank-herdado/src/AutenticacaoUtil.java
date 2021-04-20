
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
	
	// O relacionamento entre a classe AutenticacaoUtil e o Cliente, Gerente e o Administrador é do tipo COMPOSIÇÃO
	// O cliente, gerente e administrador TEM UM AutenticacaoUtil
	// A lógica se encontra em apenas uma classe (AutenticacaoUtil), evitando a reutilização de código
}
