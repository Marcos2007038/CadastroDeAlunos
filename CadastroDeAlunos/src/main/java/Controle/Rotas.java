package Controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import Objetos.Alunos;
import Objetos.Funcionarios;
import Servicos.ServicosDeRotas;


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
	
	
	
	/*usamos o @responseBody , para ele não ir buscar uma tela no static , mas retornar uma string*/
	/*Recebe o email e senha  e envia um (ok) como resposta*/
	@PostMapping("/Login")
	@ResponseBody
	public String postTelaLogin(@RequestBody  Funcionarios funcionario) {
		
		/*Mando para a Class ServicosDeRotas Porque lá , vamos tratar os dados*/
		if(ServicosDeRotas.ValidarLogin(funcionario)) {
			return "true";
		}
		return "false";
	}
	
	
	
	
	
	
	
	/*Rota de Login*/
	@GetMapping("/TelaHome")
	public String TelaHome() {
		return "Telas/Home/TelaHome.html";
	}
	
	
	/*Rota de cadastrar alunos*/
	@GetMapping("/CadastrarAlunos")
	public String CadastrarAlunos() {
		return "Telas/TelasDeFuncionalidades/TelaCadastrarAlunos.html";
	}
	
	
	/*usamos o @responseBody , para ele não ir buscar uma tela no static , mas retornar uma string*/
	/*recebemos os dados do aluno para cadastrar no banco ,mas passamos para o service*/
	@PostMapping("/CadastrarAlunos")
	@ResponseBody
	public String postCadastrarAlunos(@RequestBody  Alunos aluno) {
		System.out.println(aluno.getNomeCompleto());
		if(ServicosDeRotas.CadastrarAluno(aluno)){
			return "true";
		}
		return "false";
	}
	
	
	
	
	
	/*Rota de cadastrar cursos*/
	@GetMapping("/CadastrarCursos")
	public String CadastrarCursosAluno() {
		return "Telas/TelasDeFuncionalidades/TelaCadastrarCursos.html";
	}
	
}
