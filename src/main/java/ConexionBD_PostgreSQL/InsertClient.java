package ConexionBD_PostgreSQL;

import org.hibernate.*;
import org.hibernate.cfg.*;


public class InsertClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		
	}

}
