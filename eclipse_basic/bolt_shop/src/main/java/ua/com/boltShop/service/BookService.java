package ua.com.boltShop.service;

import java.util.List;

import ua.com.library.entity.Book;

public interface BookService {

	void save(Book book);
	List<Book> findAll();
	Book findOne(int id);
	void delete(int id);
	void addBookToAuthor(int Book, int Author);
}
