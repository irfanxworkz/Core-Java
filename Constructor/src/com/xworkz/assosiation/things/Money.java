package com.xworkz.assosiation.things;

public class Money {
	
	public String currency;
	public int value;
	
	public Money(String currency, int value)
	{
		this.currency=currency;
		this.value=value;
	}
	
	public void show1()
	{
		System.out.println("Currency is :"+currency);
		System.out.println("Value is :"+value);
	}

}
