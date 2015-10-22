package sessionBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.deposito.ejb.AdminArticuloBeanLocal;
import com.deposito.ejb.AdminArticuloBeanRemote;

import entityBean.Articulo;

/**
 * Session Bean implementation class AdminArticuloBean
 */
@Stateless
@LocalBean
public class AdminArticuloBean implements AdminArticuloBeanRemote, AdminArticuloBeanLocal {

    /**
     * Default constructor. 
     */
	
	@PersistenceContext
	private EntityManager em;
	
    public AdminArticuloBean() {
        // TODO Auto-generated constructor stub
    }
    
    public String nuevoArticulo (Articulo art){
    	em.create(art);
		return art.getCodigo();
		
    }
    
    public String test (String n){
    	return "Hola " + n;
    }
    
    public void modificarArticulo (String id, String nombre, String descripcion, String tipo, float stock){
    	
    }

    public Articulo buscarArticulo (String nombre){
    	Articulo a = new Articulo();
    	return a;
    }

	@Override
	public String nuevoArticulo(String nombre, String descripcion, String tipo, float stock) {
		// TODO Auto-generated method stub
		return null;
	}
}
