package ua.com.forkShop.service;

import java.util.List;

import ua.com.forkShop.entity.Ñharacteristics;

public interface CharacteristicsService {
	void save (Ñharacteristics characteristics);
	List<Ñharacteristics> findAll();
	Ñharacteristics findOne(int id);
	void delete(int id);

}
