package ejecuta;

import java.util.HashMap;
import java.util.Iterator;

public class Inicio {

	public static void main(String[] args) {

		//		-------------------------------------
		//Value	|   20   |   10   |  	15 	 |   40   |
		//		-------------------------------------
		//Key	   Otono  Invierno  Primavera  Verano

		//HashMap<String, Integer> temperaturasMaxEstacion = new HashMap<String, Integer>();
		var temperaturasMaxEstacion = new HashMap<String, Integer>();
		int temperatura;
		int valor;
		String mensaje;
		
		temperaturasMaxEstacion.put("Otoño", 20);
		temperaturasMaxEstacion.put("Invierno", 10);
		temperaturasMaxEstacion.put("Primavera", 15);
		temperaturasMaxEstacion.put("Verano", 40);
		
		temperatura = temperaturasMaxEstacion.get("Primavera");
		mensaje = "La máxima en primavera es de " + temperatura + " grados";
		
		System.out.println(mensaje);
		
		//Eliminamos el elemento de clave "Primavera"
		//Antes comprobamos si en la colección existe la clave mediante el método containsKey()
		if (temperaturasMaxEstacion.containsKey("Primavera")) {
			temperaturasMaxEstacion.remove("Primavera");
			System.out.println("Elemento eliminado");
		} else {
			System.out.println("No se ha eliminado porque no se encuentra el elemento");
		}
		
		//Comprobamos si el valor 10 no se encuentra en la colección gracias al método containsValue()
		valor = 10;
		if (temperaturasMaxEstacion.containsValue(valor)) {
			mensaje = "El valor " + valor + " se encuentra se encuentra en la colección";
			System.out.println(mensaje);
		} else {
			mensaje = "El valor " + valor + " NO se encuentra se encuentra en la colección";
			System.out.println(mensaje);
		}
		
		//Modificamos el elemnto de la clave "Verano"
		temperaturasMaxEstacion.put("Verano", 42);
		System.out.println("\n La colección contiene: ");
		
		//
		
		
		//Ejemplo bucle for each (en otros lenguajes)
		/*
		int notas[] = {10, 9, 10 ,7};
		
		for(int nota : notas) {
			System.out.println(nota);
		}
		*/
		
		//		---------------------------
		//Value	|   20   |   10   |   40   |
		//		---------------------------
		//Key	   Otono  Invierno  Verano
		
		//Recorremos la colección, en concreto las claves
		for (String clave : temperaturasMaxEstacion.keySet()) {
			temperatura = temperaturasMaxEstacion.get(clave);
			mensaje = "\t La temperatura máxima en " + clave.toLowerCase() + " es de " + temperatura + " grados";
			
			System.out.println(mensaje);
			
		}
		
		
		
	}

}
