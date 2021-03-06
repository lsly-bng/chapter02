package com.javaex.ex15;

public class Triangle extends Shape {

	// field
	private int width;
	private int height;

	// constructor
	public Triangle() {
		super();
	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
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
	public void draw () {
		System.out.println("면색:"+fillColor+", 선색:"+lineColor+", 가로:"+width+", 세로:"+height+" 삼각형을 그렸습니다.");
	}
	
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}

}
