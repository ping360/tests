package ua.com.forkShop.dao;

import java.util.List;

import ua.com.forkShop.entity.Characteristics;

public interface CharacteristicsDao {
	void save (Characteristics characteristics);
	List<Characteristics> findAll();
	Characteristics findOne(int id);
	void delete(int id);

}
