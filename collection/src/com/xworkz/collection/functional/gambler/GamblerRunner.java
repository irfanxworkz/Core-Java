package com.xworkz.collection.functional.gambler;

public class GamblerRunner {

	public static void main(String[] args) {
		
		Util.test((arg1)->{
			if(arg1>500 && arg1<1000) {
				System.out.println("Principle between 500 and 1000:"+arg1);
			}
			return 0;
		});
		
		Util.test((arg1)->{
			if(arg1>1000) {
				System.out.println("Principle greater than 1000: "+arg1);
			}
			return 100;
		});

	}

}
