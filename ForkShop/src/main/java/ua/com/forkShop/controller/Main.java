package ua.com.forckshop.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.com.forckshop.entity.Category;
import ua.com.forckshop.service.CategoryService;
import ua.com.forckshop.serviceImp.CategoryServiceImp;

public class Main {
public static void main(String[] args) {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/appContext.xml");

	CategoryService categoryService = context.getBean(CategoryServiceImp.class);
	categoryService.save(new Category("Shit"));
	
	context.close();
}
}
