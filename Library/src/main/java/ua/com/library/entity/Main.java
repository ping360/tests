package ua.com.library.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import ua.com.library.dao.BookDao;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("primary");

		EntityManager manager = factory.createEntityManager();

		//

		BookDao bookDao = new BookDao(manager);

		// bookDao.save(new Book("Pillars of Earth", 619));

		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Book> bookCriteriaQuery = builder.createQuery(Book.class);
		Root<Book> booRoot = bookCriteriaQuery.from(Book.class);
		Expression<Integer> expression = booRoot.get("pages");
		Predicate predicatePages = builder.le(expression, 1500);
		Expression<String> expression1 = booRoot.get("title");
		Predicate predicateTitle = builder.notEqual(expression1, "hp");
		Predicate pd = builder.and(predicatePages, predicateTitle);
		bookCriteriaQuery.where(pd);
		List<Book> list = manager.createQuery(bookCriteriaQuery)
				.getResultList();
		System.out.println(list);

		// Join and Fetch
		Author author = (Author) manager.createQuery(
				"select a from Author a join a.books b where b.title = 'some'")
				.getSingleResult();

		bookDao.finOne("some");

		manager.close();

		factory.close();

	}

}
