package br.acme.tests;
import br.acme.location.Lugar;

public class TesteLugar {

	public static void main(String agrs[]){
		Lugar l1 = new Lugar("Rua A", "Boa Viagem");
		System.out.println(l1.getIndetificadorLugar() + ";" + l1.getEndereco());
		l1.setIndetificadorLugar("Rua B");
		l1.setEndereco("Boa Vista");
		System.out.println(l1.getIndetificadorLugar() + ";" + l1.getEndereco());
	}
}
