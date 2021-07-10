package br.edu.ifms.sagp.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.edu.ifms.sagp.model.Propriedade;
import br.edu.ifms.sagp.model.Proprietario;
import br.edu.ifms.sagp.model.enums.EstadoEnum;
import br.edu.ifms.sagp.model.enums.PaisEnum;

public class RequisicaoNovaPropriedade {

	@NotBlank
	private String cnpj;

	@NotBlank
	private String nome;

	@NotBlank
	private String pais;

	@NotBlank
	private String estado;

	@NotBlank
	private String municipio;

	private Proprietario proprietario;
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Propriedade toPropriedade() {
		Propriedade propriedade = new Propriedade();
		propriedade.setCnpj(getCnpj());
		propriedade.setNome(getNome());
		propriedade.setPais(getPais());
		propriedade.setEstado(getEstado());
		propriedade.setMunicipio(getMunicipio());
		propriedade.setProprietario(getProprietario());
		return propriedade;
	}
}
