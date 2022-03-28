import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeMerge {
	
	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
	
	EntityManager em = emf.createEntityManager();
	
	EntityTransaction et = em.getTransaction();
	Employe e = new Employe();
	
	Employe e1 = em.find(Employe.class, 1);
	e1.setName("Rohan");
	
	Employe e2 = em.find(Employe.class, 2);
	
	
	et.begin();
	em.merge(e1);
	et.commit();
	}

}
