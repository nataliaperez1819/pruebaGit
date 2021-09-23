package paquete;

public class Alumno {

	//Campos o propiedades
	public String nombre;
	public String apellido1;
	public String apellido2;
	
	//Constructores
	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellido1, String apellido2) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}
	
	//Métodos
	public void mostrar() {
		String mensaje;
		mensaje = "NOMBRE: " + nombre + "\n" //"this." opcional porque no hay variables locales en el método que se llamen igual
				+ "PRIMER APELLIDO: " + apellido1 + "\n"
				+ "SEGUNDO APELLIDO: " + apellido2 + "\n";
		System.out.println(mensaje);
	}
	//Sobrecarga o Overloading de métodos
	public int sumarNotas(int p_nota1, int p_nota2) {
		int resultado;
		resultado = p_nota1 + p_nota2; //"p_" para distinguir más facilmente que es un parámetro del constructor (sobre todo cuando hay mucho código)
		
		return resultado;
	}
	
	public float sumarNotas(float p_nota1, float p_nota2) {
		float resultado;
		resultado = p_nota1 + p_nota2; //"p_" para distinguir más facilmente que es un parámetro del constructor (sobre todo cuando hay mucho código)
		
		return resultado;
	}
	
	
}
