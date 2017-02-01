package ua.com.forckshop.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.forckshop.dao.CategoryDao;
import ua.com.forckshop.entity.Category;
@Repository
public class CategoryDaoImp implements CategoryDao{
	
	@PersistenceContext(unitName="primary")
	private EntityManager manager;
	
	@Transactional
	public void save(Category category) {
		manager.persist(category);
		
	}

	@Transactional
	public List<Category> findAll() {
		return manager.createQuery("FROM Category").getResultList();
	}

	@Transactional
	public Category findOne(int id) {
		return manager.find(Category.class, id);
	}

	@Transactional
	public void delete(int id) {
		manager.remove(id);
		
	}

}
