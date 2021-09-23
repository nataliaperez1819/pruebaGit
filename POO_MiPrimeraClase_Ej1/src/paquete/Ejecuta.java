package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
		//Alumno alumno1;
		//Alumno alumno2;
		Alumno alumno3;
		//String mensaje;
		int suma;
		Scanner sc = new Scanner(System.in);
		
		/*alumno1 = new Alumno(); //Constructor vacío 
		alumno1.nombre = "Pedro";
		alumno1.apellido1 = "Martín";
		alumno1.apellido2 = "González";
		alumno1.mostrar();
		
		
		suma = alumno1.sumarNotas(10, 7);
		
		alumno2 = new Alumno("María", "López", "Sánchez"); //Con constructor
		alumno2.mostrar();*/
		
		
		//Crear alumno con el Constructor vacío para poder darle los valores por teclado.
		alumno3 = new Alumno(); //Sobrecarga o Overloading de constructores
		System.out.println("Introduzca NOMBRE: ");
		alumno3.nombre = sc.nextLine();
		
		System.out.println("Introduzca PRIMER APELLIDO: ");
		alumno3.apellido1 = sc.nextLine();
		
		System.out.println("Introduzca SEGUNDO APELLIDO: ");
		alumno3.apellido2 = sc.nextLine();
		
		alumno3.mostrar();
		
		suma = alumno3.sumarNotas(5, 10);
		System.out.println(suma);
		
		sc.close();
	}

}
