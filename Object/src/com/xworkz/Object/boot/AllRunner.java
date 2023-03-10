package com.xworkz.Object.boot;

import com.xworkz.Object.thing.Coconut;
import com.xworkz.Object.thing.Door;
import com.xworkz.Object.thing.Gold;
import com.xworkz.Object.thing.Paint;
import com.xworkz.Object.thing.Pipe;
import com.xworkz.Object.thing.SugarCane;

public class AllRunner {

	public static void main(String[] args) 
	{
		Paint paint=new Paint();
		paint.setBrand("Asian Paint");
		paint.setPrice(5500);
		paint.setColor("Blue");
		paint.setQuantity(15);
		
		System.out.println(paint.toString());
		System.out.println("Hash code of paint is: "+paint.hashCode());
		System.out.println("Original hashCode of paint is :"+System.identityHashCode(paint));
	
		Paint paint1=new Paint();
		paint1.setBrand("Rolex Paint");
		paint1.setPrice(10000);
		paint1.setColor("Red");
		paint1.setQuantity(10);
		System.out.println(paint1);
		paint=paint1;
		System.out.println(paint);
		System.out.println(paint.equals(paint1));
		
		System.out.println("Original hashCode of paint1 is :"+System.identityHashCode(paint1));
		System.out.println("Original hashCode of paint is :"+System.identityHashCode(paint));
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		Pipe pipe=new Pipe();
		pipe.setBrand("Astral Pipe");
		pipe.setPrice(4500);
		pipe.setSize(12);
		pipe.setMaterial("Steel");
		
		System.out.println(pipe.toString());
		System.out.println("Hash code of Pipe is: "+pipe.hashCode());
		System.out.println("Original hashCode of Pipe is :"+System.identityHashCode(pipe));
	
		Pipe pipe1=new Pipe();
		pipe1.setBrand("Apollo Pipe");
		pipe1.setPrice(6500);
		pipe1.setSize(55);
		pipe1.setMaterial("Copper");
		System.out.println(pipe1);
		pipe=pipe1;
		System.out.println(pipe);
		System.out.println(pipe.equals(pipe1));
		
		System.out.println("Original hashCode of pipe1 is :"+System.identityHashCode(pipe1));
		System.out.println("Original hashCode of pipe is :"+System.identityHashCode(pipe));
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		Coconut coconut=new Coconut();
		coconut.setPrice(40);
		coconut.setSize("Small");
		coconut.setQuantity(12);
		coconut.setMaterial("Fiber");
		System.out.println(coconut);
		System.out.println("Hash code of Coconut is :"+coconut.hashCode());
		System.out.println("Original hashcode of Coconut is:"+System.identityHashCode(coconut));
		
		Coconut coconut1=new Coconut();
		coconut1.setPrice(60);
		coconut1.setSize("Big");
		coconut1.setQuantity(8);
		coconut1.setMaterial("Flesh");
		System.out.println(coconut1);
		System.out.println(coconut.equals(coconut1));
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		Gold gold=new Gold();
		gold.setPrice(5000);
		gold.setWeight(10);
		gold.setDensity(19300);
		gold.setColor("Golden ");
		System.out.println(gold);
		System.out.println("Hash code of Gold is :"+gold.hashCode());
		System.out.println("Original hashcode of Gold is:"+System.identityHashCode(gold));
		Gold gold1=new Gold();
		gold1.setPrice(550000);
		gold1.setWeight(15);
		gold1.setDensity(16300);
		gold1.setColor("Golden");
		System.out.println(gold1.toString());
		System.out.println(gold.equals(gold1));
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		Door door=new Door();
		door.setPrice(12000);
		door.setMaterial("Wood");
		door.setType("Folding Door");
		door.setSize(12);
		System.out.println(door);
		System.out.println("Hash code of Door is: "+door.hashCode());
		System.out.println("Original Hash Code of Door is: "+System.identityHashCode(door));
		
		Door door1=new Door();
		door1.setPrice(10000);
		door1.setMaterial("Steel");
		door1.setType("Slider");
		door1.setSize(30);
		System.out.println(door1);
		System.out.println(door.equals(door1));
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
		SugarCane cane=new SugarCane();
		cane.setPrice(30);
		cane.setMaterial("White Sugar");
		cane.setType("Gandak");
		cane.setSize("Long");
		System.out.println(cane);
		System.out.println("Hash code of SugarCane is: "+cane.hashCode());
		System.out.println("Original Hash Code of SugarCane is: "+System.identityHashCode(cane));
		
		SugarCane cane1=new SugarCane();
		cane1.setPrice(20);
		cane1.setMaterial("Brown Sugar");
		cane1.setType("Rasbhari");
		cane1.setSize("Short");
		System.out.println(cane1);
		cane=cane1;
		System.out.println(cane.equals(cane1));
	}

}
