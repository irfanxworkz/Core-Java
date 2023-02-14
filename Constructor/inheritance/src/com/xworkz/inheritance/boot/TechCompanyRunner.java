package com.xworkz.inheritance.boot;
import com.xworkz.inheritance.thing.TechCompany;
import com.xworkz.inheritance.thing.Apple;
public class TechCompanyRunner {

	public static void main(String[] args) 
	{
		TechCompany tech1=new TechCompany();
		tech1.b3();
		TechCompany tech2=new Apple();
		tech2.b3();
		Apple tech3=new Apple();
		tech3.b3();
	}

}
