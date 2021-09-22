package paquete;

public class Ejecuta {

	public static void main(String[] args) {
		// Mostrar las 10 primeras tablas de multiplicar
		
		//TABLA DEL 1:
		//1 x 1 = 1
		//1 x 2 = 2
		//...
		//1 x 10 = 10
		//===========
		//La suma vale xxxx
		
		//TABLA DEL 2:
		//2 x 1 = 2
		//2 x 2 = 4
		//...
		//2 x 10 = 20
		//===========
		//La suma vale xxxx
		
		//...
		
		//TABLA DEL 10:
		//10 x 1 = 10
		//10 x 2 = 20
		//...
		//10   x   10   =   100
		//--       --	    ---
		//numero   j      resultado

		//int numero = 10;
		int resultado;
		int suma;
		String fila;
		
		for (int numero = 1; numero <= 9; numero++) {
			
			System.out.println("Tabla del " + numero + ":");
			
			suma = 0;
			
			for (int j = 1; j <= 10; j++) {
				resultado = numero * j;
				
				suma += resultado;
				
				fila = numero + "   x   " + j + "   =   " + resultado;
				System.out.println(fila);
			}
			
			System.out.println("====================");
			System.out.println("La suma vale " + suma);
			System.out.println("");
			System.out.println("");
		}
		
		
	}
}
