package ua.com.forkShop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "digital_unit")
public class DigitalUnit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "_name")
	private String name;
	
	@ManyToMany(mappedBy="digitalUnits")
	private List<Item> items = new ArrayList<>();
	
	@ManyToMany(mappedBy="digitalUnits")
	private List<FeatureDigital> featureDigitals = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<FeatureDigital> getFeatureDigitals() {
		return featureDigitals;
	}

	public void setFeatureDigitals(List<FeatureDigital> featureDigitals) {
		this.featureDigitals = featureDigitals;
	}
	
	
}
