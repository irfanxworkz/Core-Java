package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class SambarPowder {

	public static void main(String[] args) {
		Collection<String> powder=new ArrayList<>();
		powder.add("Aashirvaad Sambar Masala");
		powder.add("sambhar podi or Sambar Masala");
		powder.add("Coriander Seeds");
		powder.add("Chillies");
		powder.add("Wheat & Sulphites");
		powder.add("Fenugreek");
		powder.add("Turmeric and Asafoetida");
		powder.add("Sesame Seeds");
		powder.add("Mustard");
		powder.add("Peanuts, Milk");
		powder.add(null);
		powder.add(null);
		powder.add(null);
		powder.remove("Mustard");
		
		int ref=powder.size();
		System.out.println("Total Elements are  :"+ref);
		
		System.out.println("for-each loop...");
		for(String loop:powder) {
			if(loop !=null) {
			System.out.println(loop.toUpperCase());
			}
		}
		
		System.out.println("Iterator...");
		
		Iterator<String> iterator=powder.iterator();
		while(iterator.hasNext()) {
			System.out.println("Elements present");
			String iterator1=iterator.next();
			if(Objects.isNull(iterator1)) {
				iterator.remove();
			}
				
			}
		System.out.println("Elements are: "+powder);
		System.out.println("Total Elements : "+powder.size());

	}

}
