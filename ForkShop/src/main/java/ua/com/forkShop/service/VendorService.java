package ua.com.forckshop.service;

import java.util.List;

import ua.com.forckshop.entity.Vendor;

public interface VendorService {
	void save (Vendor vendor);
	List<Vendor> findAll();
	Vendor findOne(int id);
	void delete(int id);
}
