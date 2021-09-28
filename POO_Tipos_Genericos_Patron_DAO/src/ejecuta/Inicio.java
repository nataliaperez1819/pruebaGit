package ejecuta;

import clases.Articulo;
import clases.RepoArticulo;

public class Inicio {

	public static void main(String[] args) {
		
		RepoArticulo repo = new RepoArticulo();
		Articulo articulo1 = new Articulo("a123", "Monitor", 300F);
		Articulo articulo2 = new Articulo("a456", "Teclado", 20F);
		Articulo art;
		
		repo.nuevo(articulo1);
		repo.nuevo(articulo2);
		
		art = repo.leer("a456");
		System.out.println(art.toString());
		

	}

}
