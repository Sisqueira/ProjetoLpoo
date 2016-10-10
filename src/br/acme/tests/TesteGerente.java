package br.acme.tests;
import br.acme.users.Gerente;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente(1, "12345678910", "nome", "email", "m");
		System.out.println(g1.getId() + ";" + g1.getCpf() + ";" + g1.getNome() + ";" + g1.getEmail() + ";" +g1.getSexo());
		g1.setId(2);
		g1.setCpf("01234567891");
		g1.setNome("name");
		g1.setEmail("gmail");
		g1.setSexo("f");
		System.out.println(g1.getId() + ";" + g1.getCpf() + ";" + g1.getNome() + ";" + g1.getEmail() + ";" +g1.getSexo());
	}

}
