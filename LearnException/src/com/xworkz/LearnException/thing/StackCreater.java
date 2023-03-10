package com.xworkz.LearnException.thing;

public class StackCreater {
	
	public void stack1()
	{
		System.out.println("running the methos of stack1 ");
			this.stack2();
	}
	
	public void stack2()
	{
		System.out.println("running the methos of stack2 ");
		this.stack3();
	}
	
	public void stack3()
	{
		System.out.println("running the methos of stack3 ");
		this.stack4();
	}
	
	public void stack4()
	{
		System.out.println("running the methos of stack4 ");
		this.stack5();
	}
	
	public void stack5() 
	{
		System.out.println("running the methos of stack5 ");
		Error error=new Error(); 
		throw error;
		//RuntimeException run=new RuntimeException(); //Un-Chacked exception (Error and Runtime)
		//throw run;
		
		//Exception exception=new Exception();
		//throw exception;
		//Throwable throwable=new Throwable(); //Chacked exception
		//throw throwable;
		
	}

	

}
