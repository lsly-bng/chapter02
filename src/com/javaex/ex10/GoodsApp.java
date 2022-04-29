package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera= new Goods("니콘",400000);
		System.out.println(camera.toString());
		System.out.println(Goods.getCount());
		
		Goods laptop = new Goods();
		laptop.setName("LG그램");
		laptop.setPrice(900000);
		System.out.println(laptop.toString());
		System.out.println(Goods.getCount());

		Goods cup = new Goods("머그컵",2000);
		System.out.println(cup.toString());
		System.out.println(Goods.getCount());
	}

}
