package com.xworkz.AbstractionWithInterfaceAndClass.boot;

import com.xworkz.AbstractionWithInterfaceAndClass.Association.Person;
import com.xworkz.AbstractionWithInterfaceAndClass.Implement.Dunzo;
import com.xworkz.AbstractionWithInterfaceAndClass.Implement.Rapido;
import com.xworkz.AbstractionWithInterfaceAndClass.things.Delivery;

public class Runner {

	public static void main(String[] args) {
		
		Delivery delivery=new Dunzo();
		Delivery delivery1=new Rapido();
		
		Person person=new Person(delivery);
	
		person.display();
		
	}

}
