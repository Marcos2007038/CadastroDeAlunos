package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfigDB {

	
	/*Configuração para não ficar fazendo isso em outras parte do código.*/
	public static Connection DadosDB() {
		String url = "jdbc:mysql://localhost:3306/cadastrar_alunos";
		String usuario = "root";
		String senha = "";
		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			return conexao;
		} catch (Exception e) {
			 System.out.println("Erro na class ConfigDB" + e.getMessage());
			return null;
		}
		
	}
}
