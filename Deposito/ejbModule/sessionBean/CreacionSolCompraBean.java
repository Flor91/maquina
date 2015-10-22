package sessionBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.deposito.ejb.CreacionSolCompraBeanLocal;
import com.deposito.ejb.CreacionSolCompraBeanRemote;

/**
 * Session Bean implementation class CreacionSolCompraBean
 */
@Stateless
@LocalBean
public class CreacionSolCompraBean implements CreacionSolCompraBeanRemote, CreacionSolCompraBeanLocal {

    /**
     * Default constructor. 
     */
    public CreacionSolCompraBean() {
        // TODO Auto-generated constructor stub
    }

}
