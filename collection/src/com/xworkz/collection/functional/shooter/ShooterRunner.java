package com.xworkz.collection.functional.shooter;

public class ShooterRunner {

	public static void main(String[] args) {
		
		Util.test((arg1)->{
			System.out.println("Shooter gun type:"+arg1);
			return true;
		});

	}

}
