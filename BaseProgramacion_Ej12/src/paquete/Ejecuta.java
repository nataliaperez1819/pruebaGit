package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {

		/*
		 	Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
			número es primo si tiene dos únicos divisores que son el 1 y él mismo.
		*/
		
		int resto;
		boolean primo;
		//String mensaje;
		//Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Introduzca numero");
		numero = sc.nextInt();*/
		
		//Debemos probar con los número comprendidos entre 1 y 100
		
		for (int numero = 1; numero <= 100; numero++) {
			primo = true;
			
			if (numero < 2) {
				primo = false;
			}
			for (int candidatoDivisor = 2; candidatoDivisor < numero && primo; candidatoDivisor++) {
				resto = numero%candidatoDivisor;
				
				if (resto == 0) primo = false;
			}
			if (primo) {
				System.out.println(numero);
			}
		}
		//if abreviado
		//mensaje = (primo)?"Es primo":"No es primo";
		//System.out.println(mensaje);
		
		//sc.close();
	}
}
