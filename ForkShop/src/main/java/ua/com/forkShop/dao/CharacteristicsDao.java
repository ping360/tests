package ua.com.forckshop.dao;

import java.util.List;
import ua.com.forckshop.entity.Сharacteristics;

public interface CharacteristicsDao {
	void save (Сharacteristics characteristics);
	List<Сharacteristics> findAll();
	Сharacteristics findOne(int id);
	void delete(int id);

}
