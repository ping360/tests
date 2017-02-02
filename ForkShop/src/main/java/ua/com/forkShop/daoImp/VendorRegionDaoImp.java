package ua.com.forkShop.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.forkShop.dao.VendorRegionDao;
import ua.com.forkShop.entity.VendorRegion;

@Repository
public class VendorRegionDaoImp implements VendorRegionDao{

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Transactional
	public void save(VendorRegion vendorRegion) {
		manager.persist(vendorRegion);

	}

	@Transactional
	public List<VendorRegion> findAll() {
		return manager.createQuery("FROM VendorRegion").getResultList();
	}

	@Transactional
	public VendorRegion findOne(int id) {
		return manager.find(VendorRegion.class, id);
	}

	@Transactional
	public void delete(int id) {
		manager.remove(id);

	}
}
