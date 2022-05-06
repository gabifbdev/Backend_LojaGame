package com.lojaGames.lojaGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	@Entity
	@Table(name = "tb_categoriaGame") 
	public class CategoriaGame {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank
		@Size(min = 3, max = 255)
		private String descricao;
		
		@OneToMany(mappedBy = "categoriaGame", cascade = CascadeType.REMOVE)
		@JsonIgnoreProperties("categoriaGame")
		private List<ProdutoGame> produtosGame;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public List<ProdutoGame> getProdutosGame() {
			return produtosGame;
		}

		public void setProdutosGame(List<ProdutoGame> produtosGame) {
			this.produtosGame = produtosGame;
		}	
		
}
