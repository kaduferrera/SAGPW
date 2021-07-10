package br.edu.ifms.sagp.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.edu.ifms.sagp.model.Animal;
import br.edu.ifms.sagp.model.enums.ClassificacaoEnum;
import br.edu.ifms.sagp.model.enums.OrigemEnum;
import br.edu.ifms.sagp.model.enums.RacaEnum;
import br.edu.ifms.sagp.model.enums.SexoEnum;
import br.edu.ifms.sagp.model.enums.StatusEnum;
import br.edu.ifms.sagp.util.Utils;

public class RequisicaoNovoAnimal {
	
	
	private Long tag;

	@NotBlank
	private String raca;

	@NotNull
	private LocalDate dataNascimento;

	
	@NotBlank
	private String sexo;

	
	@NotBlank
	private String origem;

	
	@NotBlank
	private String status;

	@NotNull
	private BigDecimal peso;

	
	@NotBlank
	private String classificacao;

	public Long getTag() {
		return tag;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}
	
	

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public void setTag(Long tag) {
		this.tag = tag;
	}

	public Animal toAnimal() {
		Animal animal = new Animal();
		animal.setRaca(getRaca());
		animal.setDataNascimento(getDataNascimento());
		animal.setSexo(getSexo());
		animal.setOrigem(getOrigem());
		animal.setStatus(getStatus());
		animal.setPeso(getPeso());
		animal.setClassificacao(getClassificacao());
		return animal;
	}
}
