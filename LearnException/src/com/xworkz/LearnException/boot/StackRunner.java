package com.xworkz.LearnException.boot;

import com.xworkz.LearnException.thing.StackCreater;

public class StackRunner {

	public static void main(String[] args) {

		StackCreater creater = new StackCreater();
		System.out.println("before try block");
		
		try {
			System.out.println("before exceptional events...");
			creater.stack1();
			System.out.println("After exceptional events...");
		}

		catch (Exception e) {
			System.err.println("Gnerating Exception catch block");
		}

		System.out.println("After catch block");
	}

}
