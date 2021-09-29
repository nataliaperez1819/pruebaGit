package ejecuta;

import java.util.HashMap;
import java.util.Scanner;

import clases.Producto;
import clases.RepoProducto;

public class Inicio {

	public static void main(String[] args) {

		RepoProducto repo= new RepoProducto();
		Scanner sc= new Scanner (System.in);
		int opcion;
		int nProd;
		HashMap<Integer, Producto> hm1;
		Producto p1=new Producto();
		
		String menu = " -- MENU ALUMNOS -- \n"
				+ "1. Listar \n"
				+ "2. Leer producto \n"
				+ "3. Eliminar \n"
				+ "4. Editar \n "
				+ "5. Nuevo \n"
				+ "6. Salir \n";

		
		do
		{
			System.out.println(menu);
			System.out.println("Introduzca opción: ");
			opcion=Integer.valueOf(sc.nextLine());
			
			switch (opcion)
			{
			case 1:
			
				hm1=repo.listar();	
				
				for(int i: hm1.keySet())
				{
					System.out.println(hm1.get(i).toString());
				}
				break;
				
			case 2:
				
				
				System.out.println("Introduzca el numero de producto a leer: ");
				nProd=Integer.valueOf(sc.nextLine());
				
				p1=repo.leer(nProd);
				System.out.println(p1.toString());
				
				break;
				
			case 3:
				System.out.println("Introduzca el numero de producto a eliminar: ");
				nProd=Integer.valueOf(sc.nextLine());
				
				repo.eliminar(nProd);
				break;
				
			case 4:
				System.out.println("Introduzca el numero de producto a modificar: ");
				nProd=Integer.valueOf(sc.nextLine());
				
				Producto pAux=new Producto();
				System.out.println("Introduzca el numero de producto: ");
				pAux.numProducto=Integer.valueOf(sc.nextLine());
				System.out.println("Introduzca el nombre del producto: ");
				pAux.nombre=sc.nextLine();
				System.out.println("Introduzca el precio: ");
				pAux.precio=Integer.valueOf(sc.nextLine());
				
				repo.editar(pAux, nProd);
				
				break;
				
			case 5:
				Producto pA=new Producto();
				System.out.println("Introduzca el numero de producto: ");
				pA.numProducto=Integer.valueOf(sc.nextLine());
				System.out.println("Introduzca el nombre del producto: ");
				pA.nombre=sc.nextLine();
				System.out.println("Introduzca el precio: ");
				pA.precio=Integer.valueOf(sc.nextLine());
				
				repo.nuevo(pA);
				
				break;
				
			case 6:
				System.out.println("Hasta pronto!!");
				break;
				
			default: 
				System.out.println("Introduzca una opcion adecuada.");
				break;
			
			
			}
			
			
		}while(opcion!=6);
		
		
		
	
	}

}
