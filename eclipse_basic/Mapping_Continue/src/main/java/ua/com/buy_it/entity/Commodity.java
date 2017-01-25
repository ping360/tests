package ua.com.buy_it.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="commodity")
public class Commodity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private double price;
	private double weight;
	
	@ManyToMany
	@JoinTable(name="user_commodities", 
	joinColumns=@JoinColumn(name="id_commodity"), 
	inverseJoinColumns=@JoinColumn(name="id_user"))
	private List<User> users;
	
//	@ManyToMany
//	@JoinTable(name="user_commodities", 
//	joinColumns=@JoinColumn(name="id_user"), 
//	inverseJoinColumns=@JoinColumn(name="id_commodity"))
//	private List<Subcategory> subcategories;
	
	public Commodity() {
		
	}
	
	
	
}
