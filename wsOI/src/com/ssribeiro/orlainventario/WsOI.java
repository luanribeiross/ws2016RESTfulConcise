package com.ssribeiro.orlainventario;

import java.sql.Timestamp;
import java.util.Date;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ssribeiro.orlainventario.entity.Usuario;

@Path("/utils")
@ApplicationPath("/data")
public class WsOI extends Application {
	
	@GET
	@Path("/getHello")
	public String getHello(){
		return "Hi!";
	}
	
	@GET
	@Path("/getEcho")
	public Response getEcho(@QueryParam("msg") String msg) {
		return Response.ok("Just Said: '"+msg+"'").build();
	}
	
	@SuppressWarnings("deprecation")
	@GET
	@Path("/getSample")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario getSample() {
		Usuario usr = new Usuario();
		usr.setId(1);
		usr.setNome("luan");
		usr.setEmail("lu@nomind.com");
		usr.setSenha("pass");
		usr.setDataCadastro(new Timestamp(Timestamp.parse(new Date().toString())));
		return usr;
	}
	
}