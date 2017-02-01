package ua.com.forckshop.service;

import java.util.List;

import ua.com.forckshop.entity.Сharacteristics;

public interface CharacteristicsService {
	void save (Сharacteristics characteristics);
	List<Сharacteristics> findAll();
	Сharacteristics findOne(int id);
	void delete(int id);

}
