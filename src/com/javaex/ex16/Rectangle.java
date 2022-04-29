package com.javaex.ex16;

public class Rectangle extends Shape {

	// field
	private int width;
	private int height;

	// constructor
	public Rectangle() {
		super();
	}

	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	// method - g/s
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// method - general
	public void draw() {
		System.out.println("면색:" + fillColor + ", 선색:" + lineColor + ", 가로:" + width + ", 세로:"
				+ height + " 사각형을 그렸습니다.");
	}

	public double area() {
		double area = width*height;
		return area;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}
}
