package com.xworkz.collection.functional.player;

public class PlayerRunner {

	public static void main(String[] args) {
		
		Util.test((arg1, arg2)->{
			System.out.println("Name is: "+arg1.toUpperCase()); 
			return arg1;
		});
		
		Util.test((arg1, arg2)->{
			
			System.out.println("State is: "+arg2.toLowerCase());
			return arg2;
		});
		
		Util.test((arg1, arg2)->{
			System.out.println("Name and State: "+arg1+" " +arg2);
			return arg1+arg2;
		});


	}

}
