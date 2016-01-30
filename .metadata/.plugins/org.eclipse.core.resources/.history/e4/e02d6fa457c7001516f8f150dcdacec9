package com.ssribeiro.orlainventario.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable=false, updatable=false)
	private int id;

	@Column(name="data_cadastro", updatable=false)
	private Timestamp dataCadastro;

	@Column(updatable=false)
	private String email;

	private String nome;

	private String senha;

	//bi-directional many-to-many association to Area
	@ManyToMany
	@JoinTable(
		name="usuarios_has_areas"
		, joinColumns={
			@JoinColumn(name="id_usuario")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_area")
			}
		)
	private List<Area> areas;

	//bi-directional many-to-many association to Task
	@ManyToMany
	@JoinTable(
		name="usuarios_has_tasks"
		, joinColumns={
			@JoinColumn(name="id_usuario")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_task")
			}
		)
	private List<Task> tasks;

	//bi-directional one-to-one association to UltimoLogin
	@OneToOne
	@JoinColumn(name="id", referencedColumnName="id_usuario")
	private UltimoLogin ultimoLogin;

	public Usuario() {
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Area> getAreas() {
		return this.areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public UltimoLogin getUltimoLogin() {
		return this.ultimoLogin;
	}

	public void setUltimoLogin(UltimoLogin ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}

}