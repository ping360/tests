package ua.com.forckshop.service;

import java.util.List;

import ua.com.forckshop.entity.Category;

public interface CategoryService {
	void save (Category category);
	List<Category> findAll();
	Category findOne(int id);
	void delete(int id);
}
