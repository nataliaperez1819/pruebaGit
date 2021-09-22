package paquete;

import java.util.Calendar;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*
		 	Programa que lee nombre y a�o de nacimiento de una serie de alumnos hasta introducir
			como nombre de alumno �fin�. En ese momento mostrar� la edad media de los alumnos y
			el nombre del alumno menor. NOTA: Al introducir como nombre �fin�, no nos ha de pedir el
			a�o de nacimiento.

		 */
		
		/*int numero;
		String apellido;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca numero");
		//numero = sc.nextInt(); //ERROR
		//numero = Integer.parseInt(sc.nextLine());
		numero = Integer.valueOf(sc.nextLine()); //Cuando Scanner tenga que capturar n�meros y texto, pasar el tipo primitivo (n�mero) a String para que no salte ningun problema
		
		System.out.println("Introduzca apellido");
		apellido = sc.nextLine();
		
		System.out.println("Fin");*/
		
		String nombre;
		String nombreMenor = "";
		String mensaje;
		int anoNacimiento;
		int edad; 
		int contEdad = 0; //Contador de edades
		int suma = 0; //Acumulador de edades
		float media;
		int menor = Integer.MAX_VALUE;
		int anoAhora = Calendar.getInstance().get(Calendar.YEAR);
		Scanner sc = new Scanner(System.in);
		
		
		//nombre  |  nombreMenor  |  anoNacimiento  |  edad  |  contEdad  |  suma  |  media  |  menor  |  anoAhora  |  mensaje
		//======================================================================================================================
		// Mar�a        ""/null          1997           24	      0           0               2147483647    2021    
		// Pedro        Pedro            2000           21        1        00+24=>24             21       
		// fin													  2		   24+21=>45   22.5
		
		System.out.println("Introduzca nombre");
		nombre = sc.nextLine();
		
		while (nombre.equals("fin") == false) {
			System.out.println("Introduzca a�o de nacimiento");
				anoNacimiento = Integer.valueOf(sc.nextLine());
				
				contEdad++;
				
				edad = anoAhora - anoNacimiento;
				suma += edad;
				
				//edad | menor
				//-------------
				// 30  2147483647
				// 20     30
				// 20     20
				if (edad < menor) {
					menor = edad;
					nombreMenor = nombre;
				}
				System.out.println("Introduzca nombre");
				nombre = sc.nextLine();
		}
 		sc.close();
		
 		//Si hemos llegado a pedir alg�n nombre, la variable contEdad tendr� un valor > 0
		if (contEdad > 0) {
			media =  (float) suma / contEdad;
			mensaje = "El m�s joven se llama " + nombreMenor + " y la media de edad es " + media;
			System.out.println(mensaje);
		}
		
	}
}
