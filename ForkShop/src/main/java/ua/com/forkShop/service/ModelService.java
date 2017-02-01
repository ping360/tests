package ua.com.forckshop.service;

import java.util.List;
import ua.com.forckshop.entity.Model;

public interface ModelService {
	void save (Model model);
	List<Model> findAll();
	Model findOne(int id);
	void delete(int id);
}
