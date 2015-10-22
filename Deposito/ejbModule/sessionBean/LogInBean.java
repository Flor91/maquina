package sessionBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class LogIn
 */
@Stateful
@LocalBean
public class LogInBean implements LogInRemote, LogInLocal {

    /**
     * Default constructor. 
     */
    public LogInBean() {
        // TODO Auto-generated constructor stub
    }

}
