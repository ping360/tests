package ua.com.forkShop.dao;

import java.util.List;

import ua.com.forkShop.entity.Category;

public interface CategoryDao {
	void save (Category category);
	List<Category> findAll();
	Category findOne(int id);
	void delete(int id);
}
