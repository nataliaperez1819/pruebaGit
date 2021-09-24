package clases;

public class Mascota{

	//Campos
	private String nombre;
	private int edad;
	

	//Constructores
	public Mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	
		//super.toString();
	}
	
	public Mascota() {
	}



	//Métodos
	//---Getters---
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	//---Setters---
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/*public String mostrar() {
		String texto;
		texto = "NOMBRE: " + nombre + "\n"
				+ "EDAD: " + edad + "\n";
		
		return texto;
	}*/
	
	//Redeclarar un método
	@Override
	public String toString() {
		String texto;
		texto = "NOMBRE: " + nombre + "\n"
				+ "EDAD: " + edad + "\n";
		
		return texto;
	}
}
