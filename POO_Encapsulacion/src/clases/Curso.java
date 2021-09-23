package clases;

public class Curso {

	//Campos
	private String denominacion;
	private int horas;
	private String academia;
	
	//Constructores
	public Curso() {
		/*this.denominacion = "";
		this.horas = 0;
		this.academia = "";*/
		
		setDenominacion("");
		setHoras(0);
		setAcademia("");
	}
	
	public Curso(String denominacion, int horas, String academia) {
		/*this.denominacion = denominacion;
		this.horas = horas;
		this.academia = academia;*/
		
		setDenominacion(denominacion);
		setHoras(horas);
		setAcademia(academia);
	}



	//Métodos
	//---Getters---
	public String getDenominacion() {
		
		String respuesta;
		
		if (denominacion.equals("")) {
			respuesta = "Sin denominación";
		} else {
			respuesta = denominacion.toUpperCase();
		}
		
		return respuesta;
	}
	
	public int getHoras() {
		return horas;
	}
	
	public String getAcademia() {
		return academia;
	}
	
	//---Setters---
	public void setDenominacion(String p_denominacion) {
		denominacion = p_denominacion;
	}
	
	public void setHoras(int p_horas) {
		//Comprobación de que las horas no son un número negativo
		if (p_horas < 0) {
			System.out.println("Valor incorrecto. Las horas no pueden ser negativas");
		} else {
			horas = p_horas;
		}
		horas = p_horas;
	}
	
	public void setAcademia(String p_academia) {
		academia = p_academia;
	}
	
	
}
