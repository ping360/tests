package ua.com.forkShop.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.com.forkShop.entity.Category;
import ua.com.forkShop.service.CategoryService;
import ua.com.forkShop.serviceImp.CategoryServiceImp;

public class Main {
public static void main(String[] args) {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/appContext.xml");

	CategoryService categoryService = (CategoryService) context.getBean(CategoryServiceImp.class);
	categoryService.save(new Category("Shit"));
	
	context.close();
}
}
