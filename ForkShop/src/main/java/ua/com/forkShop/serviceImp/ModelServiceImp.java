package ua.com.forckshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.forckshop.dao.ModelDao;
import ua.com.forckshop.entity.Model;
import ua.com.forckshop.service.ModelService;
@Service
public class ModelServiceImp implements ModelService{
	@Autowired
	private ModelDao modelDao;

	public void save(Model model) {
		modelDao.save(model);
		
	}

	public List<Model> findAll() {
		return modelDao.findAll();
	}

	public Model findOne(int id) {
		return modelDao.findOne(id);
	}

	public void delete(int id) {
		modelDao.delete(id);
	}
}
