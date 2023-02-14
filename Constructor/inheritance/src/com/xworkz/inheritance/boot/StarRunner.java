package com.xworkz.inheritance.boot;
import com.xworkz.inheritance.thing.Star;
import com.xworkz.inheritance.thing.Sun;
public class StarRunner {

	public static void main(String[] args)
	{
		Star s1=new Star();
		s1.m3();
		Star s2=new Sun();
		s2.m3();
		Sun s3=new Sun();
		s3.m3();
				
	}

}
