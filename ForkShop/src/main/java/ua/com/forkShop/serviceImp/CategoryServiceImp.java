package ua.com.forckshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.forckshop.dao.CategoryDao;
import ua.com.forckshop.entity.Category;
import ua.com.forckshop.service.CategoryService;
@Service
public class CategoryServiceImp implements CategoryService{
	@Autowired
	private CategoryDao categoryDao;

	public void save(Category category) {
		categoryDao.save(category);
		
	}

	public List<Category> findAll() {
		return categoryDao.findAll();
	}

	public Category findOne(int id) {
		return categoryDao.findOne(id);
	}

	public void delete(int id) {
		categoryDao.delete(id);
	}

}
