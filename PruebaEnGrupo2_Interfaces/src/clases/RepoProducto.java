package clases;

import java.util.HashMap;

import interfaces.ICRUD;

public class RepoProducto implements ICRUD<Integer,Producto>{
	
	//Campos
	//======
	
	HashMap<Integer, Producto> repoProducto= new HashMap<Integer, Producto>();

	//Constructores
	//==============
	public RepoProducto(HashMap<Integer, Producto> repoProducto) {
		this.repoProducto = repoProducto;
	}

	public RepoProducto() {
	}

	//Metodos
	//=======
	@Override
	public HashMap<Integer, Producto> listar() {
		return repoProducto;
	}

	@Override
	public Producto leer(Integer pk) {
		
		Producto p1=this.repoProducto.get(pk);
		
		return p1;
		
	}

	@Override
	public void nuevo(Producto modelo) {
		
		this.repoProducto.put(modelo.numProducto, modelo);
	}

	@Override
	public void eliminar(Integer pk) {
		
		this.repoProducto.remove(pk);
	}

	@Override
	public void editar(Producto modelo, Integer pk) {
		
		this.repoProducto.put(pk, modelo);
	}

	//Me
	
	

}
