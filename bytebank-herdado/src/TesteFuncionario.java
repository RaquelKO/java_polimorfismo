
public class TesteFuncionario {

	public static void main(String[] args) {
		
		// Funcionario nico = new Funcionario();
		// Funcionario nico = new Gerente();
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("223355656-9");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		//nico.salario = 3000.00;
	}

}
