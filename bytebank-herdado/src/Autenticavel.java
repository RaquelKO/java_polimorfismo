
// contrato Autenticavel
	// quem assina esse contrato, precisa implementar
		// m�todo setSenha
		// m�todo autentica
public abstract interface Autenticavel{

	// Numa interface tudo deve ser abstrato
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
