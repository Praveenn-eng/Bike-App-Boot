import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeDelete {
	
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
	EntityManager em = emf.createEntityManager();
	
	EntityTransaction et = em.getTransaction();
	
	Employe  e1 = em.find(Employe.class, 1);
	
	
	em.remove(e1);
	System.out.println("deleted Sucessfuly");
	
}
	
	

}
