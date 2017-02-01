package ua.com.forkShop.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.forkShop.dao.CharacteristicsDao;
import ua.com.forkShop.entity.�haracteristics;
@Repository
public class CharacteristicsDaoImp implements CharacteristicsDao{
	@PersistenceContext(unitName="primary")
	private EntityManager manager;
	
	@Transactional
	public void save(�haracteristics characteristics) {
		manager.persist(characteristics);
		
	}

	@Transactional
	public List<�haracteristics> findAll() {
		return manager.createQuery("FROM Characteristics").getResultList();
	}

	@Transactional
	public �haracteristics findOne(int id) {
		return manager.find(�haracteristics.class, id);
	}

	@Transactional
	public void delete(int id) {
		manager.remove(id);
		
	}
}
