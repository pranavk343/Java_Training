package com.example.Day4;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Items {
	@Id
	private int item_id;
	private String item_description;
	private int item_cost;
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart_Obj;
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_description() {
		return item_description;
	}
	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}
	public int getItem_cost() {
		return item_cost;
	}
	public void setItem_cost(int item_cost) {
		this.item_cost = item_cost;
	}
	public Cart getCart_Obj() {
		return cart_Obj;
	}
	public void setCart_Obj(Cart cart_Obj) {
		this.cart_Obj = cart_Obj;
	}
	public Items() {
		super();
	}
	public Items(int item_id, String item_description, int item_cost, Cart cart_Obj) {
		this.item_id = item_id;
		this.item_description = item_description;
		this.item_cost = item_cost;
		this.cart_Obj = cart_Obj;
	}	
}
