package com.xworkz.Concept.boot;

import com.xworkz.Concept.thing.FootWare;

public class FootWareRunner 
{
	FootWare foot1=new FootWare("Relexo",8,"sport shoes");
	System.out.println(foot1);
	//System.out.println("-----------");
	
	FootWare foot2=new FootWare("Red-Tape",9,"Formal shoes");
	System.out.println(foot2);
	//System.out.println("-----------");
	
	FootWare foot3=new FootWare("Puma",7,"Slipper");
	System.out.println(foot3);
	//System.out.println("-----------");
	
	boolean equals=foot1.equals(foot2);
	System.out.println("both are same :"+equals);
	//System.out.println("-----------");
	
	boolean equals1=foot2.equals(foot3);
	System.out.println("both are Same :"+equals1);
	//System.out.println("-----------");
	
}
