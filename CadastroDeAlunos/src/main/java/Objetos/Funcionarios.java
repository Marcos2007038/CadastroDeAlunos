package Objetos;

public class Funcionarios {
	 private String NomeFuncionario;
     private String EmailFuncionario;
     private String SenhaFuncionario;
     private String TelefoneFuncionario;
     private String TipoFuncionario;
     private String DataFuncionario;
     private String FuncionarioAtivo;
     
	public Funcionarios(String nomeFuncionario, String emailFuncionario, String senhaFuncionario,
			String telefoneFuncionario, String tipoFuncionario, String dataFuncionario, String funcionarioAtivo) {
		NomeFuncionario = nomeFuncionario;
		EmailFuncionario = emailFuncionario;
		SenhaFuncionario = senhaFuncionario;
		TelefoneFuncionario = telefoneFuncionario;
		TipoFuncionario = tipoFuncionario;
		DataFuncionario = dataFuncionario;
		FuncionarioAtivo = funcionarioAtivo;
	}

	public String getNomeFuncionario() {
		return NomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		NomeFuncionario = nomeFuncionario;
	}

	public String getEmailFuncionario() {
		return EmailFuncionario;
	}

	public void setEmailFuncionario(String emailFuncionario) {
		EmailFuncionario = emailFuncionario;
	}

	public String getSenhaFuncionario() {
		return SenhaFuncionario;
	}

	public void setSenhaFuncionario(String senhaFuncionario) {
		SenhaFuncionario = senhaFuncionario;
	}

	public String getTelefoneFuncionario() {
		return TelefoneFuncionario;
	}

	public void setTelefoneFuncionario(String telefoneFuncionario) {
		TelefoneFuncionario = telefoneFuncionario;
	}

	public String getTipoFuncionario() {
		return TipoFuncionario;
	}

	public void setTipoFuncionario(String tipoFuncionario) {
		TipoFuncionario = tipoFuncionario;
	}

	public String getDataFuncionario() {
		return DataFuncionario;
	}

	public void setDataFuncionario(String dataFuncionario) {
		DataFuncionario = dataFuncionario;
	}

	public String getFuncionarioAtivo() {
		return FuncionarioAtivo;
	}

	public void setFuncionarioAtivo(String funcionarioAtivo) {
		FuncionarioAtivo = funcionarioAtivo;
	}
     
    
	
     
     
     
     
     
     
     
}
