package ua.com.forkShop.entity;

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
@Table(name = "category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@ManyToOne
	@JoinColumn(name = "id_vendor")
	private Vendor vendor;
	@OneToMany(mappedBy = "category")
	private List<Model> model = new ArrayList<>();
	public Category(int id, String name, Vendor vendor, List<Model> model) {
		super();
		this.id = id;
		this.name = name;
		this.vendor = vendor;
		this.model = model;
		
	}
	public Category(String name, Vendor vendor, List<Model> model) {
		super();
		this.name = name;
		this.vendor = vendor;
		this.model = model;
	}
	public Category(String name) {
		super();
		this.name = name;
	}
	public Category() {
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
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public List<Model> getModel() {
		return model;
	}
	public void setModel(List<Model> model) {
		this.model = model;
	}
	
}
