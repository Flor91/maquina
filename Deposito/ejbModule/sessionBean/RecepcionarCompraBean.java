package sessionBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.deposito.ejb.RecepcionarCompraBeanLocal;
import com.deposito.ejb.RecepcionarCompraBeanRemote;

/**
 * Session Bean implementation class RecepcionarCompraBean
 */
@Stateless
@LocalBean
public class RecepcionarCompraBean implements RecepcionarCompraBeanRemote, RecepcionarCompraBeanLocal {

    /**
     * Default constructor. 
     */
    public RecepcionarCompraBean() {
        // TODO Auto-generated constructor stub
    }

}
