package model;

import java.sql.Connection;
import java.sql.DriverManager;

/* Creating CRUD operations*/


public class BatchDAO {
	/*MODULO DE CONEXAO*/
	//Parametros de conexao
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/zumba?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "Astro78*llOvw67%";
	
	//Metodo de conexao
	private Connection connect() {
		Connection con=null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	/*
	//teste de conexao
	public void connectionTest() {
		try {
			Connection con = connect();
			System.out.println(con);
		} catch (Exception e) {
			System.out.println(e);
		}
	} */
	

}
