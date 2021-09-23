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
		mensaje = "NOMBRE: " + this.nombre + "\n"
				+ "PRIMER APELLIDO: " + this.apellido1 + "\n"
				+ "SEGUNDO APELLIDO: " + this.apellido2 + "\n";
		System.out.println(mensaje);
	}
	
	public int sumarNotas(int nota1, int nota2) {
		int resultado;
		resultado = nota1 + nota2;
		
		return resultado;
	}
	
	
}
