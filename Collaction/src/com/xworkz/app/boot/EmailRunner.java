package com.xworkz.app.boot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class EmailRunner {

	public static void main(String[] args) {

		Collection<String> email=new ArrayList<String>();
		
		email.add("Irfan@gmail.com");
		email.add("Karan@gmail.com");
		email.add("Rahul@gmail.com");
		email.add("Kartik@gmail.com");
		email.add("Nadeem@gmail.com");
		
		email.add("Irfan@outlook.com");
		email.add("Karan@outlook.com");
		email.add("Rahul@outlook.com");
		email.add("Kartik@outlook.com");
		email.add("Nadeem@outlook.com");
		
		email.add("Irfan@yahoo.com");
		email.add("Karan@yahoo.com");
		email.add("Rahul@yahoo.com");
		email.add("Kartik@yahoo.com");
		email.add("Nadeem@yahoo.com");
		
		email.add("Irfan@xworkz.com");
		email.add("Karan@xworkz.com");
		email.add("Rahul@xworkz.com");
		email.add("Kartik@xworkz.com");
		email.add("Nadeem@xworkz.com");
		email.add("Jay@xworkz.com");
		email.add("Sami@xworkz.com");
		email.add("Jasleen@xworkz.com");
		email.add("Shivani@xworkz.com");
		email.add("Wajib@xworkz.com");
		
		System.out.println("totall Elements is: "+email.size());
		System.out.println("All Original Email...");
		for(String ref:email) {
			System.out.println(ref);
		}
		
		System.out.println();
		System.out.println("All Email UpperCaseLetter...");
		for(String ref:email) {
			System.out.println(ref.toUpperCase());
		}
		
		System.out.println();
		System.out.println("print unique domain");
		email.stream().map(e->e.split("@")[1]).collect(Collectors.toSet()).forEach(e->System.out.println(e));
		
		System.out.println();
		System.out.println("print email without domain");
		email.stream().map(e->e.split("@")[0]).collect(Collectors.toSet()).forEach(e->System.out.println(e));
		
		System.out.println();
		System.out.println("Print gmail domain-----");
		email.stream()
		.filter(ref -> ref.endsWith("@gmail.com"))
		.forEach(ref->System.out.println(ref));
		
		System.out.println();
		System.out.println("Print xworkz domain-----");
		email.stream()
		.filter(ref -> ref.endsWith("@xworkz.com"))
		.forEach(ref->System.out.println(ref));
		
		System.out.println();
		System.out.println("Print All domain not gmail and xworkz");
		email.stream()
		.filter(ref -> !ref.endsWith("@gmail.com") && !ref.endsWith("@xworkz.com"))
		.forEach(ref->System.out.println(ref));

	}

}
