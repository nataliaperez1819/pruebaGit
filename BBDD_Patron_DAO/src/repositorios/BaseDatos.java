package repositorios;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDatos {

	//**los comentarios son las alternativas si el campo "conexion" fuese private
	
	//Campos
	public Connection conexion;
	private String cadenaConexion;
	
	//Constructor
	public BaseDatos(String servidor, String usuario, String password, String baseDatos) {

		this.cadenaConexion = "jdbc:mysql://" + servidor + "/" + baseDatos 
						   + "?user=" + usuario + "&password=" + password 
						   + "&autoReconnect=true";

	}
	
	//Métodos
	//public Connection conectar() throws Exception {
	public void conectar() throws Exception {
		conexion = DriverManager.getConnection(this.cadenaConexion);
		//Connection conexion = DriverManager.getConnection(this.cadenaConexion);
		System.out.println("Conectado");
		
		//return conexion;
	}
	
	//public void desconectar(Connection conexion) throws Exception {
	public void desconectar() throws Exception {
		if (conexion != null && conexion.isClosed() == false) {
			conexion.close();
		}
	}
	
	
	
}
