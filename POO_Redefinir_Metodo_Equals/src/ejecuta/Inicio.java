package ejecuta;

import java.util.HashMap;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {

		//	 		 -------------------------------------
		//valores	| movilJuan | movilMaria | movilPedro |
		//	 		 -------------------------------------
		//imei		 	 111		 232		  955

		//var moviles = new HashMap<Integer, Movil>();
		HashMap<Integer, Movil> moviles = new HashMap<Integer, Movil>();
		
		/*
		//Utilizando "var" como en C#
		var movilJuan = new Movil(111, 4, "Samsung", 4);
		var movilMaria = new Movil(232, 6, "Apple", 4);
		var movilPedro = new Movil(955, 4, "Xiaomi", 5);
		*/
		Movil movilJuan = new Movil(111, 4, "Samsung", 4);
		Movil movilMaria = new Movil(232, 6, "Apple", 4);
		Movil movilPedro = new Movil(955, 4, "Xiaomi", 5);

		Movil movilBusqueda = new Movil(232, 6, "Apple", 4);
		
		//Añadimos los elementos a la colección
		/*
		moviles.put(111, movilJuan);
		moviles.put(232, movilMaria);
		moviles.put(955, movilPedro);
		*/
		moviles.put(movilJuan.getImei(), movilJuan);
		moviles.put(movilMaria.getImei(), movilMaria);
		moviles.put(movilPedro.getImei(), movilPedro);
		
		
		//Comprobamos is un elemento se encuentra en la colección por su valor
		//El método containsValue() requiere redefinir el método equals() de la clase Movil para saber que campo debe comparar para determinar que dos objetos sean iguales.
		//En caso de no hacerlo, los objetos se comparan utilizando sus Hashcodes (direcciones de memoria).
		if (moviles.containsValue(movilBusqueda)) {
			System.out.println("Encontrado");
		} else {
			System.out.println("No encontrado");
		}
		

		
	}

}
