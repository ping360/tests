package ua.com.forckshop.dao;

import java.util.List;

import ua.com.forckshop.entity.Category;

public interface CategoryDao {
	void save (Category category);
	List<Category> findAll();
	Category findOne(int id);
	void delete(int id);
}
