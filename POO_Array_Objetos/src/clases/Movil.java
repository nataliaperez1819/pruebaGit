package clases;

public class Movil {

	//Campos
	private int memoria;
	private String marca;
	private int tamanoPantalla;
	
	//Constructores
	public Movil() {
	}
	
	public Movil(int memoria, String marca, int tamanoPantalla) {
		this.memoria = memoria;
		this.marca = marca;
		this.tamanoPantalla = tamanoPantalla;
	}
	
	//Métodos
	//---Getters---
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
		
		texto = "MEMORIA: " + memoria + "\n"
				+ "MARCA: " + marca + "\n"
				+ "TAMAÑO PANTALLA: " + tamanoPantalla + "\n";
		
		return texto;
	}
	
	//---Estándar---
	//Método que aumenta en 1 Gb la memoria
	public void aumentarMemoria() {
		memoria++;
	}
	
	
	
}
