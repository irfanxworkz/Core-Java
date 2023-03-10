package com.xworkz.Hirarchical.thing;

public class Person {

	int id;
	String name;
	int age;
	String email;

	public Person(int id) {
		this.id = id;
		System.out.println("1 arg constructor calling from person id is : " + id);
	}

	public Person(int id, String name) {
		this(id);
		this.name = name;
		System.out.println("2 arg constructor calling from person id is : " + id + " name is : " + name);
	}

	public Person(int id, String name, int age) {
		this(id, name);
		this.age = age;
		System.out.println("3 arg consructor calling from person id is : " + id + " name is : " + name + " age is : " + age);
	}

	public Person(int id, String name, int age, String email) {
		this(id, name, age);
		this.email = email;
		System.out.println("4 arg constructor calling from person id is : " + id + " name is :" + name + " age is: " + age + " email is : " + email);
	}

	
}
