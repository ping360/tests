package ua.com.boltShop.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.boltShop.dao.BookDao;
import ua.com.library.entity.Book;

@Repository
public class BookDaoImpl implements BookDao{

	@PersistenceContext(unitName="primary")
	private EntityManager manager;
	
	@Transactional
	public void save(Book book) {
		manager.persist(book);
	}

	@Transactional
	public List<Book> findAll() {
		return manager.createQuery("from Book").getResultList();
	}

	@Transactional
	public Book findOne(int id) {
		return manager.find(Book.class, id);
	}

	@Transactional
	public void delete(int id) {
		manager.remove(id);		
	}

}
