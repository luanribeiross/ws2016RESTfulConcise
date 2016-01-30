package com.ssribeiro.orlainventario.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the areas database table.
 * 
 */
@Entity
@Table(name="areas")
@NamedQuery(name="Area.findAll", query="SELECT a FROM Area a")
public class Area implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable=false, updatable=false)
	private int id;

	@Lob
	private String historico;

	private String nome;

	//bi-directional many-to-many association to Item
	@ManyToMany(mappedBy="areas")
	private List<Item> items;

	//bi-directional many-to-many association to Usuario
	@ManyToMany(mappedBy="areas")
	private List<Usuario> usuarios;

	//bi-directional many-to-many association to Area
	@ManyToMany
	@JoinTable(
		name="areas_has_child"
		, joinColumns={
			@JoinColumn(name="id_area")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_area_child")
			}
		)
	private List<Area> areas1;

	//bi-directional many-to-many association to Area
	@ManyToMany(mappedBy="areas1")
	private List<Area> areas2;

	public Area() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Area> getAreas1() {
		return this.areas1;
	}

	public void setAreas1(List<Area> areas1) {
		this.areas1 = areas1;
	}

	public List<Area> getAreas2() {
		return this.areas2;
	}

	public void setAreas2(List<Area> areas2) {
		this.areas2 = areas2;
	}

}