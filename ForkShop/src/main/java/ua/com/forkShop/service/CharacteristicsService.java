package ua.com.forkShop.service;

import java.util.List;

import ua.com.forkShop.entity.�haracteristics;

public interface CharacteristicsService {
	void save (�haracteristics characteristics);
	List<�haracteristics> findAll();
	�haracteristics findOne(int id);
	void delete(int id);

}
