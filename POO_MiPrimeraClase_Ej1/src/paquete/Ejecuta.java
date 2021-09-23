package paquete;

public class Ejecuta {

	public static void main(String[] args) {
		
		Alumno alumno1;
		Alumno alumno2;
		String mensaje;
		
		alumno1 = new Alumno(); //Constructor vacío 
		alumno1.nombre = "Pedro";
		alumno1.apellido1 = "Martín";
		alumno1.apellido2 = "González";
		alumno1.mostrar();
		
		alumno1.sumarNotas(10, 7);
		
		/*mensaje = "NOMBRE: " + alumno1.nombre + "\n"
				+ "PRIMER APELLIDO: " + alumno1.apellido1 + "\n"
				+ "SEGUNDO APELLIDO: " + alumno1.apellido2 + "\n";
		System.out.println(mensaje);*/
		
		alumno2 = new Alumno("María", "López", "Sánchez"); //Con constructor
		alumno2.mostrar();
		/*mensaje = "NOMBRE: " + alumno2.nombre + "\n"
				+ "PRIMER APELLIDO: " + alumno2.apellido1 + "\n"
				+ "SEGUNDO APELLIDO: " + alumno2.apellido2 + "\n";
		System.out.println(mensaje);*/
	}

}
