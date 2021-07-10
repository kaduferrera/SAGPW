package br.edu.ifms.sagp.dto;

import java.time.LocalDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

import br.edu.ifms.sagp.model.Funcionario;
import br.edu.ifms.sagp.model.enums.FuncaoEnum;
import br.edu.ifms.sagp.model.enums.NivelPermissaoEnum;

public class RequisicaoNovoFuncionario {
	
	@NotBlank
	private String cpf;

	@NotBlank
	private String nome;

	@NotBlank
	private String funcao;
	
	@NotBlank
	private String nivelPermissao;

	@NotBlank
	private String senha;

	@NotBlank
	private String telefone;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getNivelPermissao() {
		return nivelPermissao;
	}

	public void setNivelPermissao(String nivelPermissao) {
		this.nivelPermissao = nivelPermissao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Funcionario toFuncionario() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf(getCpf());
		funcionario.setNome(getNome());
		funcionario.setTelefone(getTelefone());
		return funcionario;
	}

}
