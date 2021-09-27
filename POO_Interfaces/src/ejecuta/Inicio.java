package ejecuta;

import java.util.Scanner;

import clases.GestionListado;

public class Inicio {

	public static void main(String[] args) {
		/*
		31. Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
		de 18 elementos. No se permitirán repetidos:
		
		Menú:
		1.- Introducir número entero.
		2.- Listar números.
		3.- Eliminar número.
		3.- Eliminar todos los números.
		4.- Salir.
		*/
		
		//Declaramos las variables
		GestionListado gestion = new GestionListado();
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int numero;
		String menu;
		
		menu = "--Menú--\n"
			+ "1.- Introducir número entero\n"
			+ "2.- Listar números\n"
			+ "3.- Eliminar número\n"
			+ "4.- Eliminar todos los números\n"
			+ "5.- Salir\n";

		do {
			System.out.println(menu);
			System.out.print("Introduza una opción: ");
			
			try {
				//opcion = sc.nextInt(); //Daría un bucle infinito. Mejor pedir todo como texto
				opcion = Integer.valueOf(sc.nextLine());
				
				switch (opcion) {
					case 1:
						System.out.print("Introduza número: ");
						numero = Integer.valueOf(sc.nextLine());
						
						gestion.nuevo(numero);
						break;
						
					case 2:
						gestion.listar();
						break;
						
					case 3:
						System.out.println("Introduzca número: ");
						numero = Integer.valueOf(sc.nextLine());
						
						gestion.eliminar(numero);
						break;
						
					case 4:					
						gestion.eliminar();
						break;
						
					case 5:
						System.out.println("Hasta pronto!");
					break;
						
					default:
						System.out.println("Opción incorrecta");
						break;
				}
			} catch (Exception e) {
				System.out.println("Opción incorrecta. Debe introducir un número");
				opcion = 0;
			}
			
		} while (opcion != 5);
		
		sc.close();
		
	}

}
