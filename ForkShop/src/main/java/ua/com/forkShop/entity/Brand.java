package ua.com.forkShop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String bName;
	private String country;
	
	public Brand(){
		
	}

	public Brand(int id, String name, String country) {
		super();
		this.id = id;
		this.bName = name;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return bName;
	}

	public void setName(String name) {
		this.bName = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + bName + ", country=" + country + "]";
	}
	
	
}
