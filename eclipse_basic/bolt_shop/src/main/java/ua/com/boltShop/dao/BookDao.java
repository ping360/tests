package ua.com.boltShop.dao;

import java.util.List;

import ua.com.library.entity.Book;

public interface BookDao {

	void save(Book book);
	List<Book> findAll();
	Book findOne(int id);
	void delete(int id);
}
