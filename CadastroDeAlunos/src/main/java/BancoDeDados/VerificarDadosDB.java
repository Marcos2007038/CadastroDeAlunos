package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Objetos.Funcionarios;

public class VerificarDadosDB {
	private static Connection Conn=ConfigDB.DadosDB();
	
	public static boolean VerificarFuncionario(Funcionarios funcionario) {
		try {
			String SQLVerALuno="SELECT * FROM funcionarios WHERE email_funcionario=? OR senha_funcionario=?";
			PreparedStatement enviar = Conn.prepareStatement(SQLVerALuno);
			
			enviar.setString(1, funcionario.getEmailFuncionario());
			enviar.setString(2, funcionario.getSenhaFuncionario());
			
			ResultSet exe = enviar.executeQuery();
			if(exe.next()) {
				return true;
			}
			
		} catch (Exception e) {
			System.out.println("Deu erro no verificarDadosDB");
		}
		return false;
		
	}


}
