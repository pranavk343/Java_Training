package com.example.Day4;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	@Id
	private int cart_id;
	private String username;
	@OneToMany(mappedBy = "cart_Obj")
	private Set<Items> item;
	public Cart() {
	}	
	
	public Cart(int cart_id, String username) {
		this.cart_id = cart_id;
		this.username = username;
	}

	public Set<Items> getItem() {
		return item;
	}
	public void setItem(Set<Items> item) {
		this.item = item;
	}
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
