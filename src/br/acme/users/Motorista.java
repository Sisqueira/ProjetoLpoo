package br.acme.users;
import br.acme.location.Viagem;

public class Motorista {

	private long id;
	private String cpf;
	private String nome;
	private String email;
	private String sexo;
	private boolean disponivel;
	private Viagem[] viagens;
	
	//Construtor
	public Motorista(long id, String cpf, String nome, String email, String sexo, boolean disponivel,
			Viagem[] viagens) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.disponivel = false;
		this.viagens = viagens;
	}
	
	//Responder Pedido
	public boolean responderPedido(boolean entrada){
		return entrada;
	}
	
	//Hist�rico
	public void historico(){
		
	}

	//Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public Viagem[] getViagens() {
		return viagens;
	}

	public void setViagens(Viagem[] viagens) {
		this.viagens = viagens;
	}
	
}	
