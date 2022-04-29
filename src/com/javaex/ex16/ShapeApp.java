package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {

		Shape s = new Shape("red", "yellow");

		Rectangle r = new Rectangle("red", "black", 5, 5);
		System.out.println(r.getWidth()); // 자식의 메소드 사용가능

		// 메모리에는 다 올라가고 부모쪽만 보인다 (섞어쓰면 보통 그렇다)
		Shape sr = new Rectangle("red", "black", 15, 15);
		// System.out.println(r.getWidth()); //자식의 메소드를 사용할 수 없다.

		///////////////////////////////////
		// Shape 배열의 모든 도형을 관리하고 싶다.//
		///////////////////////////////////

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

		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw(); // Override가 적용되었기에 가능한 출력방법
			System.out.println(sArray[i].area()); // Override가 적용되었기에 가능한 출력방법
		}

		// 형변환(down casting) --> Shape(부모)에서 Rectangle(자식) 메소드 불러오는 방법.
		// down casting 하려면 ()로 묶어줘야만 getWidth(자식에 속해 있는 메소드)를 불러올 수 있다.
		System.out.println(((Rectangle) sArray[0]).getWidth());

		for (int i = 0; i < sArray.length; i++) {
			sArray[i].setLineColor("보라");
		}

		for (int i = 0; i < sArray.length; i++) {
			sArray[i].setFillColor("보라");
		}
	}
}
