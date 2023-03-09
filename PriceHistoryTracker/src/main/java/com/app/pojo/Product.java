package com.app.pojo;

import javax.persistence.*;

@Entity
@Table(name="Product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String prodName;
	private double prodPrice;
	@OneToOne
	@JoinColumn(name="manufacturerId")
	private Manufacturer manufacturer;
	private String model;
	private String year;
	@OneToOne
	@JoinColumn(name="categoryId")
	private Category category;
	public Product( String prodName, double prodPrice, Manufacturer manufacturer, String model, String year,
			Category category) {
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
		this.category = category;
	}
	public Product() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", manufacturer="
				+ manufacturer + ", model=" + model + ", year=" + year + ", category=" + category + "]";
	}
	
	
	
}
