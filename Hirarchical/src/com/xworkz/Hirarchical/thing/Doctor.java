package com.xworkz.Hirarchical.thing;

public class Doctor extends Person {

	public Doctor(int id, String name, int age, String email) {
		super(id, name, age, email);
	}

	@Override
	public String toString() {
		System.out.println("Running toString in Doctor");
		return "[ id is: " + id + "] [ Name is :" + name + "] [Age is :" + age + "] [email is: " + email + "]";
	}

	public void specialist(String specialist) {
		System.out.println("Specialist is: " + specialist);
	}

	public void hospitalName(String name) {
		System.out.println("Hospital name is: " + name);
	}

}
