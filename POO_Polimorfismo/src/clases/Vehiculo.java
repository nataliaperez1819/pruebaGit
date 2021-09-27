package clases;

public class Vehiculo {
	
	//Campos
	public String tipo;
	public int peso;
	public String color;
	
	//Constructores
	public Vehiculo(String tipo, int peso, String color) {
		this.tipo = tipo;
		this.peso = peso;
		this.color = color;
	}

	public Vehiculo() {
	}
	
	//Métodos
	@Override
	public String toString() {
		String texto;
		texto = "TIPO: " + tipo + "\n"
				+ "PESO: " + peso + "\n"
				+ "COLOR: " + color + "\n";
		
		return texto;
	}
	
	public void mostrar(Coche c) {
		//Sobrecarga de "mostrar()" pidiendo un Coche
	}
	
	public void mostrar(Tren t) {
		//Sobrecarga de "mostrar()" pidiendo un Tren
	}
	
	public void mostrar(Vehiculo v) {
		Tren t;
		Coche c;
		
		if (v instanceof Coche) {
			c = (Coche) v;
			System.out.println(c.toString());
		} else {
			t = (Tren) v;
			System.out.println(t.toString());
		}
	}
	
}
