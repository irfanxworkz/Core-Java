package com.xworkz.AbstractionWithInterface.boot;

import com.xworkz.AbstractionWithInterface.Association.Student;
import com.xworkz.AbstractionWithInterface.Implement.ExamBoard;
import com.xworkz.AbstractionWithInterface.things.ExamRule;

public class ExamRunner {

	public static void main(String[] args) {
		
		ExamRule exam=new ExamBoard();//Is-A relation

		System.out.println("-----------------------------------");
		Student student=new Student(exam);//Has-A relation
		student.display();
	}

}
