package ua.com.library.daoImpl;

import ua.com.library.dao.BookDao;
import ua.com.library.entity.Author;
import ua.com.library.entity.Book;
import ua.com.library.entity.User;

import javax.persistence.EntityManager;


public class BookDaoImpl implements BookDao {

    private EntityManager manager;

    public void save(Book book) {
        manager.getTransaction().begin();
        manager.persist(book);
        manager.getTransaction().commit();
    }

    public void deteleBookFromUser(String username, String bookTitle) {
        manager.getTransaction().begin();

        User user = (User) manager
                .createQuery("select u from User u where u.name =:param")
                .setParameter("param", username)
                .getSingleResult();

        Book book = (Book) manager
                .createQuery("select b from Book b where b.title =:title")
                .setParameter("title", bookTitle)
                .getSingleResult();

        book.getUsers().remove(user);

//        or

//        user.getBooks().remove(book);

        manager.getTransaction().commit();


    }

    public void deleteBookFromAuthor(String bookName) {

        manager.getTransaction().begin();

        Book book = (Book) manager
                .createQuery("select b from Book b where b.title =:title")
                .setParameter("title", bookName)
                .getSingleResult();

        book.setAuthor(null);

        manager.getTransaction().commit();

    }

    public void deleteAllBooksFormAuthor(String authorSurName){

        manager.getTransaction().begin();

        Author author = (Author) manager
                .createQuery("select a from Author a where a.surname =:surname")
                .setParameter("surname", authorSurName)
                .getSingleResult();


        for (Book book : author.getBooks()) {

//            book.setAuthor(null);
//            manager.merge(book);

//            manager.remove(book);
        }

        manager.remove(author);


        manager.getTransaction().commit();

    }

}