package paquete;

//import clases.Vacaciones;

public class Ejecuta {

	public static void main(String[] args) {

		//Instancia de la clase Vacaciones
		clases.Vacaciones vacacionesAlberto = new clases.Vacaciones(14, "Canarias", true); //Importación de la clase de forma explícita

		//vacacionesAlberto.destino = "Canarias";
		vacacionesAlberto.mostrar();
	}

}
