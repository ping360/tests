package ua.com.forckshop.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.forckshop.dao.CharacteristicsDao;
import ua.com.forckshop.entity.Сharacteristics;
@Repository
public class CharacteristicsDaoImp implements CharacteristicsDao{
	@PersistenceContext(unitName="primary")
	private EntityManager manager;
	
	@Transactional
	public void save(Сharacteristics characteristics) {
		manager.persist(characteristics);
		
	}

	@Transactional
	public List<Сharacteristics> findAll() {
		return manager.createQuery("FROM Characteristics").getResultList();
	}

	@Transactional
	public Сharacteristics findOne(int id) {
		return manager.find(Сharacteristics.class, id);
	}

	@Transactional
	public void delete(int id) {
		manager.remove(id);
		
	}
}
