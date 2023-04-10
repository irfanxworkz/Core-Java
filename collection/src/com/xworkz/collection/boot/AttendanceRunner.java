package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class AttendanceRunner {

	public static void main(String[] args) {
		Collection<String> attendance=new ArrayList<>();
		attendance.add("Irfan");
		attendance.add("Khan");
		attendance.add("Rahul");
		attendance.add("Karan");
		attendance.add("Kartik");
		attendance.add("Sami");
		attendance.add("Jasleen");
		attendance.add("Dipu");
		attendance.add("Payal");
		attendance.add("Kanchan");
		attendance.add(null);
		attendance.add(null);
		attendance.add(null);
		attendance.remove("Khan");
		
		int ref=attendance.size();
		System.out.println("Total Elements are  :"+ref);
		
		System.out.println("for-each loop...");
		for(String loop:attendance) {
			if(loop !=null) {
			System.out.println(loop.toUpperCase());
			}
		}
		
		System.out.println("Iterator...");
		
		Iterator<String> iterator=attendance.iterator();
		while(iterator.hasNext()) {
			System.out.println("Elements present");
			String iterator1=iterator.next();
			if(Objects.isNull(iterator1)) {
				iterator.remove();
			}
				
			}
		System.out.println("Elements are: "+attendance);
		System.out.println("Total Elements : "+attendance.size());
		}

	}

