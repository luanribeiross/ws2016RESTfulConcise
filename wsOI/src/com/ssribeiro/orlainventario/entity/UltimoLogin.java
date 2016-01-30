package com.ssribeiro.orlainventario.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ultimo_login database table.
 * 
 */
@Entity
@Table(name="ultimo_login")
@NamedQuery(name="UltimoLogin.findAll", query="SELECT u FROM UltimoLogin u")
public class UltimoLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="data_login")
	private Timestamp dataLogin;
	
	@Id
	@Column(updatable=false)
	private String mac;

	//bi-directional one-to-one association to Usuario
	@OneToOne(mappedBy="ultimoLogin")
	private Usuario usuario;

	public UltimoLogin() {
	}

	public Timestamp getDataLogin() {
		return this.dataLogin;
	}

	public void setDataLogin(Timestamp dataLogin) {
		this.dataLogin = dataLogin;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}