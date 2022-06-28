package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Fruit { 
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 60)
	private String fruitname;
	private double fruitprice;
	
	private int quantity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFruitname() {
		return fruitname;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}
	public double getFruitprice() {
		return fruitprice;
	}
	public void setFruitprice(double fruitprice) {
		this.fruitprice = fruitprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Fruit(String fruitname, double fruitprice, int quantity) {
		super();
		this.fruitname = fruitname;
		this.fruitprice = fruitprice;
		this.quantity = quantity;
	}
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
