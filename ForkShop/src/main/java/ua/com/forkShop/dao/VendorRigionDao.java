package ua.com.forkShop.dao;

import java.util.List;

import ua.com.forkShop.entity.VendorRigion;

public interface VendorRigionDao {
	void save (VendorRigion vendorRigion);
	List<VendorRigion> findAll();
	VendorRigion findOne(int id);
	void delete(int id);
}
