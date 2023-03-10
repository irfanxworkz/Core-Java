package com.xworkz.Hirarchical.thing;

public class Engineer extends Person {

	public Engineer(int id, String name, int age, String email) {
		super(id, name, age, email);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in Engineer : " + obj);
		if (obj != null) {
			System.out.println("obj is not null...");
			if (obj instanceof Engineer) {
				System.out.println("obj is Engineer type comapre it");

				Engineer cast = (Engineer) obj;
				Engineer engineer = this;
				Engineer engineer1 = cast;

				if (engineer.id == engineer1.id && engineer.name.equals(engineer1.name) && engineer.age == engineer1.age
						&& engineer.email.equals(engineer1.email)) {
					System.out.println("both are same");
					return true;
				} else {
					System.out.println("Both are not same");
				}
			} else {
				System.out.println("obj is not Engineer type not compared it");
			}
		} else {
			System.out.println("obj is null...");
		}

		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Running string from Engineer :");
		return "[ id is: " + id + "] [name is: " + name + "] [ age is: " + age + "] [ email is: " + email + "]";
	}

}
