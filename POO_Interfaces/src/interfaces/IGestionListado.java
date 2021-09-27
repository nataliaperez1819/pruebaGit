package interfaces;

public interface IGestionListado {
	
	//Los métodos abstractos no tienen llaves ni código dentro
	
	//Por defecto ya es público y abstracto
	//public abstract void nuevo();
	void nuevo(int numero); //1.
	void listar(); //2.
	void eliminar(Integer numero); //3.
	void eliminar(); //4.
}
