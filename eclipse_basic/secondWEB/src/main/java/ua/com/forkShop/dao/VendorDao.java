package ua.com.forkShop.dao;

import java.util.List;

import ua.com.forkShop.entity.Vendor;

public interface VendorDao {
	void save (Vendor vendor);
	List<Vendor> findAll();
	Vendor findOne(int id);
	void delete(int id);
}
