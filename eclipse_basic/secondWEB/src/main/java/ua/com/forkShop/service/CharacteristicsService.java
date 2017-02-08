package ua.com.forkShop.service;

import java.util.List;

import ua.com.forkShop.entity.Characteristics;

public interface CharacteristicsService {
	void save (Characteristics characteristics);
	List<Characteristics> findAll();
	Characteristics findOne(int id);
	void delete(int id);

}
