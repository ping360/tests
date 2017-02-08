package ua.com.forkShop.service;

import java.util.List;

import ua.com.forkShop.entity.VendorRegion;

public interface VendorRegionService {
	void save (VendorRegion vendorRigion);
	List<VendorRegion> findAll();
	VendorRegion findOne(int id);
	void delete(int id);
}
