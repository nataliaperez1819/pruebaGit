package interfaces;

import java.util.HashMap;

public interface ICRUD<PK,MODELO> {
	
	public HashMap<PK,MODELO> listar();
	public MODELO leer (PK pk);
	
	public void nuevo(MODELO modelo);
	public void eliminar(PK pk);
	public void editar(MODELO modelo, PK pk);
	

}
