package ejecuta;

import clases.Cafetera;

public class Inicio {

	public static void main(String[] args) {
		
		Cafetera cafetera = new Cafetera();
		boolean b=true;
		
		System.out.println(cafetera.mostrar());
		
		b=cafetera.servirVaso();
		System.out.println(cafetera.mostrar());
		 
		b=cafetera.servirTaza();
		System.out.println(cafetera.mostrar());
	}

}
