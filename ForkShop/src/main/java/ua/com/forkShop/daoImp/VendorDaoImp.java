package ua.com.forckshop.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.forckshop.dao.VendorDao;
import ua.com.forckshop.entity.Vendor;
@Repository
public class VendorDaoImp implements VendorDao{
	@PersistenceContext(unitName="primary")
	private EntityManager manager;
	
	@Transactional
	public void save(Vendor vendor) {
		manager.persist(vendor);
		
	}

	@Transactional
	public List<Vendor> findAll() {
		return manager.createQuery("FROM Vendor").getResultList();
	}

	@Transactional
	public Vendor findOne(int id) {
		return manager.find(Vendor.class, id);
	}

	@Transactional
	public void delete(int id) {
		manager.remove(id);
		
	}
}
