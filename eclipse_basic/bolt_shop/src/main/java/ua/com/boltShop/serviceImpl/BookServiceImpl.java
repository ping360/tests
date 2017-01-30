package ua.com.boltShop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.boltShop.dao.BookDao;
import ua.com.boltShop.service.BookService;
import ua.com.library.entity.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	
	public void save(Book book) {
	book.getTitle().toUpperCase();
	bookDao.save(book);	
	}

	public List<Book> findAll() {
		return bookDao.findAll();
	}

	public Book findOne(int id) {
		return bookDao.findOne(id);
	}

	public void delete(int id) {
		bookDao.delete(id);
	}

	public void addBookToAuthor(int Book, int Author) {
		Book book = bookDao.findOne(Book);
	}

	
}
