package com.javaex.ex09;

public class Goods {

	//field
	private String name;
	private int price;
	
	//constructor
	public Goods () {
		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	//method - g/s
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	//method - general
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	public void showInfo() {
		System.out.println("상품이름:" + name);
		System.out.println("가격:" + price);
		System.out.println();
	}
	
}
