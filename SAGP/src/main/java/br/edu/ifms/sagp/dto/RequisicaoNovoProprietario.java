package br.edu.ifms.sagp.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.edu.ifms.sagp.model.Proprietario;
import br.edu.ifms.sagp.model.enums.NivelPermissaoEnum;

public class RequisicaoNovoProprietario {

	@NotBlank
	private String cpfProprietario;

	@NotBlank
	private String nomeProprietario;

	@NotBlank
	private String senhaProprietario;

	@NotBlank
	private String emailProprietario;

	@NotBlank
	private String telefoneProprietario;
	
	private List<String> listaPermissoes;

	public String getCpfProprietario() {
		return cpfProprietario;
	}

	public void setCpfProprietario(String cpfProprietario) {
		this.cpfProprietario = cpfProprietario;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getSenhaProprietario() {
		return senhaProprietario;
	}

	public void setSenhaProprietario(String senhaProprietario) {
		this.senhaProprietario = senhaProprietario;
	}

	public String getEmailProprietario() {
		return emailProprietario;
	}

	public void setEmailProprietario(String emailProprietario) {
		this.emailProprietario = emailProprietario;
	}

	public String getTelefoneProprietario() {
		return telefoneProprietario;
	}

	public void setTelefoneProprietario(String telefoneProprietario) {
		this.telefoneProprietario = telefoneProprietario;
	}
	
	public List<String> getListaPermissoes() {
		return listaPermissoes;
	}

	public void setListaPermissoes(List<String> listaPermissoes) {
		this.listaPermissoes = listaPermissoes;
	}

	public Proprietario toProprietario() {
		Proprietario prop = new Proprietario();
		prop.setCpf(getCpfProprietario());
		prop.setNome(getNomeProprietario());
		prop.setEmail(getEmailProprietario());
		prop.setTelefone(getTelefoneProprietario());
		return prop;
	}
}
