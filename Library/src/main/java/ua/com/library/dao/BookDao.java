package ua.com.library.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ua.com.library.entity.Author;
import ua.com.library.entity.Book;
import ua.com.library.entity.User;

public class BookDao {

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

		Book book = (Book) manager
				.createQuery("select b from Book b where b.title =:param")
				.setParameter("param", title).getSingleResult();

		return book;

	}

	public void delete(String title) {
		manager.getTransaction().begin();
		manager.remove(finOne(title));
		manager.getTransaction().commit();
	}

	public void addAuthorToBook(String bookName, String authorName) {
		manager.getTransaction().begin();

		Author author = (Author) manager
				.createQuery("select a from Author a where a.name =:param")
				.setParameter("param", authorName).getSingleResult();

		Book book = (Book) manager
				.createQuery("select b from Book b where b.title =:param")
				.setParameter("param", bookName).getSingleResult();

		book.setAuthor(author);

		manager.getTransaction().commit();
	}

	
	/*  
	    TESTING
		TESTING
		TESTING
		TESTING
	*/
	
	
	//many to many
	
	public void deleteBookFromUser(String username, String bookName){
		manager.getTransaction().begin();
		
		
		User user = (User) manager
				.createQuery("select u from User u where u.surname =:surname")
				.setParameter("surname", username)
				.getSingleResult();
		
		Book book = (Book) manager
				.createQuery("select b from Book where b.title =:title")
				.setParameter("title", bookName)
				.getSingleResult();
		
		book.getUsers().remove(user);
		// or
		user.getBooks().remove(book);
		
		manager.getTransaction().commit();
	}

	
	//one to many
	
	public void deleteAuthorFromBook(String bookName){
		manager.getTransaction().begin();
		
		Book book = (Book) manager
				.createQuery("select b from Book where b.title =:title")
				.setParameter("title", bookName)
				.getSingleResult();
		
		book.setAuthor(null);
		
		manager.getTransaction().commit();
	}
	
	//delete Author and save books
	
	public void deleteAllBooksFromAuthor(String surnname){
		manager.getTransaction().begin();
		
		Author author = (Author) manager
				.createQuery("select a from Author a where a.surname :=surname")
				.setParameter("surname", surnname)
				.getSingleResult();
		
		for (Book book : author.getBooks()) {
			book.setAuthor(null);
			manager.merge(book);
		}
		
		manager.remove(author);
		
		manager.getTransaction().commit();
	}
	
}
