package com.app.pojo;

import javax.persistence.*;

@Entity
@Table(name="Tracker")
public class Tracker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne
	@JoinColumn(name="userId")
	private User user;
	@OneToOne
	@JoinColumn(name="productId")
	private Product product;
	private String url;
	private double prevPrice;
	private double currPrice;
	public Tracker(User user, Product product,String url, double prevPrice, double currPrice) {
		
		this.user = user;
		this.url=url;
		this.product = product;
		this.prevPrice = prevPrice;
		this.currPrice = currPrice;
	}
	public Tracker() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String geturl() {
		return url;
	}
	public void seturl(String url) {
		this.url = url;
	}
	public double getPrevPrice() {
		return prevPrice;
	}
	public void setPrevPrice(double prevPrice) {
		this.prevPrice = prevPrice;
	}
	public double getCurrPrice() {
		return currPrice;
	}
	public void setCurrPrice(double currPrice) {
		this.currPrice = currPrice;
	}
	@Override
	public String toString() {
		return "Tracker [id=" + id + ", user=" + user + ", product=" + product + ", prevPrice=" + prevPrice
				+ ", currPrice=" + currPrice + "]";
	}
	
	
	
	
}
