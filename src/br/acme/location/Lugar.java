package br.acme.location;

public class Lugar {

	private String indetificadorLugar;
	private String endereco;
	
	//Construtor
	public Lugar(String indetificadorLugar, String endereco) {
		this.indetificadorLugar = indetificadorLugar;
		this.endereco = endereco;
	}

	//Getters and Setters
	public String getIndetificadorLugar() {
		return indetificadorLugar;
	}

	public void setIndetificadorLugar(String indetificadorLugar) {
		this.indetificadorLugar = indetificadorLugar;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
