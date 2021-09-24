package clases;

public class Movil {

	//Campos
	private int imei;
	private int memoria;
	private String marca;
	private int tamanoPantalla;
	
	//Constructores
	public Movil() {
	}
	
	public Movil(int imei, int memoria, String marca, int tamanoPantalla) {
		this.imei = imei;
		this.memoria = memoria;
		this.marca = marca;
		this.tamanoPantalla = tamanoPantalla;
	}
	
	//Métodos
	//---Getters---
	public int getImei() {
		return imei;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getTamanoPantalla() {
		return tamanoPantalla;
	}

	//---Setters---
	public void setImei(int imei) {
		this.imei = imei;
	}
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setTamanoPantalla(int tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}

	//---Redefinidos---
	@Override
	public String toString() {
		String texto;
		
		texto = "IMEI: " + imei + "\n"
				+ "MEMORIA: " + memoria + "\n"
				+ "MARCA: " + marca + "\n"
				+ "TAMAÑO PANTALLA: " + tamanoPantalla + "\n";
		
		return texto;
	}
	
	@Override
	public boolean equals(Object objetoCompara) {
		return ((Movil)objetoCompara).imei == this.imei;
	}

	
	//---Estándar---
	//Método que aumenta en 1 Gb la memoria
	public void aumentarMemoria() {
		memoria++;
	}
	
	
	
}
