package com.xworkz.app.boot;

import java.util.ArrayList;
import java.util.Collection;

public class FruitsRunner {

	public static void main(String[] args) {
		
		Collection<String> fruits=new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Apricot");
		fruits.add("Avocados");
		fruits.add("Banana");
		fruits.add("Blueberry");
		fruits.add("Custard apple");
		fruits.add("Currant");
		fruits.add("Coconut");
		fruits.add("Cashew fruit");
		fruits.add("Cherry");
		fruits.add("Cranberry");
		fruits.add("Durian");
		fruits.add("Date fruit");
		fruits.add("Dragon fruit");
		fruits.add("Elderberry");
		fruits.add("Fig");
		fruits.add("Guava");
		fruits.add("Grapes");
		fruits.add("Gooseberry");
		fruits.add("Hackberry");
		fruits.add("Jackfruit");
		fruits.add("Jambool");
		fruits.add("Jujube");
		fruits.add("Kiwi");
		fruits.add("Bell Fruit");
		
		System.out.println("Total elements is: "+fruits.size());
		
		System.out.println("Print All "+fruits.size()+" elements In UpperCase letter");
		
		for(String ref:fruits) {
			System.out.println(ref.toUpperCase());
		}
		System.out.println("--------------------------------------------------");
		Collection<String> newFruits=new ArrayList<String>();
		
		boolean changeFruits=newFruits.addAll(fruits);
		System.out.println(changeFruits);
		
		newFruits.forEach(ref->{
			System.out.println(newFruits+" "+ref.toUpperCase());
		});
		
		System.out.println();
		System.out.println("---------- if length is less than and equals to 5");
		newFruits.forEach(ref->{
			if(ref.length()<=5) {
				System.out.println(newFruits+" "+ref);
			}	
		});
		
		System.out.println();
		System.out.println("---------- if length is greater than 5");
		newFruits.forEach(ref->{
			if(ref.length()>5) {
				System.out.println(newFruits+" "+ref);
			}	
		});
		
		System.out.println();
		System.out.println("---------- if length is greater than 10 and less than 15");
		newFruits.forEach(ref->{
			if(ref.length()>10 && ref.length()<15) {
				System.out.println(newFruits+" "+ref);
			}	
		});
	}

}
