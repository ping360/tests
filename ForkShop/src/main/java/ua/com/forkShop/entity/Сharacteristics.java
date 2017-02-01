package ua.com.forkShop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ua.com.forkShop.entity.Model;

@Entity
@Table(name = "characteristics")
public class Ñharacteristics {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String itemch;
	@ManyToOne
	@JoinColumn(name = "id_category")
	private Model model;
	public Ñharacteristics(int id, String itemch, Model model) {
		super();
		this.id = id;
		this.itemch = itemch;
		this.model = model;
		
	}
	public Ñharacteristics(String itemch, Model model) {
		super();
		this.itemch = itemch;
		this.model = model;
	}
	public Ñharacteristics(String itemch) {
		super();
		this.itemch = itemch;
	}
	public Ñharacteristics() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemch() {
		return itemch;
	}
	public void setItemch(String itemch) {
		this.itemch = itemch;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	
}
