package org.gouff.objectRepository;

public enum Enum1 {
	
	HOME("Home"),RESTURANTS("Restaurants"),MYORDER("My Orders"),LOGIN("Login"),LOGOUT("Logout"),USERS("Users"),RESTURANT("Restaurant"),MENU("Menu"),ORDER("Orders");
	private String enum1;
	private Enum1(String enum1) {
		this.enum1=enum1;
	}
public String getEnum1() {
	return enum1;
}
}
