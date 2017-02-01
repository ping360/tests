package ua.com.forckshop.dao;

import java.util.List;

import ua.com.forckshop.entity.Vendor;

public interface VendorDao {
	void save (Vendor vendor);
	List<Vendor> findAll();
	Vendor findOne(int id);
	void delete(int id);
}
