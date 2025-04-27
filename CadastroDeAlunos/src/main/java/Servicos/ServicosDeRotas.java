package Servicos;

import BancoDeDados.CadastrarDadosDB;
import BancoDeDados.VerificarDadosDB;
import Objetos.Alunos;
import Objetos.Funcionarios;

public class ServicosDeRotas {
	
	/*Cadastrar um alunos*/
	public static boolean CadastrarAluno(Alunos aluno) {
		/* vamos tratar os dados aqui */
		return CadastrarDadosDB.CadastrarAlunosDB(aluno);
	}
	
	
	
	/*Recebe o Email e a senha da tela de Login*/
	public static boolean ValidarLogin(Funcionarios funcionario) {
		/*retorna um boolean*/
		return VerificarDadosDB.VerificarFuncionario(funcionario);
	}
	
	
	
	
}
