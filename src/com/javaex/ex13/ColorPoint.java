package com.javaex.ex13;

public class ColorPoint extends Point {

	//field
	private String color;

	//constructor
	public ColorPoint() {
		super();
	}

	public ColorPoint (String color) {
		super();
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}

	//method - g/s
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//method - general
	public void showInfo () {
		System.out.println("x: "+x+", y: "+y+", color: "+color);
	}

	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", x=" + x + ", y=" + y + "]";
	}

}
