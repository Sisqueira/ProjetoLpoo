package br.acme.tests;
import br.acme.location.Viagem;

public class TesteViagem {
	
	public static void main(String args[]){
		Viagem v1 = new Viagem(5, null, null, null, null, 50, "Cr�dito");
		System.out.println(v1.getId()+";"+v1.getCliente()+";"+v1.getMotorista()+";"+v1.getOrigem()+";"+v1.getDestino()+";"+v1.getValorViagem()+";"+v1.getFormaPagamento());
		v1.setId(6);
		v1.setCliente(null);
		v1.setMotorista(null);
		v1.setOrigem(null);
		v1.setDestino(null);
		v1.setValorViagem(100);
		v1.setFormaPagamento("D�bito");
		System.out.println(v1.getId()+";"+v1.getCliente()+";"+v1.getMotorista()+";"+v1.getOrigem()+";"+v1.getDestino()+";"+v1.getValorViagem()+";"+v1.getFormaPagamento());
	}
}
