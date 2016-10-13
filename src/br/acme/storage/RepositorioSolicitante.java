package br.acme.storage;

import br.acme.users.Solicitante;

public class RepositorioSolicitante {

	private Solicitante[] solicitantes;
	private int qtd;

	// Construtor
	public RepositorioSolicitante() {
		solicitantes = new Solicitante[50];
		qtd = 0;
	}

	// Buscar Solicitante
	public Solicitante buscar(long id) {
		Solicitante s = null;
		if(id > 0)
		for (int i = 0; i < qtd; i++) {
			if (id ==(solicitantes[i].getId())) {
				return solicitantes[i];	
			}
		}else{
			System.out.println("ID inválido.");
		}
		return s;
	}
	
	// Buscar todos 
	public void	 buscarTodos(){
		for (int i = 0; i < qtd; i++) {
			System.out.println(solicitantes[i].getId() + " " + " " + solicitantes[i].getNome() + "\n");
		}
	}
	// Adicionar Solicitante
	public void adicionar(Solicitante novo) {
		if (qtd < solicitantes.length) {
			if (buscar(novo.getId()) == null) {
				solicitantes[qtd] = novo;
				qtd++;
			} else {
				System.out.println("ID " + novo.getId() + "já foi adicionado.");
			}
		} else {
			System.out.println("Cheio!");
		}
	}

	// Remover Solicitante
	public boolean remover(long id) {
		boolean retorno = false;
		for (int i = 0; i < qtd; i++) {
			if (id == (solicitantes[i].getId())) {
				qtd--;
				solicitantes[i] = solicitantes[qtd];
				solicitantes[qtd] = null;	// Última posição ficar nula
				System.out.println("Solicitante removido.");
				retorno = true;
				break;
			}
		}
		return retorno;
	}
	
	//Alterar Solicitante
	public boolean alterar(Solicitante s){
		boolean retorno = false;
		for (int i = 0; i < qtd; i++) {
			if (s.getId() == solicitantes[i].getId()) {
				solicitantes[i] = s;
				System.out.println("Alterado");
				retorno = true;
				break;
			}
		}
		return retorno;
	}
	
	// Getters and Setters
	
	public Solicitante[] getSolicitantes() {
		return solicitantes;
	}

	public void setSolicitantes(Solicitante[] solicitantes) {
		this.solicitantes = solicitantes;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	
	
}
