package ua.com.forkShop.dao;

import java.util.List;

import ua.com.forkShop.entity.�haracteristics;

public interface CharacteristicsDao {
	void save (�haracteristics characteristics);
	List<�haracteristics> findAll();
	�haracteristics findOne(int id);
	void delete(int id);

}
