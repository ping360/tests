package ua.com.library.service;

import ua.com.library.dao.BookDao;
import ua.com.library.daoImpl.BookDaoImpl;
import ua.com.library.entity.Book;


public class BookService {
    BookDao bookDao;

    public void save(Book book){
        book.getTitle().toUpperCase();
        bookDao.save(book);
    }


}