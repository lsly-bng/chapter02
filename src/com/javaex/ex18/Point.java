package com.javaex.ex18;

public class Point implements Drawable {
	
	//field 
	private int x;
	private int y;
	
	//constructor
	public Point() {
		super();
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	//method - gs
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
	public void draw () {
		System.out.println("[x="+x+", y="+y+"] 점을 그렸습니다.");
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
