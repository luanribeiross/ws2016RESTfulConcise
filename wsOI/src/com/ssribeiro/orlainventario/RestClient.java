package com.ssribeiro.orlainventario;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import com.ssribeiro.orlainventario.entity.Usuario;

@ApplicationScoped
@ManagedBean
public class RestClient {
	
	private String user;
	
	public void call() {
		Client client = ClientBuilder.newClient();
		
		Usuario usr = client.target("http://localhost:8080/wsOI/data/utils/getSample").request().get(Usuario.class);
		
		user = usr.toString();		
	}
	
	public String getUser(){
		return this.user;
	}
	
}
