package com.xworkz.AbstractionWithInterface.Implement;

import com.xworkz.AbstractionWithInterface.things.ExamRule;

public class ExamBoard implements ExamRule{

	@Override
	public double minPassingMark() {
		double d1=40;
		System.out.println("Min Passing Marks Is: "+d1);
		return d1;
	}

	@Override
	public double examTiming() {
		double d1=3;
		System.out.println("Exam Time Is: "+d1);
		return d1;
	}

}
