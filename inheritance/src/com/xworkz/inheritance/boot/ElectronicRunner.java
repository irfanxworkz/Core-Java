package com.xworkz.inheritance.boot;
import com.xworkz.inheritance.thing.ElectronicGadget;
import com.xworkz.inheritance.thing.Phone;
public class ElectronicRunner {

	public static void main(String[] args)
	{
		ElectronicGadget ed=new ElectronicGadget("Smart Watch");
		ed.a1();
		
		ElectronicGadget electronicgadget=new Phone();
		electronicgadget.a1();
		
		Phone phone=new Phone();
		phone.a1();
	}

}
