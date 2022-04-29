package com.javaex.ex14;

public class Rectangle {

	// field
	private String fillColor;
	private String lineColor;
	private int width;
	private int height;

	// constructors
	public Rectangle() {
		super();
	}

	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}

	// method - g/s
	public String getFillColor() {
		return fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// method - general

	public void draw() {
		System.out.println("면색:"+fillColor+", 선색:"+lineColor+", 가로:"+width+", 세로:"+height+" 사각형을 그렸습니다.");
	}

	@Override
	public String toString() {
		return "Rectangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}

}
