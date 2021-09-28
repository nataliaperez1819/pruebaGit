package clases;

public class Articulo {

	//Campos
	public String referencia; //PK
	public String nombre;
	public float precio;
	
	//Constructores
	public Articulo(String referencia, String nombre, float precio) {
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Articulo() {
	}
	
	//Métodos
	@Override
	public String toString() {
		return "REFERENCIA: " + referencia + "\n"
				+ "NOMBRE: " + nombre + "\n"
				+ "PRECIO: " + precio + "€" + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		return ((Articulo)obj).referencia.equals(this.referencia);
		//return ((Articulo)obj).precio == precio);
	}
	
	
	
	
	
	
}
