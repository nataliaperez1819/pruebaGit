package clases;

public class Producto {
		
	//Campos
	//=======
	
	public int numProducto;
	public String nombre;
	public int precio;
	
	//Constructores
	//==============
	public Producto(int numProducto, String nombre, int precio) {
		this.numProducto = numProducto;
		this.nombre = nombre;
		this.precio = precio;
	}
	public Producto() {
	}
	
	//Redefinimos equals
	//==================
	@Override
	public boolean equals(Object obj) {
		return (((Producto)obj).numProducto==this.numProducto);
	}
	
	
}
