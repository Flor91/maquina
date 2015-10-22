package cliente;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.deposito.ejb.AdminArticuloBeanRemote;

public class Prueba {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		
		final Hashtable jndiProperties = new Hashtable();
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		jndiProperties.put("jboss.naming.client.ejb.context", true);
		final Context context = new InitialContext(jndiProperties);
		final String earName = "DepositoEAR"; // Nombre del módulo EAR
		final String ejbModuleName = "Deposito"; // Nombre del módulo EJB
		final String distinctName = ""; // Opcional para resolver repeticiones en nombres
		final String ejbClassName = "AdminArticuloBean"; // Nombre corto del EJB
		final String fullInterfaceName = AdminArticuloBeanRemote.class.getName();
		String lookupName = "ejb:" + earName + "/" + ejbModuleName + "/" + 
				distinctName + "/" + ejbClassName + "!" + fullInterfaceName;
		System.out.println("Conectando a " + lookupName);
		AdminArticuloBeanRemote aabr = (AdminArticuloBeanRemote) context.lookup(lookupName);
		System.out.println("Respuesta: " + aabr.test("Flor"));
		
		
		/*final String statefulEjbClassName = "StatefulCalcService"; // Nombre corto del EJB
		final String statefulFullInterfaceName = StatefulCalcServiceRemote.class.getName();
		String statefulLookupName = "ejb:" + earName + "/" + ejbModuleName + "/" + 
				distinctName + "/" + statefulEjbClassName + "!" + statefulFullInterfaceName + 
				"?stateful";
		System.out.println("Conectando a " + statefulLookupName);
		StatefulCalcServiceRemote calc = (StatefulCalcServiceRemote) context.lookup(statefulLookupName);
		calc.add(10);
		calc.substract(3);
		System.out.println("Respuesta: " + calc.getValue());*/

	}

}
