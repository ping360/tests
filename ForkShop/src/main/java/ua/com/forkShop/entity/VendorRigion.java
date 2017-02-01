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
@Table(name = "vendor_rigion")
public class VendorRigion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@ManyToMany(mappedBy = "vendorRigion")
	private List<Vendor> vendor = new ArrayList<>();
	public VendorRigion(int id, String name, List<Vendor> vendor) {
		super();
		this.id = id;
		this.name = name;
		this.vendor = vendor;
		
	}
	public VendorRigion(String name, List<Vendor> vendor) {
		super();
		this.name = name;
		this.vendor = vendor;
	}
	public VendorRigion(String name) {
		super();
		this.name = name;
	}
	public VendorRigion() {
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
	public List<Vendor> getVendor() {
		return vendor;
	}
	public void setVendor(List<Vendor> vendor) {
		this.vendor = vendor;
	}
	
}
