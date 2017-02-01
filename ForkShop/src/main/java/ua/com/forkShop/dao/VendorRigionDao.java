package ua.com.forckshop.dao;

import java.util.List;

import ua.com.forckshop.entity.VendorRigion;

public interface VendorRigionDao {
	void save (VendorRigion vendorRigion);
	List<VendorRigion> findAll();
	VendorRigion findOne(int id);
	void delete(int id);
}
