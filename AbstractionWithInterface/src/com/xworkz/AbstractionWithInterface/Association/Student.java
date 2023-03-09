package com.xworkz.AbstractionWithInterface.Association;

import com.xworkz.AbstractionWithInterface.things.ExamRule;

public class Student {
	
	public ExamRule examrule;
	
	public Student(ExamRule examrule)
	{
		this.examrule=examrule;
		
	}
	
	public void display()
	{
		double d1=examrule.minPassingMark();
		System.out.println("Minimum Passing marks is :"+d1);
		double d2=examrule.examTiming();
		System.out.println(d2+" Hours exam Time");
	}
}
