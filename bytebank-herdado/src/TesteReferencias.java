
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		// String nome = g1.getNome();
		// System.out.println(nome);
		g1.setSalario(5000.00);
		
		// n?o funciona mais, pois agora a classe funcionario ? abstrata
		// Funcionario f = new Funcionario();
		// f.setSalario(2000.00);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		ev.setSalario(2000.0);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		// controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());

	}

}
