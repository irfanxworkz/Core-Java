package com.xworkz.collection.functional.runner;

public class RunnerRunner {

	public static void main(String[] args) {
		
		Util.test((arg1)->{
		System.out.println("Running Distance:"+arg1);
		return arg1;
		});

	}

}
