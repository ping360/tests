package ua.com.forkShop.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.forkShop.dao.CharacteristicsDao;
import ua.com.forkShop.entity.Ñharacteristics;
@Repository
public class CharacteristicsDaoImp implements CharacteristicsDao{
	@PersistenceContext(unitName="primary")
	private EntityManager manager;
	
	@Transactional
	public void save(Ñharacteristics characteristics) {
		manager.persist(characteristics);
		
	}

	@Transactional
	public List<Ñharacteristics> findAll() {
		return manager.createQuery("FROM Characteristics").getResultList();
	}

	@Transactional
	public Ñharacteristics findOne(int id) {
		return manager.find(Ñharacteristics.class, id);
	}

	@Transactional
	public void delete(int id) {
		manager.remove(id);
		
	}
}
