package ua.com.forkShop.dao;

import java.util.List;

import ua.com.forkShop.entity.Ñharacteristics;

public interface CharacteristicsDao {
	void save (Ñharacteristics characteristics);
	List<Ñharacteristics> findAll();
	Ñharacteristics findOne(int id);
	void delete(int id);

}
