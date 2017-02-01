package ua.com.forckshop.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.forckshop.dao.VendorRigionDao;
import ua.com.forckshop.entity.VendorRigion;

@Repository
public class VendorRigionDaoImp implements VendorRigionDao{

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Transactional
	public void save(VendorRigion vendorRigion) {
		manager.persist(vendorRigion);

	}

	@Transactional
	public List<VendorRigion> findAll() {
		return manager.createQuery("FROM VendorRigion").getResultList();
	}

	@Transactional
	public VendorRigion findOne(int id) {
		return manager.find(VendorRigion.class, id);
	}

	@Transactional
	public void delete(int id) {
		manager.remove(id);

	}
}
