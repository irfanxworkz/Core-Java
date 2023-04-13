package com.xworkz.collection.functional.eater;

public class EatenRunner {

	public static void main(String[] args) {
		
		Util.test((arg1,arg2)->{
			System.out.println("Item is: "+arg1);
			System.out.println("Item in Lower case: "+arg1.toLowerCase());
			System.out.println("Item in Upper case: "+arg1.toUpperCase());
			return arg1;
		});

	}

}
