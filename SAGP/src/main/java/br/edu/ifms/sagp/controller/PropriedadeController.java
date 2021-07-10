package br.edu.ifms.sagp.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifms.sagp.dto.RequisicaoNovaPropriedade;
import br.edu.ifms.sagp.model.Propriedade;
import br.edu.ifms.sagp.model.Proprietario;
import br.edu.ifms.sagp.model.enums.EstadoEnum;
import br.edu.ifms.sagp.model.enums.PaisEnum;
import br.edu.ifms.sagp.repositorio.PropriedadeRepositorio;
import br.edu.ifms.sagp.repositorio.ProprietarioRepositorio;
import br.edu.ifms.sagp.util.Utils;

@Controller
@RequestMapping("/propriedade")
public class PropriedadeController {
	
	@Autowired
	private PropriedadeRepositorio repositorioPropriedade;
	
	@Autowired
	private ProprietarioRepositorio repositorioProprietario;

	private void populaSelectItems(Model model) {

		List<String> paises = Utils.getListSelectItemEnum(PaisEnum.class);
		List<String> estados = Utils.getListSelectItemEnum(EstadoEnum.class);
		
		model.addAttribute("paises", paises);
		model.addAttribute("estados", estados);
	}
	
	@GetMapping
	public String listaPropriedade(Model model, Principal principal) {
		List<Propriedade> propriedades = repositorioPropriedade.findAllByUsuario(principal.getName());
		model.addAttribute("propriedades", propriedades);
		return "propriedade/listaPropriedade";
	}
	
	@GetMapping("/formulario")
	public String formulario(RequisicaoNovaPropriedade requisicao, Model model) {
		return "propriedade/formulario";
	}
	
	@PostMapping("/novo")
	public String cadastraPropriedade( @Valid RequisicaoNovaPropriedade requisicao,
											  BindingResult result) {
		
		if(result.hasErrors())
			return "propriedade/formulario";
		String cpf = SecurityContextHolder.getContext().getAuthentication().getName();
		Proprietario proprietario = repositorioProprietario.findByCpf(cpf);
		requisicao.setProprietario(proprietario);
		Propriedade propriedade = requisicao.toPropriedade();
		repositorioPropriedade.save(propriedade);
		return "redirect:/propriedade";
	}

}
