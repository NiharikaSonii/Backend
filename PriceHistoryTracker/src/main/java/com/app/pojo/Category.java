package com.app.pojo;

import javax.persistence.*;

@Entity
@Table(name="Category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String categoryname;
	public Category(String categoryname) {
		this.categoryname = categoryname;
	}
	public Category() {
		 
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + categoryname + "]";
	}
	
	
}
