package com.xworkz.assosiation.things;

public class Wallet {
	public String brand;
	public int price;
	public String metarial;
	public Money money;
	
	public Wallet()
	{
		System.out.println("creating a no arguments constructor ...");
	}
	public Wallet(String brand,int price,String metarial)
	{
		this.brand=brand;
		this.price=price;
		this.metarial=metarial;
		System.out.println("creating 3 arguments constructor....");
	}
	public void init(String brand,int price,String metarial)
	{
		this.brand=brand;
		this.price=price;
		this.metarial=metarial;
	}
	public void init(Money money)
	{
		this.money=money;
	}
	public void show()
	{
		System.out.println("within show method");
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.metarial);
		System.out.println("without show method");
		if(this.money !=null)
		{
			this.money.show1();
		} 
		else
		{
			System.err.println("this.money is not pointing to memory...");
		}
	}
	
	
}
