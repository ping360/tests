package ua.com.forkShop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "feature_string")
public class FeatureString {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="_name")
	private String name;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_name_of_feature_string")
	private NameOfFeatureDigital nameOfFeatureDigital;
	
	@ManyToMany(mappedBy="featuresDigitals")
	private List<Item> items = new ArrayList<>();

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

	public NameOfFeatureDigital getNameOfFeatureDigital() {
		return nameOfFeatureDigital;
	}

	public void setNameOfFeatureDigital(NameOfFeatureDigital nameOfFeatureDigital) {
		this.nameOfFeatureDigital = nameOfFeatureDigital;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
}
