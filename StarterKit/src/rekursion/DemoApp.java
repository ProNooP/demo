package rekursion;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product mainBoard = new Product("Mainboard", 5);
		mainBoard.add(new Product("Ram", 10));
		mainBoard.add(new Product("Cpu", 5));
		
		Product mac = new Product("Mac", 10);
		mac.add(new Product("screen", 8));
		mac.add(new Product("keyboard", 5));
		mac.add(mainBoard);
		
		System.out.println("Gesamtpreis: " + mac.getPrice());
		System.out.println("Verkaufspreis: " + mac.getPrice() * 100);
		
		System.out.println(mac.print(">"));
	}

}
