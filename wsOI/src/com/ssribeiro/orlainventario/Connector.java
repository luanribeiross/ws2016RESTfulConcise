package com.ssribeiro.orlainventario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
		
	public Connector () {
		
	}
	
	public static java.sql.Connection get() {
		Connection conn = null;
		try {
			Class.forName(Const.SQL_DRIVER_NAME);
			conn = DriverManager.getConnection(Const.DB_URL, Const.DB_USER_NAME, Const.DB_PASSW);
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("O driver SQL expecificado nao foi encontrado.");
			return null;
		} catch (SQLException e) {
			System.out.println("Nao foi possivel conectar ao Banco de Dados.");
			return null;
		}
	}
	
}