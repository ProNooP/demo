package org.campus02.demo;

import org.campus02.generic.MayBe;

public class DemoApp {

	public static void main(String[] args) {
		
		// Hello World
		System.out.println("Hello World! :-)");

		MayBe<String> name = new MayBe<String>("Hans", 
				MayBe.NichtVorhanden);
		
		System.out.println(name);
		
		name.setStatus(MayBe.ZugriffErlaubt);
		
		System.out.println(name);
	}

}
