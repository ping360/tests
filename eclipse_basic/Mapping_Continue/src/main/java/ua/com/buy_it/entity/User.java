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
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String password;
	private String email;
	
	@ManyToOne
	private City city;
	
	@ManyToMany
	@JoinTable(name="user_commodities", 
	joinColumns=@JoinColumn(name="id_user"), 
	inverseJoinColumns=@JoinColumn(name="id_commodity"))
	private List<Commodity> commodities;
	
	public User() {
		
	}
	
	
}
