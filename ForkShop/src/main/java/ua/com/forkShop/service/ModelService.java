package ua.com.forkShop.service;

import java.util.List;
import ua.com.forkShop.entity.Model;

public interface ModelService {
	void save (Model model);
	List<Model> findAll();
	Model findOne(int id);
	void delete(int id);
}
