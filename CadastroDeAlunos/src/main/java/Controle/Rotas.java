package Controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Rotas {
	
	
	/*Somente para Teste*/
	@GetMapping("/TelaHome")
	public String TelaHome() {
		return "Telas/Home/TelaHome.html";
	}
	
	@GetMapping("/CadastrarAlunos")
	public String TelaCadastrarAluno() {
		return "Telas/TelasDeFuncionalidades/TelaCadastrarAlunos.html";
	}
}
