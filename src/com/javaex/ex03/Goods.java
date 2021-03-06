package com.javaex.ex03;

public class Goods {

	// 필드 (캡슐화 --> private으로 접근제한)
	private String name;
	private int price;

	// 생성자

	// 메소드 - gs
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

	// 메소드 - 일반
	public void showInfo() {
		System.out.println("*상품이름:" + name);
		System.out.println("*가격:" + price);
		System.out.println();
	}
}
