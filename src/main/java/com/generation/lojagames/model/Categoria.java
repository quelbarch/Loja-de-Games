package com.generation.lojagames.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity 
@Table(name = "tb_categoria")
@JsonPropertyOrder({ "id", "nomeCategoria", "descricao", "produto" })
public class Categoria {

	@Id // PRIMARY KEY
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório!")
	@Size(min = 2, max = 100, message = "O atributo nome deve ter no mínimo 2 e no máximo 100 caracteres.")
	@Column(length = 100)
	private String nomeCategoria;
	
	@NotBlank(message = "O atributo descrição é obrigatório!")
	@Size(min = 5, max = 1000, message = "O atributo descrição deve ter no mínimo 5 e no máximo 1000 caracteres.")
	@Column(length = 1000)
	private String descricao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties(value = "categoria", allowSetters = true)
	private List<Produto> produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
}
