package ua.com.forkShop.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.forkShop.dao.ModelDao;
import ua.com.forkShop.entity.Model;
@Repository
public class ModelDaoImp implements ModelDao{
	@PersistenceContext(unitName="primary")
	private EntityManager manager;
	
	@Transactional
	public void save(Model model) {
		manager.persist(model);
		
	}

	@Transactional
	public List<Model> findAll() {
		return manager.createQuery("FROM Model").getResultList();
	}

	@Transactional
	public Model findOne(int id) {
		return manager.find(Model.class, id);
	}

	@Transactional
	public void delete(int id) {
		manager.remove(id);
		
	}
}
