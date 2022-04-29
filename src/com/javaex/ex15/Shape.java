package com.javaex.ex15;

public class Shape {

	// field
	protected String fillColor;
	protected String lineColor;

	// constructor
	public Shape() {
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	// method - g/s
	public String getFillColor() {
		return fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	// method - general
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + "] 도형을 그렸습니다. ");
	}

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

}
