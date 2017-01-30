package ua.com.boltShop.controller;


import javax.enterprise.context.spi.Context;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.com.boltShop.service.BookService;
import ua.com.boltShop.serviceImpl.BookServiceImpl;
import ua.com.library.entity.Book;


public class Main {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =
				new ClassPathXmlApplicationContext("/META-INF/appContext.xml");
		
		BookService bookService =
				(BookService) context.getBean(BookServiceImpl.class);
		
		bookService.save(new Book("Atropos", 199));
		
		context.close();
	}

	
}
