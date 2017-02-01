package ua.com.forckshop.dao;

import java.util.List;
import ua.com.forckshop.entity.Model;

public interface ModelDao {
	void save (Model model);
	List<Model> findAll();
	Model findOne(int id);
	void delete(int id);
}
