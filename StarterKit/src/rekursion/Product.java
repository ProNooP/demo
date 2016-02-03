package rekursion;

import java.util.ArrayList;

public class Product {
	private String name;
	private ArrayList<Product> parts;
	private double price;
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
		parts = new ArrayList<>();
	}
	
	public void add(Product p)
	{
		parts.add(p);
	}
	
	public double getPrice()
	{
		double gesamtpreis = price;
		for (Product product : parts) {
			gesamtpreis += product.getPrice();
		}
		
		return gesamtpreis;
	}
	
	public String print(String indent)
	{
		String erg = indent + name + " - " + getPrice();
		for (Product product : parts) {
			erg = erg + "\n" + 
					product.print("-" + indent);
		}
		
		return erg;
	}
	
	
	
	
	
	
	
	
}
