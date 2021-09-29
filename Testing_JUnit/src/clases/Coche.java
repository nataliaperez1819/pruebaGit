package clases;

import java.util.Random;

public class Coche {

	public int acelerar(int velocidad) {
		
		//Tiene prioridad el return sobre el ++ (primero devuelve "velocidad" y después lo suma, pero ya da igual porque no cuenta)
		//return velocidad++;
		
		//OPCION 1
		//=========
		//velocidad++;
		//resultado = velocidad;
		//return resultado;
		
		//OPCION 2
		//=========
		//int resultado = ++velocidad;
		//return resultado;
		
		//OPCION 3
		//=========
		return ++velocidad;
	}
	
	public boolean multa() {
		Random r = new Random();
		boolean resultado = r.nextBoolean();
		
		return resultado;
	}
	
}
