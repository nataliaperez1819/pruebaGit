package interfaces;

import java.util.ArrayList;

public interface ICRUD<T1, T2> {

	//T1 es el tipo de datos del objeto
	//Por ejemplo: Alumno
	
	//T2 es el tipo de datos del campo del objeto que lo identifica como único. En una BBDD sería la PK (primary key)
	//Por ejemplo: la matrícula del Alumno
	
	void nuevo(T1 item); //Create
	T1 leer(T2 id); //Read
	ArrayList<T1> listar();
	void editar(T2 id, T1 item); //Update
	void eliminar(T1 item); //Remove
	
}
