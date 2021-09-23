package paquete;

public class Ejecuta {

	public static void main(String[] args) {
	
		String nombre;
		String nombreCompleto;
		
		//Parámetros "args" del main

		/*for (int i = 0; i < args.length; i++) {
			nombre = args[i];
			System.out.println(nombre);
		}*/
		
		//Crear comando para consola: Ejecutarlo por consola y pasarle parámetros
		if (args.length != 3) {
			System.out.println("Comando incorrecto, debe recibir tres parámetros");
		} else {
			nombre = "NOMBRE: " + args[0] + "\n"
					+ "PRIMER APELLIDO: " + args[1] + "\n"
					+ "SEGUNDO APELLIDO: " + args[2] + "\n";
			System.out.println(nombre);
			
			nombreCompleto = args[0] + " " + args[1] + " " + args[2];
			System.out.println(nombreCompleto);
		}
		
	}

}
