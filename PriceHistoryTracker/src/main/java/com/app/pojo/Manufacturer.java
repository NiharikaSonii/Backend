package com.app.pojo;

import javax.persistence.*;

@Entity
@Table(name="Manufacturer")
public class Manufacturer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String manufacturername;
	private String country;
	public Manufacturer(String manufacturername, String country) {
		super();
		this.manufacturername = manufacturername;
		this.country = country;
	}
	public Manufacturer() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getManufacturername() {
		return manufacturername;
	}
	public void setName(String manufacturername) {
		this.manufacturername = manufacturername;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Manufacturer [id=" + id + ", manufacturername=" + manufacturername + ", country=" + country + "]";
	}
	
}
