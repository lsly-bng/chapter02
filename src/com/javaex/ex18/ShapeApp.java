package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		 * Point p01 = new Point(3, 5); p01.draw(); System.out.println(p01.getX());
		 * 
		 * Drawable p02 = new Point(100, 100); p02.draw();
		 * 
		 * System.out.println("======================"); Rectangle r00 = new
		 * Rectangle("red", "black", 5, 5); r00.draw(); r00.area();
		 * 
		 * System.out.println("======================"); Shape r01 = new
		 * Rectangle("red", "black", 10, 10); r01.area(); // r01.draw(); X
		 * 
		 * System.out.println("======================"); Drawable r02 = new
		 * Rectangle("red", "black", 3, 3); r02.draw(); // r02.area(); X //
		 * r02.getWidth(); X
		 */

		// 배열선언
		Drawable[] dArray = new Drawable[4];

		Rectangle r01 = new Rectangle("red", "blue", 1, 1);
		Circle c01 = new Circle("white", "black", 3);
		Triangle t01 = new Triangle("yellow", "orange", 4, 4);
		Point p01 = new Point(3, 2);

		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;

		for (int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}

		// 사각형의 가로값
		System.out.println(((Rectangle) dArray[0]).getWidth());

		// 사각형의 면의 색
		System.out.println(((Shape) dArray[0]).getFillColor());

		System.out.println("=======================");
		System.out.println("배열의 통해서 면적 구하기");

		for (int i = 0; i < dArray.length; i++) {
			//System.out.println( dArray[i] instanceof Drawable);
			 if (dArray[i] instanceof Shape) { System.out.println(((Shape)
			 dArray[i]).area()); }
		}
	}
}
