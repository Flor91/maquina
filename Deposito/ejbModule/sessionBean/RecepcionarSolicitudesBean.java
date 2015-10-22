package sessionBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.deposito.ejb.RecepSolicitudesArticulosLocal;
import com.deposito.ejb.RecepSolicitudesArticulosRemote;

/**
 * Session Bean implementation class RecepSolicitudesArticulos
 */
@Stateless
@LocalBean
public class RecepcionarSolicitudesBean implements RecepSolicitudesArticulosRemote, RecepSolicitudesArticulosLocal {

    /**
     * Default constructor. 
     */
    public RecepcionarSolicitudesBean() {
        // TODO Auto-generated constructor stub
    }

}
