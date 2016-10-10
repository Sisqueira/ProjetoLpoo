package br.acme.tests;
import br.acme.users.Solicitante;

public class TesteSolicitante {
	
	public static void main(String args[]){
		Solicitante s1 = new Solicitante(1,"789","Nome","gmail","m","senha",null,888,null,null);
		System.out.println(s1.getId()+";" + s1.getCpf() + ";" + s1.getNome() + ";" + s1.getEmail() + ";" + s1.getSexo() + ";" + s1.getSenha() + ";" + s1.getDataNascimento() + ";" + s1.getNumeroCelular() + ";" + s1.getLugares() + ";" + s1.getViagens());
		s1.setId(2);
		s1.setCpf("345");
		s1.setNome("Name");
		s1.setEmail("outlook");
		s1.setSexo("f");
		s1.setSenha("password");
		s1.setDataNascimento(null);
		s1.setNumeroCelular(999);
		s1.setLugares(null);
		s1.setViagens(null);
		System.out.println(s1.getId()+";" + s1.getCpf() + ";" + s1.getNome() + ";" + s1.getEmail() + ";" + s1.getSexo() + ";" + s1.getSenha() + ";" + s1.getDataNascimento() + ";" + s1.getNumeroCelular() + ";" + s1.getLugares() + ";" + s1.getViagens());
	}
}
