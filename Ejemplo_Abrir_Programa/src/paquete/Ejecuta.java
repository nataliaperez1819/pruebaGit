package paquete;

import java.io.IOException;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("MENU");
			System.out.println("========");
			System.out.println("1- Calculadora");
			System.out.println("2- Bloc de notas");
			System.out.println("3- Salir");
			System.out.print("Introduzca opcion: ");
			
			opcion = sc.nextInt();
			
			if (opcion == 1) {
				try {
					Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe");
				} catch (IOException e) {
					System.out.println("Fichero no encontrado");
				}
			} else if (opcion == 2) {
				try {
					Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe");
				} catch (IOException e) {
					System.out.println("Fichero no encontrado");
				}
			} else if (opcion == 3){
				System.out.println("Hasta pronto!!");
			} else {
				System.out.println("Opción incorrecta");
			}
		} while (opcion != 3);
		
		sc.close();
	}
}
