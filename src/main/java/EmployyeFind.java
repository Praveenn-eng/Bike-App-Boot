import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployyeFind {
	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee");
		
		EntityManager em = emf.createEntityManager();
		
		    Employe q  = em.find(Employe.class,1);
		    
		    if(q!=null)
		    {
		    	System.out.println(q.getId());
		    	System.out.println(q.getName());
		    	System.out.println(q.getEmail());
		    	System.out.println(q.getCompany());
		    	System.out.println(q.getDeptment());
		    	System.out.println(q.getPassword());
		    	System.out.println(q.getPhno());
		    	System.out.println(q.getSalary());
		    }
		    
		    
		    
	}
	    
	    
	

}
