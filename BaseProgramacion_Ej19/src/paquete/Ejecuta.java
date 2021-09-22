package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		// 19. Realiza un programa que lea desde teclado 4 número y posteriormente muestre solamente los que sean pares.

		//Introduzca 4 números
		//100
		//201
		//51
		//18
		
		//Los pares son:
		//100
		//18
		
		//---------------
		//|100|201|51|18| Tamaño o nº elementos es 4
		//---------------
		//  0   1   2  3
		//i|--|---|--|-->
		
		//Declaramos las variables
		int[] numeros = new int[4];
		int num;
		int resto;
		String contenidoArray;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduza 4 números");
		
		//Rellenamos o poblamos el array
		for (int i = 0; i < 4; i++) {
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Los pares son:");
		
		//Recorremos el array de principio a fin
		for (int i = 0; i < 4; i++) {
			
			num = numeros[i];
			
			//Comprobamos si el número es par, verificando si es divisible entre 2 obteniendo el resto de la división
			resto = num % 2;
			
			if (resto == 0) {
				System.out.println(num);
			}
		}
		
		//Mostrar el contenido del array
		System.out.println("El contenido del array es:");
		//Se imprime directamente el objeto (la dirección de memoria donde se encuentran almacenados los valores
		System.out.println(numeros); 
		//Empleamos el método toString de la clase Arrays, y le pasamos como valor la variable del array.
		//Devuelve un String con el contenido del array
		contenidoArray = Arrays.toString(numeros); 
		System.out.println(contenidoArray);
		
		//Recorremos el array de principio a fin
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
