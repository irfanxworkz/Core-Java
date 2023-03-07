package com.xworkz.abstraction.things;

public class Admin extends Project {

	@Override
	public void name() {
		
		System.out.println("Project name Over-ride from name method in Project class");
		
	}

	@Override
	public void type() {
		
		System.out.println("Project Type Over-ride from type method in Project class");
		
	}

	@Override
	public void purpose() {
		
		System.out.println("Project purpose Over-ride from purpose method method in Project class");
		
	}

}
