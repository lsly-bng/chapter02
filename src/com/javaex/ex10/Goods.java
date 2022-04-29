package com.javaex.ex10;

public class Goods {

	// field
	private String name;
	private int price;
	public static int count;

	// constructor
	public Goods() {
		Goods.setCount(getCount() + 1);
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		this.setCount(getCount() + 1);
	}

	// method - g/s
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

	static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Goods.count = count;
	}
	// method - general

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
