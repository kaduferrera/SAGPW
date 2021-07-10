package br.edu.ifms.sagp.controller;

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

import br.edu.ifms.sagp.dto.RequisicaoNovoAnimal;
import br.edu.ifms.sagp.model.Animal;
import br.edu.ifms.sagp.model.Propriedade;
import br.edu.ifms.sagp.model.enums.ClassificacaoEnum;
import br.edu.ifms.sagp.model.enums.OrigemEnum;
import br.edu.ifms.sagp.model.enums.RacaEnum;
import br.edu.ifms.sagp.model.enums.SexoEnum;
import br.edu.ifms.sagp.model.enums.StatusEnum;
import br.edu.ifms.sagp.repositorio.AnimalRepositorio;
import br.edu.ifms.sagp.repositorio.PropriedadeRepositorio;
import br.edu.ifms.sagp.util.Utils;

@Controller
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	private AnimalRepositorio repositorioAnimal;
	
	@Autowired
	private PropriedadeRepositorio repositorioPropriedade;

	private void populaSelectItems(Model model) {

		List<String> racas = Utils.getListSelectItemEnum(RacaEnum.class);
		List<String> sexos = Utils.getListSelectItemEnum(SexoEnum.class);
		List<String> origens = Utils.getListSelectItemEnum(OrigemEnum.class);
		List<String> statuss = Utils.getListSelectItemEnum(StatusEnum.class);
		List<String> classificacoes = Utils.getListSelectItemEnum(ClassificacaoEnum.class);

		model.addAttribute("racas", racas);
		model.addAttribute("sexos", sexos);
		model.addAttribute("origens", origens);
		model.addAttribute("statuss", statuss);
		model.addAttribute("classificacoes", classificacoes);

	}

	@GetMapping
	public String listaAnimal(Model model) {
		List<Animal> animais = repositorioAnimal.findAll();
		model.addAttribute("animais", animais);
		return "animal/listaAnimal";
	}

	@GetMapping("/formulario")
	public String formulario(RequisicaoNovoAnimal requisicao, Model model) {
		String cpf = SecurityContextHolder.getContext().getAuthentication().getName();
		List<Propriedade> propriedades = repositorioPropriedade.findAllByUsuario(cpf);
		model.addAttribute("propriedades", propriedades);
		populaSelectItems(model);
		return "animal/formulario";
	}

	@PostMapping("/novo")
	public String cadastraProprietario(@Valid RequisicaoNovoAnimal requisicao, BindingResult result, Model model) {

		if (result.hasErrors()) {
			populaSelectItems(model);
			return "animal/formulario";
		}
		
		Animal animal = requisicao.toAnimal();
		repositorioAnimal.save(animal);
		return "redirect:/animal";
	}

}
