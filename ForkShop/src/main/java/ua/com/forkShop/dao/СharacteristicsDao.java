package ua.com.forkShop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.com.forkShop.entity.Category;
import ua.com.forkShop.entity.Ñharacteristics;

public interface ÑharacteristicsDao extends JpaRepository<Ñharacteristics, Integer> {

	Category findByName(String name);
	
	@Query("select c from Category c left join fetch m.characteristics where c.name=:param")
	Category fetchCategoryWithCharacteristics(@Param("param")String name);
}
