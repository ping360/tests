package ua.com.library.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.com.library.dao.BookDao;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");

		EntityManager manager = factory.createEntityManager();

//		
		
		BookDao bookDao = new BookDao(manager);
		
		
//		bookDao.save(new Book("Pillars of Earth", 619));
		bookDao.finOne("some");
		
		manager.close();

		factory.close();

	}
	
	

}
