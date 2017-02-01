package ua.com.forckshop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@Column
private String name;
	@ManyToMany
	@JoinTable(name = "vendor_vendor_rigion", 
	joinColumns=@JoinColumn (name = "id_vendor"),
	inverseJoinColumns=@JoinColumn(name = "id_vendor_rigion"))
	private List<VendorRigion> vendorRigion = new ArrayList<>();
	@OneToMany(mappedBy = "vendor")
	private List <Model> model = new ArrayList<>();
	@OneToMany(mappedBy="vendor")
	private List <Category> category = new ArrayList<>();
	public Vendor(int id, String name, List<VendorRigion> vendorRigion,
			List<Model> model, List<Category> category) {
		super();
		this.id = id;
		this.name = name;
		this.vendorRigion = vendorRigion;
		this.model = model;
		this.category = category;
		
	}
	public Vendor(String name, List<VendorRigion> vendorRigion,
			List<Model> model, List<Category> category) {
		super();
		this.name = name;
		this.vendorRigion = vendorRigion;
		this.model = model;
		this.category = category;
	}
	public Vendor(String name) {
		super();
		this.name = name;
	}
	public Vendor() {
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
	public List<VendorRigion> getVendorRigion() {
		return vendorRigion;
	}
	public void setVendorRigion(List<VendorRigion> vendorRigion) {
		this.vendorRigion = vendorRigion;
	}
	public List<Model> getModel() {
		return model;
	}
	public void setModel(List<Model> model) {
		this.model = model;
	}
	public List<Category> getCategory() {
		return category;
	}
	public void setCategory(List<Category> category) {
		this.category = category;
	}
	
}
