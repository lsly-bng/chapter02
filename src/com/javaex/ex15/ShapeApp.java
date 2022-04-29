package com.javaex.ex15;

public class ShapeApp {

	public static void main (String[] args) {
		
		Shape s01 = new Shape("red", "yellow");
		System.out.println(s01.toString());
		
		Rectangle [] rArray = new Rectangle[2];
		rArray[0]= new Rectangle ("red", "black",4,4);
		rArray[1]= new Rectangle ("orange", "black",4,4);
		
		for (int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		Circle[] cArray = new Circle[2];
		cArray[0] = new Circle("red", "purple", 3);
		cArray[1] = new Circle("white", "purple", 3);
		
		for (int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		Triangle [] tArray  = new Triangle[2];
		tArray [0] = new Triangle("orange", "black", 10,10);
		tArray [1] = new Triangle("yellow", "black", 10,10);
		
		for (int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
	}
}
