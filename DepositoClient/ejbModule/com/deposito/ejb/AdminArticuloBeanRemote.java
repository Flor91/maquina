package com.deposito.ejb;

import javax.ejb.Remote;

@Remote
public interface AdminArticuloBeanRemote {
	
	public String nuevoArticulo (String nombre, String descripcion, String tipo, float stock);
	
	public String test(String n);

}
