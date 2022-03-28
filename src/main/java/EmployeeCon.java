import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeCon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		et.begin();

		Employe dt = new Employe();

		dt.setId(1);
		dt.setName("Praveen");
		dt.setEmail("Praveenbarde");
		dt.setDeptment("Computer java");
		dt.setCompany("Test Yantra");
		dt.setPassword(1234);
		dt.setPhno(99999999);
		dt.setSalary(40000);

		System.out.println("Enter the Name");
		String name = sc.next();
		
		System.out.println("ENter the Email ");
		String email = sc.next();
		
		System.out.println("Enter the Dept");
		String dept = sc.next();
		
		System.out.println("Enter the Company Name");
		String company = sc.next();
		
		System.out.println("Enter the Password");
		int pass = sc.nextInt();
		
		System.out.println("Enter the Phone Number");
		long phno = sc.nextLong();
		
		System.out.println("Enter the Salary");
		int salary = sc.nextInt()0

		em.persist(dt);

		et.commit();

		System.out.println("Sucessful");

	}

}
