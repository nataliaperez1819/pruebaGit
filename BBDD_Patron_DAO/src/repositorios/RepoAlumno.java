package repositorios;

import java.sql.PreparedStatement;

//Si pusiesemos "com.mysql.jdbc.Connection" utiliza el driver/connector que hemos importado
//import java.sql.Connection;

import java.util.ArrayList;

import modelos.Alumno;

public class RepoAlumno extends BaseDatos implements ICRUD<Alumno, Integer>{
	
	//Campos
	private String sql;
	private PreparedStatement ps;
	
	//Constructores
	public RepoAlumno(String servidor, String usuario, String password, String baseDatos) {
		super(servidor, usuario, password, baseDatos);
		// TODO Auto-generated constructor stub
	}

	//Métodos de la interfaz
	@Override
	public ArrayList<Alumno> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alumno leer(Integer pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void nuevo(Alumno modelo) throws Exception {
		
		int cantidad;
		
		//Conectamos la BBDD
		conectar();
		
		//Consultas paramétricas
		this.sql = "INSERT INTO Alumno(matricula, nombre, apellido) VALUES(?, ?, ?);";
				//NO hacer nunca, es una inyección SQL y NO es nada segura, hay que parametrizarla
				//+ "VALUES(" + modelo.matricula + ", '" +  modelo.nombre + "', '" + modelo.apellido + "');";

		this.ps = conexion.prepareStatement(sql);
		
		this.ps.setInt(1, modelo.matricula);
		this.ps.setString(2, modelo.nombre);
		this.ps.setString(3, modelo.apellido);
		
		cantidad = this.ps.executeUpdate();
	}

	@Override
	public void editar(Integer pk, Alumno modelo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer pk) {
		// TODO Auto-generated method stub
		
	}

}
