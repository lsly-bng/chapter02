package com.javaex.ex03;

public class GoodsApp {

	public static void main (String[] args) {
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		Goods laptop = new Goods();
		laptop.setName("LG그램");
		laptop.setPrice(900000);
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);

		/////////////////////////////////////////////////
		
		//출력
		camera.showInfo();
		laptop.showInfo();
		cup.showInfo();
		
		/*
		 * System.out.println("상품이름:"+camera.getName()+", 가격:"+camera.getPrice());
		 * System.out.println("상품이름:"+laptop.getName()+", 가격:"+laptop.getPrice());
		 * System.out.println("상품이름:"+cup.getName()+", 가격:"+cup.getPrice());
		 */		
	}
}
