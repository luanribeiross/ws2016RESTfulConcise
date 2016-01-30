package com.ssribeiro.orlainventario.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the item database table.
 * 
 */
@Entity
@NamedQuery(name="Item.findAll", query="SELECT i FROM Item i")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable=false, updatable=false)
	private int id;

	@Column(name="data_cadastro", updatable=false)
	private Timestamp dataCadastro;

	@Lob
	private String historico;

	private String nome;

	private String valor;

	//bi-directional many-to-many association to Area
	@ManyToMany
	@JoinTable(
		name="item_has_areas"
		, joinColumns={
			@JoinColumn(name="id_item")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_area")
			}
		)
	private List<Area> areas;

	//bi-directional many-to-many association to Local
	@ManyToMany
	@JoinTable(
		name="item_has_locais"
		, joinColumns={
			@JoinColumn(name="id_item")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_locais")
			}
		)
	private List<Local> locais;

	//bi-directional one-to-one association to Estoque
	@OneToOne
	@JoinColumn(name="id", referencedColumnName="id_produto")
	private Estoque estoque;

	public Item() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDataCadastro() {
		return this.dataCadastro;
	}

	public void setDataCadastro(Timestamp dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getHistorico() {
		return this.historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public List<Area> getAreas() {
		return this.areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public List<Local> getLocais() {
		return this.locais;
	}

	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}

	public Estoque getEstoque() {
		return this.estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

}