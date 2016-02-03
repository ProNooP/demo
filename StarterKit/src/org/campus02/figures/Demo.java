package org.campus02.figures;

public class Demo {

	public static void main(String[] args) {
		
		FigureManager manager = new FigureManager();
		
		manager.add(new Rectangle(30, 400));
		manager.add(new Rectangle(0, 400));
		manager.add(new Rectangle(30, 1234));
		manager.add(new Rectangle(213, 421));
		manager.add(new Rectangle(30, 33));
		manager.add(new Circle(32));
		manager.add(new Circle(35));
		manager.add(new Circle(645));
		manager.add(new Circle(333));
		
		System.out.println(manager.getMaxPerimeter());
		System.out.println(manager.getAverageAreaSize());
		System.out.println(manager.getAreabySizeCategories());
	}

}
