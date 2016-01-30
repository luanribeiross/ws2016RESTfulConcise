package com.ssribeiro.orlainventario;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Usuario {

	private int id;
	private String nome;
	private String email;
	private String senha;
	private String data_cadastro;
	
	public Usuario() {
		
	}

	public Usuario(int id, String nome, String email, String senha, String data_cadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.data_cadastro = data_cadastro;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", data_cadastro="
				+ data_cadastro + "]";
	}
	
}
