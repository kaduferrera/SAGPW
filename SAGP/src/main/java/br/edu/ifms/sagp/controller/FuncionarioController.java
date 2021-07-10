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

import br.edu.ifms.sagp.dto.RequisicaoNovoFuncionario;
import br.edu.ifms.sagp.model.Funcionario;
import br.edu.ifms.sagp.model.enums.FuncaoEnum;
import br.edu.ifms.sagp.model.enums.NivelPermissaoEnum;
import br.edu.ifms.sagp.repositorio.FuncionarioRepositorio;
import br.edu.ifms.sagp.util.Utils;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	private FuncionarioRepositorio repositorioFuncionario;

	
	@GetMapping
	public String listaFuncionario(Model model) {
		List<Funcionario> funcionarios = repositorioFuncionario.findAll();
		model.addAttribute("funcionarios", funcionarios);
		return "funcionario/listaFuncionario";
	}
	
	@GetMapping("/formulario")
	public String formulario(RequisicaoNovoFuncionario requisicao, Model model) {
		List<String> permissoes = Utils.getListSelectItemEnum(NivelPermissaoEnum.class);
		List<String> funcoes = Utils.getListSelectItemEnum(FuncaoEnum.class);
		model.addAttribute("permissoes", permissoes);
		model.addAttribute("funcoes", funcoes);
		return "funcionario/formulario";
	}
	
	@PostMapping("/novo")
	public String cadastraProprietario( @Valid RequisicaoNovoFuncionario requisicao, BindingResult result) {
		
		if(result.hasErrors())
			return "funcionario/formulario";
					
		Funcionario funcionario = requisicao.toFuncionario();
		repositorioFuncionario.save(funcionario);
		return "redirect:/funcionario";
	}
	
}
