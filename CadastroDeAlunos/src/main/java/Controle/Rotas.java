package Controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class Rotas {
	
	@GetMapping("/TelaHome")
	public String Tela() {
		return "Telas/Home/TelaHome.html";
	}
}
