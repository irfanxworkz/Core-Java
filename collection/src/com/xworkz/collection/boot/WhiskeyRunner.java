package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class WhiskeyRunner {

	public static void main(String[] args) {
		
		Collection<String> whiskey=new ArrayList<>();
		whiskey.add("IB");
		whiskey.add("Sprite");
		whiskey.add("White & Blue");
		whiskey.add("Black Creek");
		whiskey.add("Evan Williams");
		whiskey.add("Jack Danniel");
		whiskey.add("White & black");
		whiskey.add("Red & white");
		whiskey.add("Black Velvet");
		whiskey.add("Knob Creek");
		whiskey.add(null);
		whiskey.add(null);
		whiskey.add(null);
		whiskey.remove("Red & white");
		
		int ref=whiskey.size();
		System.out.println("Total Elements are  :"+ref);
		
		System.out.println("for-each loop...");
		for(String loop:whiskey) {
			if(loop !=null) {
			System.out.println(loop.toUpperCase());
			}
		}
		
		System.out.println("Iterator...");
		
		Iterator<String> iterator=whiskey.iterator();
		while(iterator.hasNext()) {
			System.out.println("Elements present");
			String iterator1=iterator.next();
			if(Objects.isNull(iterator1)) {
				iterator.remove();
			}
				
			}
		System.out.println("Elements are: "+whiskey);
		System.out.println("Total Elements : "+whiskey.size());
		}

	}
