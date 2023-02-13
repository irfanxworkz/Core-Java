package com.xworkz.inheritance.boot;
import com.xworkz.inheritance.thing.Metal;
import com.xworkz.inheritance.thing.Ring;
public class MetalRunner {

	public static void main(String[] args)
	{
		Metal metal=new Metal();
		metal.m2();
		Metal metal2=new Ring();
		metal2.m2();
		Ring ring=new Ring();
		ring.m2();
	}

}
