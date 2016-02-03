package org.campus02.generic;

public class MayBe <T> {

	private T data;
	private int status;
	
	public static final int ZugriffErlaubt = 1;
	public static final int ZugriffVerboten = 2;
	public static final int NichtVorhanden = 3;
	
	public MayBe(T data, int status)
	{
		this.data = data;
		this.status = status;
	}
	
	public void setStatus(int status)
	{
		this.status = status;
	}
	
	public String toString()
	{
		switch (status) {
		case ZugriffErlaubt:
			return "Zugriff erlaubt: " + data;
	
		case ZugriffVerboten:
			return "Zugriff nicht erlaubt!";
		case NichtVorhanden:
			return "Keine Daten!";
	
		default:
			System.out.println("falscher status");
			return"";
		}
	}
	
}
