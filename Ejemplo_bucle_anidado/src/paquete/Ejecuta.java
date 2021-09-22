package paquete;

import java.util.Random;

public class Ejecuta {

	public static void main(String[] args) {

		int segundos;
		int aleatorio;
		Random r = new Random();
		
		for (int corredor = 1; corredor <= 3; corredor++) {
		
			segundos = 0;
			
			//Generamos un valor aleatorio entre 0 y 19
			aleatorio = r.nextInt(20)+1;
			
			//do {segundos++;} while (segundos < aleatorio);
			for (; segundos < aleatorio; segundos++);
			
			if (segundos < 10) {
				System.out.println("Rápido, ha tardado " + segundos + " sg");
			} else {
				System.out.println("Lento, ha tardado " + segundos + " sg");
			}
			
		}
	}

}
