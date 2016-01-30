package com.ssribeiro.orlainventario;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import org.codehaus.jackson.map.ObjectMapper;

import com.ssribeiro.orlainventario.entity.Usuario;


@Path("/usuario")
public class UsuarioDAO extends Application {
	
	@GET
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public int add(@QueryParam("nome") String nome, 
			@QueryParam("email") String email, @QueryParam("senha") String senha) {
		int id = Const.NOT_DEFINED_INT;
		
		Connection conn = Connector.get();
		try {
			conn.prepareStatement("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//TODO: Resolve that
		Usuario usuario = new Usuario();
		
		return id;
	}
	
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Usuario> getAll() {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		//TODO: Resolve that
		Usuario usr = new Usuario();
		usr.setId(1);
		usr.setNome("luan");
		usr.setEmail("lu@nomind.com");
		usr.setSenha("pass");
		usr.setDataCadastro(new Timestamp(Timestamp.parse(new Date().toString())));
		usuarios.add(usr);
		usr = new Usuario();
		usr.setId(2);
		usr.setNome("maria");
		usr.setEmail("ma@nomind.com");
		usr.setSenha("pass2");
		usr.setDataCadastro(new Timestamp(Timestamp.parse(new Date().toString())));
		usuarios.add(usr);
		
		return usuarios;
	}
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario get(@QueryParam("id") int id) {
		
		//TODO: Resolve that
		Usuario usr = new Usuario();
		usr.setId(1);
		usr.setNome("luan");
		usr.setEmail("lu@nomind.com");
		usr.setSenha("pass");
		usr.setDataCadastro(new Timestamp(Timestamp.parse(new Date().toString())));
		
		return usr;
	}
	
	@GET
	@Path("/update")
	@Consumes("text/json")
	@Produces(MediaType.APPLICATION_JSON)
	public int update(@QueryParam("usuario") String usr) {
		int rt = Const.NOT_DEFINED_INT;
		Usuario usuario = new Usuario();
		try {
			usuario = new ObjectMapper().readValue(usr, Usuario.class);
			//TODO: Resolve that
			
			return rt;
		} catch (Exception e) {
			return rt;
		}
	}
	
	@GET
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public int delete (@QueryParam("id") int id) {
		int rt = Const.NOT_DEFINED_INT;
		//TODO: Resolve that
		Usuario usr = new Usuario();
		usr.setId(1);
		usr.setNome("luan");
		usr.setEmail("lu@nomind.com");
		usr.setSenha("pass");
		usr.setDataCadastro(new Timestamp(Timestamp.parse(new Date().toString())));
		
		return rt;
	}
	
}