package ua.com.forkShop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.forkShop.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	@Query("SELECT i FROM Item i LEFT JOIN FETCH i.category LEFT JOIN FETCH i.brand")
	List<Item> findAll();
	
	@Query("SELECT i FROM Item i WHERE i.category.id = ?1")
	List<Item> findByCategoryId(int id);
}
