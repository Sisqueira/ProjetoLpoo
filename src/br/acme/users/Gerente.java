package br.acme.users;

public class Gerente {

	private long id;
	private String cpf;
	private String nome;
	private String email;
	private String sexo;
	
	//Construtor
	public Gerente(long id, String cpf, String nome, String email, String sexo){
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
	}
	
	//Cadastrar Motor
	public void cadastrarMotorista(Motorista motorista){
		
	}
	
	//Remover Motor
	public void removerMotorista(long id){
		
	}
	
	//Listar Motor
	public void listarMotoristas(){
		
	}
	
	//Listar Clientes
	public void listarClientes(){
		
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

	
	
}
