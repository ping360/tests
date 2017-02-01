package ua.com.forckshop.service;

import java.util.List;

import ua.com.forckshop.entity.VendorRigion;

public interface VendorRigionService {
	void save (VendorRigion vendorRigion);
	List<VendorRigion> findAll();
	VendorRigion findOne(int id);
	void delete(int id);
}
