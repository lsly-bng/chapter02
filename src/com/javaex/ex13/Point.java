package com.javaex.ex13;

public class Point {

	//field
	protected int x;
	protected int y;
	
	//constructor
	public Point() {
		super();
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	//method - g/s
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//method - general
	public void showInfo () {
		System.out.println("x: "+x+", y: "+y);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
	
	
	
}
