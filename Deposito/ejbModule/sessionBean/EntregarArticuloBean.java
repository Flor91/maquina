package sessionBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.deposito.ejb.EntregarArticuloBeanLocal;
import com.deposito.ejb.EntregarArticuloBeanRemote;

/**
 * Session Bean implementation class EntregarArticuloBean
 */
@Stateless
@LocalBean
public class EntregarArticuloBean implements EntregarArticuloBeanRemote, EntregarArticuloBeanLocal {

    /**
     * Default constructor. 
     */
    public EntregarArticuloBean() {
        // TODO Auto-generated constructor stub
    }

}
