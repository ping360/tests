package ua.com.forckshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.forckshop.dao.CharacteristicsDao;
import ua.com.forckshop.entity.Сharacteristics;
@Service
public class CharacteristicsServiceImp implements CharacteristicsDao{
	@Autowired
	private CharacteristicsDao characteristicsDao;

	public void save(Сharacteristics characteristics) {
		characteristicsDao.save(characteristics);
		
	}

	public List<Сharacteristics> findAll() {
		return characteristicsDao.findAll();
	}

	public Сharacteristics findOne(int id) {
		return characteristicsDao.findOne(id);
	}

	public void delete(int id) {
		characteristicsDao.delete(id);
	}
}
