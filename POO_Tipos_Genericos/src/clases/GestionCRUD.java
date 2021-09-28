package clases;

import java.util.ArrayList;

import interfaces.ICRUD;

public class GestionCRUD<T1, T2> implements ICRUD<T1, T2>{
	//Tanto la clase como lo que implementa tiene que recibir los mismos
	
	//T1 es el tipo de datos del objeto
	//Por ejemplo: Alumno
	
	//T2 es el tipo de datos del campo del objeto que lo identifica como único. En una BBDD sería la PK (primary key)
	//Por ejemplo: la matrícula del Alumno
	
	//Campos
	ArrayList<T1> listado; //Si se pone <Alumno> se podria utilizar en Alumno, asi que hay que desacoplarlo 
	
	
	// Constructores
	public GestionCRUD() {
		this.listado = new ArrayList<T1>();
	}

	
	//Métodos de la interfaz
	@Override
	public void nuevo(T1 item) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public T1 leer(T2 id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ArrayList<T1> listar() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void editar(T2 id, T1 item) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void eliminar(T1 item) {
		// TODO Auto-generated method stub
		
	}
}
