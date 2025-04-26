package Controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class Rotas {
	
	/*Rota de Erro*/
	@GetMapping("/")
	public String TelaDeErro() {
		return "Telas/TelaDeErro/TelaDeErro.html";
	}
	
	/*Rota de Login*/
	@GetMapping("/Login")
	public String TelaLogin() {
		return "Telas/Entrar/Entrar.html";
	}
	
	
	/*Rota de Login*/
	@GetMapping("/TelaHome")
	public String TelaHome() {
		return "Telas/TelaHome/TelaHome.html";
	}
	
	/*Rota de cadastrar alunos*/
	@GetMapping("/CadastrarAlunos")
	public String CadastrarAlunos() {
		return "Telas/TelasDeFuncionalidades/TelaCadastrarAlunos.html";
	}
	
	/*Rota de cadastrar cursos*/
	@GetMapping("/CadastrarCursos")
	public String CadastrarCursosAluno() {
		return "Telas/TelasDeFuncionalidades/TelaCadastrarCursos.html";
	}
	
}
