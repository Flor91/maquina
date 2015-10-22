package com.deposito.ejb;

import javax.ejb.Local;

@Local
public interface AdminArticuloBeanLocal {
	
	public String nuevoArticulo (String nombre, String descripcion, String tipo, float stock);
	

}
