package ejecuta;

import clases.Hamster;

//import clases.Mascota;

public class Inicio {

	public static void main(String[] args) {

		/*Mascota miMascota = new Mascota("Puka", 5);
		String texto;
		
		//System.out.println(miMascota.mostrar());
		
		texto = miMascota.toString(); //Cuando es un objecto devuelve de forma explícita el objeto
		System.out.println(texto);*/
		
		Hamster miHamster1 = new Hamster("Marrón", "ExtraVital", "Hams", 3);
		//Hamster miHamster2 = new Hamster();
		String texto;
		
		texto = miHamster1.toString();
		System.out.println(texto);
				
	}

}
