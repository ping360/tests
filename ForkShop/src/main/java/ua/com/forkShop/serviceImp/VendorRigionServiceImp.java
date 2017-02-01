package ua.com.forckshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.forckshop.dao.VendorRigionDao;
import ua.com.forckshop.entity.VendorRigion;
import ua.com.forckshop.service.VendorRigionService;
@Service
public class VendorRigionServiceImp implements VendorRigionService{
	@Autowired
	private VendorRigionDao vendorRigionDao;

	public void save(VendorRigion vendorRigion) {
		vendorRigionDao.save(vendorRigion);
	}

	public List<VendorRigion> findAll() {
		return vendorRigionDao.findAll();
	}

	public VendorRigion findOne(int id) {
		return vendorRigionDao.findOne(id);
	}

	public void delete(int id) {
		vendorRigionDao.delete(id);
	}
}
