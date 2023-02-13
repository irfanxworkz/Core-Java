package com.xworkz.inheritance.boot;
import com.xworkz.inheritance.thing.Breakfast;
import com.xworkz.inheritance.thing.Dosa;
public class BreakFastRunner {

	public static void main(String[] args)
	{
		  Breakfast breakfast=new Breakfast();
		  breakfast.m1();
		  Breakfast br1=new Dosa();
		  br1.m1();
		  Dosa dosa=new Dosa();
		  dosa.m1();
	}

}
