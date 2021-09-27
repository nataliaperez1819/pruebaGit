package clases;

import java.util.ArrayList;

import interfaces.IGestionListado;

public class GestionListado implements IGestionListado {

	//Campos
	public ArrayList<Integer> listado;
	//private int contNumeros;
	
	//Constructores
	public GestionListado() {
		this.listado = new ArrayList<Integer>();
		//this.contNumeros = 0;
	}

	
	@Override
	public void nuevo(int numero) {
		
		if (listado.size() == 18) {
			System.out.println("No introducido. El listado está lleno");
		} else if (listado.contains(numero)) {
			System.out.println("No introducido. Ya se encuentra en el listado");
		} else {
			listado.add(numero);
			listado.sort(null);
		}
		
	}

	@Override
	public void listar() {
		if (listado.size() == 0) {
			System.out.println("Listado vacío");
		} else {
			System.out.println("Contenido del listado: ");
			for (int i = 0; i < listado.size(); i++) {
				System.out.println(listado.get(i));
			}
		}
		
	}

	@Override
	public void eliminar(Integer numero) {
		//Comprueba .remove() y también lo ejecuta
		boolean ok = listado.remove(numero);
		
		if (ok == false) {
			System.out.println("No se ha eliminado. El valor no se encuentra en el array");
		}
		
	}

	@Override
	public void eliminar() {
		listado.clear();
		//listado = new ArrayList<Integer>();	
	}
}
