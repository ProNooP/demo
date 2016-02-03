package org.campus02.figures;

public class Rectangle extends Figure {

	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width =width;
		this.length = length;
	}
		
	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * length;
	}

}
