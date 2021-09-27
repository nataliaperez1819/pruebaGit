package clases;

public class Coche extends Vehiculo {

	//Campos
	public boolean camara;
	public ECombustible combustible;
	
	//Constructores
	public Coche(String tipo, int peso, String color, boolean camara, ECombustible combustible) {
		super(tipo, peso, color);
		
		this.camara = camara;
		this.combustible = combustible;
	}

	public Coche() {
		super();
	}

	//Métodos
	@Override
	public String toString() {
		return super.toString()
				+ "CÁMARA: " + ((camara==true)?"Sí":"No") + "\n"
				+ "COMBUSTIBLE: " + combustible + "\n\n";
	}
	
	
}
