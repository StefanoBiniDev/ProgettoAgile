import javax.persistence.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Main class
public class Main {
//Main driver method
	public static void main(String[] args) {
//Create Configuration
		Configuration configuration = new Configuration();
		configuration.configure("pom.xml");
		configuration.addAnnotatedClass(MenuEntity.class);
		configuration.addAnnotatedClass(AntipastiEntity.class);
		
//Create Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
//Initialize Session Object
		Session session = sessionFactory.openSession();

		MenuEntity menuEntity1 = new MenuEntity();
		//song1.setId(1);
		AntipastiEntity antipastiEntity = new AntipastiEntity();
	  	menuEntity1.addAntipasto(antipastiEntity);
		session.beginTransaction();
//Here we have used
//save() method of JPA
		session.save(menuEntity1);
		session.getTransaction().commit();
	}
}