package ejecuta;

import java.util.Scanner;

import modelos.Alumno;
import repositorios.RepoAlumno;

public class Inicio {

	public static void main(String[] args) {

		RepoAlumno repo = new RepoAlumno("185.224.138.154", "u581554845_alumno", "Root1234", "u581554845_indra");
		Alumno alumno = new Alumno();
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Introduzca martrícula");
		alumno.matricula = Integer.valueOf(sc.nextLine());

		System.out.println("Introduzca nombre");
		alumno.nombre = sc.nextLine();
		
		System.out.println("Introduzca apellido");
		alumno.apellido = sc.nextLine();
		
		try {
			repo.nuevo(alumno);
		} catch (Exception e) {
			//NO utilizarlo
			//e.printStackTrace();
			System.out.println("No se ha añadido. Se ha producido un error");
			System.err.println(e.getMessage());
		}*/
		
		try {
			repo.listar();
		} catch (Exception e) {
			System.out.println("Error al listar");
		}
	}

}
