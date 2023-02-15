package com.xworkz.inheritanceWithHierarchical.boot;
import com.xworkz.inheritanceWithHierarchical.thing.GoldBangle;
import com.xworkz.inheritanceWithHierarchical.thing.SilverBangle;
import com.xworkz.inheritanceWithHierarchical.thing.Bangle;
public class BangleRunner {

	public static void main(String[] args) 
	{
		GoldBangle bangle1=new GoldBangle();
		int quentity=bangle1.getQuantity();
		System.out.println(quentity);
		double price=bangle1.getPrice();
		System.out.println(price);
		bangle1.getPrice();
		
		Bangle bangle2=new SilverBangle();
		int quantity=bangle2.getQuantity();
		System.out.println(quantity);
		
		if(bangle1 instanceof GoldBangle)
		{
		GoldBangle bangle3=(GoldBangle) bangle1;
		double price1=bangle3.getPrice();
		System.out.println(price1);

		}
		else
		{
			System.out.println("bangle1 is not ref to GoldBangle class...");
		}

	}

}
