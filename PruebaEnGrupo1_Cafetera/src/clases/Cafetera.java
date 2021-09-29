package clases;

public class Cafetera {
	/*Diseñar una clase que simule el funcionamiento 
	 de una máquina de café.
	 La cafetera registrará el volumen de agua que puede 
	 almacenar, así como el tamaño de los vasos de café
	 o tazas que el usuario puede solicitar.
	 Se pide crear la clase cafetera y sus miembros:
	 A. CAMPOS:
	 	Volumen.
	 	Volumen del vaso. Habrá que restarle al volumen su tamaño.
	 	Volumen de la taza. Habrá que restarle al volumen su tamaño.
	 B. MÉTODOS:
	 	Servir taza.
	 	Servir vaso.
	 	Mostrar volumenes.
	*/
	
	
	//Campos
	//=======
	public int volumen=1000;
	public int volumenVaso=330;
	public int volumenTaza=500;
	
	//Constructores
	//=============
	public Cafetera(int volumen, int volumenVaso, int volumenTaza) {
		this.volumen = volumen;
		this.volumenVaso = volumenVaso;
		this.volumenTaza = volumenTaza;
	}
	public Cafetera() {
	}
	
	//Metodos
	//=======
	public boolean servirTaza ()
	{
		boolean servido=true;
		if(this.volumen<this.volumenTaza)
		{
			servido=false;
			System.out.println("No hay agua suficiente.");
		}
		else
		{
			this.volumen=this.volumen-this.volumenTaza;
			System.out.println("Taza servida.");
		}
		
		return servido;
	}
	
	public boolean servirVaso ()
	{
		boolean servido=true;
		if(this.volumen<this.volumenVaso)
		{
			servido=false;
			System.out.println("No hay agua suficiente.");
		}
		else
		{
			this.volumen=this.volumen-this.volumenVaso;
			System.out.println("Vaso servido");
		}
		
		return servido;
	}
	
	public String mostrar()
	{
		String texto;
		
		texto= "Volumen de agua: "+this.volumen+"\n"
				+ "Volumen de una taza: "+this.volumenTaza+ "\n"
				+ "Volumen de un vaso: "+this.volumenVaso+ "\n";
		
		return texto;
	}
	

}
