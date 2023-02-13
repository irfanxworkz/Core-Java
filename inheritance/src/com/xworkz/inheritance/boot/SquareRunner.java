package com.xworkz.inheritance.boot;
import com.xworkz.inheritance.thing.Square;
import com.xworkz.inheritance.thing.Table;
public class SquareRunner {

	public static void main(String[] args)
	{
		Square s1=new Square();
		s1.p1();
		Square s2=new Table();
		s2.p1();
		Table s3=new Table();
		s3.p1();
	}

}
