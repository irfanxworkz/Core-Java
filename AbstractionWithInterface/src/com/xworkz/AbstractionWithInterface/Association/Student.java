package com.xworkz.AbstractionWithInterface.Association;

import com.xworkz.AbstractionWithInterface.things.ExamRule;

public class Student {

	public ExamRule examrule;

	public Student(ExamRule examrule) {
		this.examrule = examrule;

	}

	public void display() {
		examrule.minPassingMark();

		examrule.examTiming();

	}
}
