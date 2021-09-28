package interfaces;

import java.util.ArrayList;

public interface ICRUD<CLASE, ID> {

	//CREATE
	void nuevo(CLASE clase);
	
	//READ (primero un artículo en concreto y después todos)
	CLASE leer(ID id); //Está acoplado. Lee la referencia/identificador del artículo para leerlo
	ArrayList<CLASE> listar();
	
	//UPDATE
	void editar(ID id, CLASE clase); //Pasamos la referencia para recuperar un artículo y un Articulo para obtener los datos y poderlos modificar
	
	//DELETE
	void eliminar(CLASE clase);
}
