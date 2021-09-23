package ejecuta;

import clases.Curso;

public class Inicio {

	public static void main(String[] args) {
		
		/*Curso java = new Curso();
		
		java.setDenominacion("Beca Java");
		java.setHoras(90);
		java.setAcademia("Experis");
		
		System.out.println(java.getDenominacion());
		System.out.println(java.getHoras());
		System.out.println(java.getAcademia());*/
		
		Curso git = new Curso("GitHub", -10, "Experis");
		System.out.println(git.getDenominacion());
		System.out.println(git.getHoras());
		System.out.println(git.getAcademia());
	}

}
