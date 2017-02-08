package ua.com.forkShop.service;

import java.util.List;

import ua.com.forkShop.entity.Vendor;

public interface VendorService {
	void save (Vendor vendor);
	List<Vendor> findAll();
	Vendor findOne(int id);
	void delete(int id);
}
