package com.xworkz.collection.functional.hunter;

public class HunterRunner {

	public static void main(String[] args) {
		Hunter hunte=new HunterImpl();
		Hunter ref=(arg1)->{
			System.out.println("Running lembda expression: "+arg1);
		};
		Util.test(ref);//explicit ref

		
		Util.test((arg1)->{
			System.out.println("Running fun in "+arg1);
		});//implicitly ref
	}
}
