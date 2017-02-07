package ua.com.forkShop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.forkShop.dao.CharacteristicsDao;
import ua.com.forkShop.entity.Characteristics;
@Service
public class CharacteristicsServiceImp implements CharacteristicsDao{
	@Autowired
	private CharacteristicsDao characteristicsDao;

	public void save(Characteristics characteristics) {
		characteristicsDao.save(characteristics);
		
	}

	public List<Characteristics> findAll() {
		return characteristicsDao.findAll();
	}

	public Characteristics findOne(int id) {
		return characteristicsDao.findOne(id);
	}

	public void delete(int id) {
		characteristicsDao.delete(id);
	}
}
