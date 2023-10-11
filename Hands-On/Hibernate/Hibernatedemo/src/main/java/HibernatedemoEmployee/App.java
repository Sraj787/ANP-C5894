package HibernatedemoEmployee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
    	
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
    	
        Employee emp1 = new Employee();
        emp1.setId(2);
        emp1.setEmp_name("vipin");
        emp1.setEmp_dept("IT");
        emp1.setEmp_desig("developer");
        emp1.setSalary(2222.52);
        
        session.save(emp1);
        tx.commit();
        session.close();
        
        System.out.println("Task sucessfull completed");
    	
        
    }

	
}
