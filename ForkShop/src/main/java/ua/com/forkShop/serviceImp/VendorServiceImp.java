package ua.com.forckshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.forckshop.dao.VendorDao;
import ua.com.forckshop.entity.Vendor;
import ua.com.forckshop.service.VendorService;
@Service
public class VendorServiceImp implements VendorService{
	@Autowired
	private VendorDao vendorDao;

	public void save(Vendor vendor) {
		vendorDao.save(vendor);
		
	}

	public List<Vendor> findAll() {
		return vendorDao.findAll();
	}

	public Vendor findOne(int id) {
		return vendorDao.findOne(id);
	}

	public void delete(int id) {
		vendorDao.delete(id);
	}
}
