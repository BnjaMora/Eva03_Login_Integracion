package com.platinum.Integracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/bd_platinum";
	private static final String USUARIO = "root";
	private static final String CLAVE = "";
	
	static {
		try {
			Class.forName(CONTROLADOR);
		}catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}
	
 public Connection conectar() {
	 Connection conexion = null;
	 
	try {
		DriverManager.getConnection(URL,USUARIO,CLAVE);
		System.out.println("Conexion exitosa");
		
	} catch(SQLException e) {
		System.out.println("Error de conexion");
	}
	return conexion;
 }
}
