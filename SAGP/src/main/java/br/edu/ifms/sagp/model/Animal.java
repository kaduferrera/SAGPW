package br.edu.ifms.sagp.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.edu.ifms.sagp.model.enums.ClassificacaoEnum;
import br.edu.ifms.sagp.model.enums.OrigemEnum;
import br.edu.ifms.sagp.model.enums.RacaEnum;
import br.edu.ifms.sagp.model.enums.SexoEnum;
import br.edu.ifms.sagp.model.enums.StatusEnum;

@Entity
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tag;

	private String raca;

	private LocalDate dataNascimento;

	private String sexo;

	private String origem;

	private String status;

	private BigDecimal peso;

	private String classificacao;

	@ManyToOne
	private Propriedade propriedade;

	public Animal() {
	}

	public Long getTag() {
		return tag;
	}

	public void setTag(Long tag) {
		this.tag = tag;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public Propriedade getPropriedade() {
		return propriedade;
	}

	public void setPropriedade(Propriedade propriedade) {
		this.propriedade = propriedade;
	}

}
