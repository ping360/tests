package ua.com.forkShop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.forkShop.dao.CharacteristicsDao;
import ua.com.forkShop.entity.Ñharacteristics;
@Service
public class CharacteristicsServiceImp implements CharacteristicsDao{
	@Autowired
	private CharacteristicsDao characteristicsDao;

	public void save(Ñharacteristics characteristics) {
		characteristicsDao.save(characteristics);
		
	}

	public List<Ñharacteristics> findAll() {
		return characteristicsDao.findAll();
	}

	public Ñharacteristics findOne(int id) {
		return characteristicsDao.findOne(id);
	}

	public void delete(int id) {
		characteristicsDao.delete(id);
	}
}
