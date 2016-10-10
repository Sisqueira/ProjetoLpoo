package br.acme.storage;

import br.acme.users.Motorista;

public class RepositorioMotorista {

	private Motorista[] motoristas;
	int qtd;

	//Construtor
	public RepositorioMotorista() {
		motoristas = new Motorista[50];
		qtd = 0;
	}

	//Getter & Setter
	public Motorista[] getMotorista() {
		return motoristas;
	}

	public void setMotorista(Motorista[] motoristas) {
		this.motoristas = motoristas;
	}

	//Metodos
	
	//Adicionar Motorista
	public void adicionar(Motorista novo) {
		if(qtd < motoristas.length){
			if(buscar){
				
			}
		}
	}

	//Remover Motorista
	public boolean remover(long id) {
		boolean retorno = false;
	}

	//Alterar Motorista
	public String alterar() {

	}

	//Buscar Motorista
	public String buscar() {

	}

	//Buscar Todos Motoristas
	public String buscarTodos() {

	}
}
