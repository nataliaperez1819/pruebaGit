package clases;

import java.util.ArrayList;

import interfaces.ICRUD;

public class RepoArticulo implements ICRUD<Articulo, String>{

	//Campos
	public ArrayList<Articulo> listado;
	
	//Constructores
	public RepoArticulo() {
		this.listado = new ArrayList<Articulo>();
	}

	//Métodos de la interfaz (sobrescribiéndolos ahora)
	@Override
	public void nuevo(Articulo clase) {
		listado.add(clase);
	}

	@Override
	public Articulo leer(String id) {
		Articulo articulo = null;
		
		//Búsqueda secuencial. En el HashMap no hace falta
		for (int i = 0; i < listado.size(); i++) {
			articulo = listado.get(i); //numeros[i]
			if (articulo.referencia.equals(id)) {
				break;
			}
		}
		return articulo;
	}
	
	@Override
	public ArrayList<Articulo> listar() {
		return listado;
	}

	@Override
	public void editar(String id, Articulo clase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Articulo clase) {
		boolean ok;
		//Elimina todo el objeto, tanto la posición como el valor
		ok = listado.remove(clase);
		if (ok) {
			System.out.println("Eliminado");
		} else {
			System.out.println("No eliminado, porque no se ha encontrado");
		}
		//El método remove() hace el bucle como en el de "leer()"
		//Al utilizar remove() hay que override el equals() sino se tendría que hacer el bucle for
	}
}
