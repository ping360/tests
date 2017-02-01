package ua.com.forkShop.service;

import java.util.List;

import ua.com.forkShop.entity.VendorRigion;

public interface VendorRigionService {
	void save (VendorRigion vendorRigion);
	List<VendorRigion> findAll();
	VendorRigion findOne(int id);
	void delete(int id);
}
