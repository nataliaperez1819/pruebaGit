package ejecuta;

import clases.Coche;
import clases.ECombustible;
import clases.Tren;
import clases.Vehiculo;

public class Inicio {

	public static void main(String[] args) {

		Vehiculo[] vehiculos = new Vehiculo[2];
		Vehiculo veh;
		
		Coche miCoche = new Coche("Coche", 1300, "Verde", true, ECombustible.gasolina);
		Tren miTren = new Tren("Tren", 140000, "Azul", 10, true);
		
		//System.out.println(miCoche.toString());
		//System.out.println(miTren.toString());
		
		//1. Hacemos uso del Polimorfismo para almacenar en el array objetos de distinto tipo
		//-------------------------------------------------
		//vehiculos[1] = (Vehiculo)miCoche;
		vehiculos[0] = miCoche;
		
		//vehiculos[1] = (Vehiculo)miTren;
		vehiculos[1] = miTren;
		
		for (int i = 0; i < vehiculos.length; i++) {
			veh = vehiculos[i];
			if (veh instanceof Tren) {
				miTren = (Tren) veh; //Unboxing- Conversión explicita de la clase padre a la clase hija
				System.out.println(miTren.toString());
			} else if (veh instanceof Coche) {
				miCoche = (Coche) veh;
				System.out.println(miCoche.toString());
			}
		}
		
		//2. Instanciar un objeto de un tipo como otro
		//--------------------------------------------------
		Vehiculo v = new Tren("Tren", 140000, "Gris", 10, false); //Conversión implícita
		//Vehiulo v = (Vehiculo) new Tren();
		System.out.println(v.toString());
		
		/*miTren = (Tren) v;
		miTren.cerrarPuertas();*/
		((Tren)v).cerrarPuertas(); //Forma abreviada para convertir "v" en tipo Tren
		
		
		//3. Paso de parámetros
		v.mostrar(miTren); //Otra forma de convertir de tipo Tren a tipo Vehiculo al pedir el método un Vehiculo (boxing)
		v.mostrar(miCoche);
	}
}
