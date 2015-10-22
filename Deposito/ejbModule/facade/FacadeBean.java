package facade;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class FacadeBean
 */
@Stateful
@LocalBean
public class FacadeBean implements FacadeBeanRemote, FacadeBeanLocal {

    /**
     * Default constructor. 
     */
    public FacadeBean() {
        // TODO Auto-generated constructor stub
    }

}
