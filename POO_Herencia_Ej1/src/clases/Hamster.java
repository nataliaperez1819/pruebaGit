package clases;

public class Hamster extends Mascota{

	//Campos
	public String colorPelo;
	public String marcaPienso;
	
	
	//Constructores
	public Hamster(String colorPelo, String marcaPienso, String nombre, int edad) {
		super(nombre, edad);
		
		this.colorPelo = colorPelo;
		this.marcaPienso = marcaPienso;
	}

	public Hamster() {
		super();
	}
	
	//Métodos
	@Override //Anotaciones
	public String toString() {
		String texto;
		
		texto = super.toString()
				+ "COLOR PELO: " + this.colorPelo + "\n"
				+ "MARCA PIENSO: " + this.marcaPienso + "\n";
		
		return texto;
	}
	
	
	
}
