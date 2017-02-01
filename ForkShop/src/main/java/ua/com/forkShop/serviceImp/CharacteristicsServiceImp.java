package ua.com.forkShop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.forkShop.dao.CharacteristicsDao;
import ua.com.forkShop.entity.�haracteristics;
@Service
public class CharacteristicsServiceImp implements CharacteristicsDao{
	@Autowired
	private CharacteristicsDao characteristicsDao;

	public void save(�haracteristics characteristics) {
		characteristicsDao.save(characteristics);
		
	}

	public List<�haracteristics> findAll() {
		return characteristicsDao.findAll();
	}

	public �haracteristics findOne(int id) {
		return characteristicsDao.findOne(id);
	}

	public void delete(int id) {
		characteristicsDao.delete(id);
	}
}
