package br.acme.users;
import java.util.Date;

import br.acme.location.Lugar;
import br.acme.location.Viagem;

public class Solicitante {

	private long id;
	private String cpf;
	private String nome;
	private String email;
	private String sexo;
	private String senha;
	private Date dataNascimento;
	private int numeroCelular;
	private Lugar[] lugares;
	private Viagem[] viagens;
	
	//Construtor
	public Solicitante(long id, String cpf, String nome, String email, String sexo, String senha, Date dataNascimento,
			int numeroCelular, Lugar[] lugares, Viagem[] viagens) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
		this.numeroCelular = numeroCelular;
		this.lugares = lugares;
		this.viagens = viagens;
	}
	
	//Solicitar carona
	public void solicitarCarona(){
		
	}
	
	//Cancelar carona
	public void cancelarCarona(){
		
	}
	
	//Histórico
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public Lugar[] getLugares() {
		return lugares;
	}

	public void setLugares(Lugar[] lugares) {
		this.lugares = lugares;
	}

	public Viagem[] getViagens() {
		return viagens;
	}

	public void setViagens(Viagem[] viagens) {
		this.viagens = viagens;
	}
	
}
