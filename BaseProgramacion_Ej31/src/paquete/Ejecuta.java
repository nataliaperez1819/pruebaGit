package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/* 
		 Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
		de 18 elementos. No se permitirán repetidos:
			Menú:
			1.- Introducir número entero.
			2.- Listar números.
			3.- Eliminar número.
			4.- Eliminar todos los números.
			5.- Salir.
		*/
		
		String menu;
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[18];
		int num;
		int opcion;
		int i = 0;
		int j;
		int contIntercambios;
		int auxiliar;
		
		// ---------------
		// |2|4|6|8| | | |
		// ---------------
		//	0 1 2 3 ... 18
		//i ------------->
		
		menu = "--MENÚ--\n"
				+ "1.- Introducir número entero\n"
				+ "2.- Listar números\n"
				+ "3.- Eliminar número\n"
				+ "4.- Eliminar todos los números\n"
				+ "5.- Salir\n";
		
		do {
			System.out.println(menu);
			System.out.print("Introduzca opción: ");
			opcion = sc.nextInt();
			
			/*if (opcion == 1) {
				
			} else if (opcion == 2) {
				
			}*/
			switch (opcion) {
			case 1:
				//Comprobamos que no se haya excedido la capacidad del array
				if (i == 18) {
					System.out.println("Array lleno. No se ha guardado");
				} else {
					//Pedimos el número
					System.out.print("Introduzca número: ");
					num = sc.nextInt();
					//Comprobamos que no esté repetido
					for (j = 0; j < i && numeros[j] != num; j++);

					if (i == j) {
						System.out.println("Número guardado");
						numeros[i] = num;
						i++;
						//Ordenamos ascendentemente los elementos del array utilizando el algoritmo de la burbuja
						do {
							contIntercambios = 0;
							//Recorremos el array desde el principio hasta el penúltimo elemento
							for (j = 0; j < i-1; j++) {
								//Si el número de la posición actual es mayor que el siguiente se intercambian
								if (numeros[j] > numeros[j+1]) {
									auxiliar = numeros[j];
									numeros[j] = numeros[j+1];
									numeros[j+1] = auxiliar;
									//Incrementamos el contador de intercambios
									contIntercambios++;
								}
							}
							
						} while (contIntercambios > 0);
						
					} else {
						System.out.println("Número repetido. No se ha guardado");
					}
				}
				break;
			case 2:
				if (i == 0) {
					System.out.println("Sin datos");
				} else {
					System.out.println("Contenido del array:");
					for (j = 0; j < i; j++) {
						System.out.println(numeros[j]);
					}
				}
				break;
			case 3:
				// ---------------
				// |2| |9|8| | | |
				// ---------------
				//	0 1 2 3 ... 18
				//i ------------->
				System.out.print("Introduzca número: ");
				num = sc.nextInt();
				
				for (j = 0; j < i && numeros[j] != num; j++);
				
				if(i == j) {
					System.out.println("No encontrado. No se ha eliminado");
				} else {
					//Decrementamos en una unidad la variable "i", puesto que hemos eliminado un elemento
					for (int k = j; k < i-1; k++) {
						numeros[k] = numeros[k+1];
					}
					i--;
					System.out.println("Número eliminado");
				}
				break;
			case 4:
				//Mover la "i" a la posición 0
				i = 0;
				numeros = new int[18];
				System.out.println("Números eliminados");
				break;
			case 5:
				
				break;
				
			default:
				System.out.println("Opción incorrecta");
				break;
			}
			
		} while (opcion != 5);
		
		sc.close();
	}

}
