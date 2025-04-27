package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Objetos.Alunos;
import Objetos.Funcionarios;

public class CadastrarDadosDB {
	private static Connection Conn=ConfigDB.DadosDB();
	
	
	
	
	
	public static boolean CadastrarAlunosDB(Alunos aluno) {
		try {
			String SQlinserir="INSERT INTO alunos (matricula, nome_completo, email, telefone, cpf, sexo_aluno, data) VALUES (?, ?, ?, ?, ?, ?, ?)";

			
			PreparedStatement enviar =Conn.prepareStatement(SQlinserir);
			
			enviar.setString(1,	aluno.getMatricula());
			enviar.setString(2, aluno.getNomeCompleto());
			enviar.setString(3, aluno.getEmail());
			enviar.setString(4, aluno.getTelefone());
			enviar.setString(5, aluno.getCpf());
			enviar.setString(6, aluno.getSexoAluno());
			enviar.setString(7, aluno.getData());
			
			enviar.executeUpdate();
			
			return true;
			
		} catch (Exception e) {
			
			System.out.println("Deu um erro!!!.");
			return false;
		}
	}
	
	
	
	
	public static boolean CadastrarFuncionariosDB(Funcionarios funcionario) {
		try {
			String SQlinserir="INSERT INTO funcionarios (nome_funcionario, email_funcionario, senha_funcionario, "
					+ "telefone_funcionario, tipo_funcionario, data, ativo)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement enviar =Conn.prepareStatement(SQlinserir);
			
			enviar.setString(1,	funcionario.getNomeFuncionario());
			enviar.setString(2, funcionario.getEmailFuncionario());
			enviar.setString(3, funcionario.getSenhaFuncionario());
			enviar.setString(4, funcionario.getTelefoneFuncionario());
			enviar.setString(5, funcionario.getTipoFuncionario());
			enviar.setString(6, funcionario.getDataFuncionario());
			enviar.setString(7, funcionario.getFuncionarioAtivo());
			
			enviar.executeUpdate();
			
			return true;
			
		} catch (Exception e) {
			
			System.out.println("Deu um erro!!!.");
			return false;
			
		}
	}
	

	
	
	
	

	

	
}
