package ua.com.forkShop.dao;

import java.util.List;

import ua.com.forkShop.entity.VendorRegion;

public interface VendorRegionDao {
	void save (VendorRegion vendorRigion);
	List<VendorRegion> findAll();
	VendorRegion findOne(int id);
	void delete(int id);
}
