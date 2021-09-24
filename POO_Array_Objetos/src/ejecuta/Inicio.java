package ejecuta;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {

		/*
		Movil moviles[] = {	new Movil(8, "Apple", 4),
				new Movil(10, "Samsung", 5),
				new Movil(12, "Xiaomi", 4) };

		float notas[] = {8.25F, 10F, 9.25F};
		*/
		//Declaramos el array
		Movil moviles[] = new Movil[3];
		
		//Declaramos tres objetos/instancias de la clase Movil
		Movil m1 = new Movil(8, "Apple", 4);
		Movil m2 = new Movil(10, "Samsung", 5);
		Movil m3 = new Movil(12, "Xiaomi", 4);
		
		//Poblamos el array con los objetos
		moviles[0] = m1;
		moviles[1] = m2;
		moviles[2] = m3;
		
		//Declaramos un objeto de tipo movil
		Movil movil;
		
		//Declaramos una variable de texto
		String texto;
		
		//Recorremos el array con un bucle
		for (int i = 0; i < moviles.length; i++) {
			/*movil = moviles[i];
			texto = movil.toString();
			
			System.out.println(texto);*/
		
			System.out.println(moviles[i].toString());
		}
		
		
	}

}
