package ua.com.buy_it.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Subcategory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;

	@ManyToOne
	private Category categories;
	
	@ManyToMany
	@JoinTable(name="commodity_Subcategory",
	joinColumns=@JoinColumn(name="id_Subcategory"),
	inverseJoinColumns=@JoinColumn(name="id_Category"))
	private List<Commodity> commodities;
	
	public Subcategory() {
	
	}
	
	
}
