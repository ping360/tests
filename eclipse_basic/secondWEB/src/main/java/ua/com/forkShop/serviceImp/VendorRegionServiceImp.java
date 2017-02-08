package ua.com.forkShop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.forkShop.dao.VendorRegionDao;
import ua.com.forkShop.entity.VendorRegion;
import ua.com.forkShop.service.VendorRegionService;
@Service
public class VendorRegionServiceImp implements VendorRegionService{
	@Autowired
	private VendorRegionDao vendorRegionDao;

	public void save(VendorRegion vendorRigion) {
		vendorRegionDao.save(vendorRigion);
	}

	public List<VendorRegion> findAll() {
		return vendorRegionDao.findAll();
	}

	public VendorRegion findOne(int id) {
		return vendorRegionDao.findOne(id);
	}

	public void delete(int id) {
		vendorRegionDao.delete(id);
	}
}
