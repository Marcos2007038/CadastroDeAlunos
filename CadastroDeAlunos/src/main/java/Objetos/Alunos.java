package Objetos;

public class Alunos {
	private String matricula;
	private String NomeCompleto;
	private String Email;
	private String Telefone;
	private String Cpf;
	private String SexoAluno;
	private String Data;
	
	public Alunos(String matricula, String nomeCompleto, String email, String telefone, String cpf, String sexoAluno,
	String data) {
		this.matricula = matricula;
		NomeCompleto = nomeCompleto;
		Email = email;
		Telefone = telefone;
		Cpf = cpf;
		SexoAluno = sexoAluno;
		Data = data;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNomeCompleto() {
		return NomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		NomeCompleto = nomeCompleto;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getSexoAluno() {
		return SexoAluno;
	}
	public void setSexoAluno(String sexoAluno) {
		SexoAluno = sexoAluno;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	
	
	
	
	
	
	/*
	 * 
-id_aluno
-nome completo
-email
-telefone
-CPF
-matricula (gerada pelo sistema)
-Sexo do Aluno
-data_de_nascimento*/
}
