package br.edu.ifms.sagp.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SAGPController {
	
	
	@GetMapping
	@RequestMapping("/login")
	String login(Model model, Principal principal) {
        return "login";
    }

//	@Autowired
//	private ProprietarioRepositorio repositorioProprietario;
//
//	@GetMapping("/home")
//	public String home(Model model) {
//		List<Proprietario> proprietarios = repositorioProprietario.findAll();
//		model.addAttribute("proprietarios", proprietarios);
//		return "lista";
//	}

//	@GetMapping("proprietario/formulario")
//	public String formulario(RequisicaoNovoProprietario requisicao) {
//		return "proprietario/formulario";
//	}
//
//	
//	//Dependendo utilizar o redirect para voltar a listagem.
//	@PostMapping("proprietario/novo")
//	public String cadastraProprietario( @Valid RequisicaoNovoProprietario requisicao, BindingResult result) {
//		
//		if(result.hasErrors())
//			return "proprietario/formulario";
//					
//		Proprietario prop = requisicao.toProprietario();
//		repositorioProprietario.save(prop);
//		return "redirect:/lista";
//	}

}
