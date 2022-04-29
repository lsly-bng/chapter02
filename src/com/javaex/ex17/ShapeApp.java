package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {

		/*
		 * //Shape is an abstract (추상) class --> therefore cannot be instantiated.
		 * Shape s = new Shape("red", "yellow");
		 */
		
		//비교
		Rectangle r = new Rectangle("red","black",100,1000);
		
		//Shape 배열 생성
		Shape[] sArray = new Shape[6];

		// 사각형 2개
		Shape r01 = new Rectangle("red", "black", 4, 4);
		Shape r02 = new Rectangle("blue", "black", 5, 5);
		// 원 2개
		Shape c01 = new Circle("green", "black", 3);
		Shape c02 = new Circle("purple", "black", 5);
		// 삼각형 2개
		Shape t01 = new Triangle("white", "black", 5, 5);
		Shape t02 = new Triangle("orange", "black", 10, 10);

		sArray[0] = r01;
		sArray[1] = r02;
		sArray[2] = c01;
		sArray[3] = c02;
		sArray[4] = t01;
		sArray[5] = t02;
		
		for (int i=0;i<sArray.length; i++) {
			sArray[i].draw();
			System.out.println(sArray[i].area());
		}
		
		
	}
}
