package ejecuta;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {

		//Declaramos y asignación de las variables
		ArrayList<Movil> moviles = new ArrayList<Movil>();
		
		Movil movilJuan = new Movil(111, 4, "Apple", 4);
		Movil movilMaria = new Movil(222, 6, "Samsung", 5);
		Movil movilPedro = new Movil(333, 8, "Huawei", 4);

		Movil movilBusqueda;
		
		Scanner sc = new Scanner(System.in);
		int imei;
		
		//Poblamos el ArrayList
		moviles.add(movilJuan);
		moviles.add(movilMaria);
		moviles.add(movilPedro);
		
		//Mostramos el contenido del ArrayList
		System.out.println("CONTENIDO DEL ARRAYLIST");
		for (Movil movil : moviles) {
			System.out.println(movil);
		}
		
		//Realizamos una búsqueda
		System.out.println("Introduzca IMEI a buscar: ");
		imei = sc.nextInt();
		
		movilBusqueda = new Movil();
		movilBusqueda.setImei(imei);
		
		if (moviles.contains(movilBusqueda)) { //El método contains llama al método equals de Object por defecto, hay que redefinirlo para que funcione
			System.out.println("Encontrado");
		} else {
			System.out.println("No encontrado");
		}
		sc.close();
	}

}
