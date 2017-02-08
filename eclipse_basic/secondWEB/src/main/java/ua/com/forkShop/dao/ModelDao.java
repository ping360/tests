package ua.com.forkShop.dao;

import java.util.List;
import ua.com.forkShop.entity.Model;

public interface ModelDao {
	void save (Model model);
	List<Model> findAll();
	Model findOne(int id);
	void delete(int id);
}
