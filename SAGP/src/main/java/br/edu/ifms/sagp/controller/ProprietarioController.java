package br.edu.ifms.sagp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifms.sagp.dto.RequisicaoNovoProprietario;
import br.edu.ifms.sagp.model.Proprietario;
import br.edu.ifms.sagp.repositorio.ProprietarioRepositorio;
import br.edu.ifms.sagp.util.Utils;

@Controller
@RequestMapping("/proprietario")
public class ProprietarioController {
	
	@Autowired
	private ProprietarioRepositorio repositorioProprietario;

	@GetMapping
	public String listaProprietario(Model model) {
		List<Proprietario> proprietarios = repositorioProprietario.findAll();
		model.addAttribute("proprietarios", proprietarios);
		return "proprietario/listaProprietario";
	}
	
	@GetMapping("/formulario")
	public String formulario(RequisicaoNovoProprietario requisicao) {
		return "proprietario/formulario";
	}
	
	@PostMapping("/novo")
	public String cadastraProprietario( @Valid RequisicaoNovoProprietario requisicao, BindingResult result) {
		
		if(result.hasErrors())
			return "proprietario/formulario";
					
		Proprietario prop = requisicao.toProprietario();
		repositorioProprietario.save(prop);
		return "redirect:/proprietario";
	}
}
