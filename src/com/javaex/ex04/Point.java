package com.javaex.ex04;

public class Point {

	// field
	private int x;
	private int y;

	// constructor

	public Point() {
	}
	
	public Point(int x) {
		this.x = x;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// method - getter/setter
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// method - general
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y +"]을 그렸습니다.");
	}

	public void draw(boolean action) {
		if(action == true) {
			System.out.println("점[x=" + x + ", y=" + y +"]을 그렸습니다.");
		}else {
			System.out.println("점[x=" + x + ", y=" + y +"]을 지웠습니다.");
		}
	}
}
