package com.javaex.ex17;

public class Circle extends Shape {

	// field
	private int radius;

	// constructor
	public Circle() {
		super();
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	// method - g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// method - general
	public void draw() {
		System.out.println("면색:"+fillColor+", 선색:"+lineColor+", 반지름:"+radius+" 원을 그렸습니다.");
	}
	
	public double area() {
		double area = 3.14*radius*radius;
		return area;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

}
