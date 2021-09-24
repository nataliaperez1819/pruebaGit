package ejecuta;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {

		//Comprobar si el número 10 se encuentra en el siguiente array
		//-----------
		//|7|9|10|5|8|
		//-----------
		// 0 1 2  3 4
		//i=========>
		
		Movil movilJuan = new Movil(1, 4, "Xiaomi", 3);
		Movil movilMaria = new Movil(2, 4, "Xiaomi", 3);

		//Comparar dos objetos
		if (movilJuan.getImei() == movilMaria.getImei()) {
			System.out.println("Iguales");
		} else {
			System.out.println("Diferentes");
		}
	}

}
