package br.acme.tests;
import br.acme.users.Motorista;

public class TesteMotorista {

	public static void main(String args[]){
		Motorista m1 = new Motorista(2,"56743218900","Motorista","outlook","f",true,null);
		System.out.println(m1.getId() + ";" + m1.getCpf() +";" + m1.getNome() +";" + m1.getEmail() + ";" + m1.getSexo());
		m1.setId(1);
		m1.setCpf("12365487901");
		m1.setNome("Driver");
		m1.setEmail("yahoo");
		m1.setSexo("m");
		m1.setDisponivel(false);
		System.out.println(m1.getId() + ";" + m1.getCpf() +";" + m1.getNome() +";" + m1.getEmail() + ";" + m1.getSexo());
	}

}
