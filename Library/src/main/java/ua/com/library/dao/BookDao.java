package ua.com.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import ua.com.library.entity.Author;
import ua.com.library.entity.Book;

public class BookDao{

	final EntityManager manager;

	public BookDao(EntityManager manager) {
		super();
		this.manager = manager;
	}

	public void save(Book book) {
		manager.getTransaction().begin();
		manager.persist(book);
		manager.getTransaction().commit();

	}

	public List<Book> findAll() {

		List<Book> books = manager.createQuery("from Book").getResultList();

		return books;
	}

	public Book finOne(String title) {

		Book book = (Book) manager.createQuery("select b from Book b where b.title =:param")
				.setParameter("param", title).getSingleResult();

		return book;

	}

	public void delete(String title) {
		manager.getTransaction().begin();
		manager.remove(finOne(title));
		manager.getTransaction().commit();
	}
	
	
	public void addAuthorToBook(String bookName, String authorName){
		manager.getTransaction().begin();
		
		Author author = (Author) manager.
				createQuery("select a from Author a where a.name =:param").
				setParameter("param", authorName).
				getSingleResult();
		
		
		Book book = (Book) manager.
				createQuery("select b from Book b where b.title =:param").
				setParameter("param", bookName)
				.getSingleResult();
		
		book.setAuthor(author);
		
		
		manager.getTransaction().commit();
	}
	
	
	
	
	
	

}
