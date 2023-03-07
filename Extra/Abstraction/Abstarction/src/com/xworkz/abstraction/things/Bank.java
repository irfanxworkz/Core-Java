package com.xworkz.abstraction.things;

public class Bank extends ATM{

	@Override
	public void deposit(int amount) {
		
		this.amount=amount;
		System.out.println("Deposit Amount :"+amount);
		
	}

	@Override
	public void withdrawals(int withdraw) {
		this.withdraw=withdraw;
		System.out.println("Withdrawals Amount :"+withdraw);
		
	}

	@Override
	public void transfer_Fund(double fund) {
	
		System.out.println("Transfer Fund :"+fund);
		
	}

	@Override
	public void atm_Pin(int digit) {
		System.out.println("ATM pin is: "+digit);
		
	}

	@Override
	public void acc_Number(long number) {
		System.out.println("Account Number is :"+number);
		
	}

	@Override
	public void linked_Aadhar(long aadhar) {
		System.out.println("Linked With Aadhar: "+aadhar);
		
	}	
		
	@Override
	public void acc_Type(String type) {
		System.out.println("Account Type Is :"+type);
		
	}

	@Override
	public void cust_Name(String name) {
		System.out.println("Customer Name is: "+name);
		
	}

	@Override
	public void cust_Cont_Number(long mobNumber) {
		System.out.println("Customer Contact Number Is: "+mobNumber);
		
	}
	
	@Override
	public double acc_Balance() {
		remaining=amount-withdraw;
		System.out.println("Account Balance is :"+remaining);
		return remaining;
	}


}
