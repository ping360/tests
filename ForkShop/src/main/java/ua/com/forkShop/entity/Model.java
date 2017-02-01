package ua.com.forkShop.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "model")
public class Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	private BigDecimal price;
	@ManyToOne
	@JoinColumn(name = "id_vendor")
	private Vendor vendor;
	@ManyToOne
	@JoinColumn(name = "id_category")
	private Category category;
	@OneToMany(mappedBy = "model")
	private List<Ñharacteristics> characteristics = new ArrayList<>();
	public Model(int id, String name, BigDecimal price, Vendor vendor,
			Category category, List<Ñharacteristics> characteristics) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.vendor = vendor;
		this.category = category;
		this.characteristics = characteristics;
	}
	public Model(String name, BigDecimal price, Vendor vendor,
			Category category, List<Ñharacteristics> characteristics) {
		super();
		this.name = name;
		this.price = price;
		this.vendor = vendor;
		this.category = category;
		this.characteristics = characteristics;
	}
	public Model(String name) {
		super();
		this.name = name;
	}
	public Model() {
		super();
	}
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Ñharacteristics> getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(List<Ñharacteristics> characteristics) {
		this.characteristics = characteristics;
	}
	
}
