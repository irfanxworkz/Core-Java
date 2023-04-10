package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class ExamScheduleRunner {

	public static void main(String[] args) {
		Collection<Double> marks=new ArrayList<>();
		marks.add(75.6);
		marks.add(55.5);
		marks.add(45.7);
		marks.add(56.5);
		marks.add(62.5);
		marks.add(85.5);
		marks.add(75.9);
		marks.add(65.2);
		marks.add(69.5);
		marks.add(86.5);
		marks.add(null);
		marks.add(null);
		marks.add(null);
		marks.remove(65.2);
		
		int ref=marks.size();
		System.out.println("Total Elements are  :"+ref);
		
		System.out.println("for-each loop...");
		for(Double loop:marks) {
			if(loop !=null) {
			System.out.println(loop);
			}
		}
		
		System.out.println("Iterator...");
		
		Iterator<Double> iterator=marks.iterator();
		while(iterator.hasNext()) {
			System.out.println("Elements present");
			Double iterator1=iterator.next();
			if(Objects.isNull(iterator1)) {
				iterator.remove();
			}
				
			}
		System.out.println("Elements are: "+marks);
		System.out.println("Total Elements : "+marks.size());

	}

}
