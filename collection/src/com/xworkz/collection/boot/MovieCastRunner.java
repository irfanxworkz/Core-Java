package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class MovieCastRunner {

	public static void main(String[] args) {
		Collection<String> actor=new ArrayList<>();
		actor.add("SRK");
		actor.add("Ajay");
		actor.add("Allu");
		actor.add("Prabhash");
		actor.add("Salman");
		actor.add("Ram");
		actor.add("Sunny");
		actor.add("Aryan");
		actor.add("Rajkumar");
		actor.add("Rajnikanth");
		actor.add(null);
		actor.add(null);
		actor.add(null);
		actor.remove("Aryan");
		
		int ref=actor.size();
		System.out.println("Total Elements are  :"+ref);
		
		System.out.println("for-each loop...");
		for(String loop:actor) {
			if(loop !=null) {
			System.out.println(loop.toUpperCase());
			}
		}
		
		System.out.println("Iterator...");
		
		Iterator<String> iterator=actor.iterator();
		while(iterator.hasNext()) {
			System.out.println("Elements present");
			String iterator1=iterator.next();
			if(Objects.isNull(iterator1)) {
				iterator.remove();
			}
				
			}
		System.out.println("Elements are: "+actor);
		System.out.println("Total Elements : "+actor.size());

	}

}
