package org.campus02.figures;

public class Circle extends Figure {

	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * radius * Math.PI;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(radius, 2) * Math.PI;
	}

}
