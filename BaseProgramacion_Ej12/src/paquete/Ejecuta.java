package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {

		/*
		 	Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
			número es primo si tiene dos únicos divisores que son el 1 y él mismo.
		*/
		
		int numero;
		int resto;
		boolean primo = true;
		String mensaje;
		Scanner sc = new Scanner(System.in);
		
		//7
		//posibles divisores son: 2, 3, 4, 5, 6
		// 7%2
		
		System.out.println("Introduzca numero");
		numero = sc.nextInt();
		
		for (int candidatoDivisor = 2; candidatoDivisor < numero && primo == true; candidatoDivisor++) {
			resto = numero%candidatoDivisor;
			
			if (resto == 0) {
				primo = false;
			}	
		}
		//if abreviado
		/*
		 * if (primo) {
		 * 		mensaje = "Es primo";
		 * } else {
		 * 		mensaje = "No es primo";
		 * }
		 */
		mensaje = (primo)?"Es primo":"No es primo";
		System.out.println(mensaje);
		
		sc.close();
	}
}
