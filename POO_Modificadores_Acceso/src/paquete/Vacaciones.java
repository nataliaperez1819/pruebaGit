package paquete;

public class Vacaciones {

	//Campos
	private int dias;
	private String destino;
	private boolean playa;
	
	//Constructores
	public Vacaciones(int dias, String destino, boolean playa) {
		this.dias = dias;
		this.destino = destino;
		this.playa = playa;
	}
	
	/*public Vacaciones() {
	}*/
	
	public void mostrar() {
		String texto;
		
		texto = "DÍAS: " + this.dias + "\n"
				+ "DESTINO: " + this.destino + "\n"
				+ "PLAYA: " + ((this.playa == true) ? "Sí" : "No");
		
		/*if (this.playa) {
			texto += "Sí";
		} else {
			texto += "No";
		}*/
		
		System.out.println(texto);
	
	}
	
	
	
	
}
