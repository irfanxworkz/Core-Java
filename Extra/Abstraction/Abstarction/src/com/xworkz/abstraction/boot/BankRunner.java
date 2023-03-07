package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.things.ATM;
import com.xworkz.abstraction.things.Bank;

public class BankRunner {

	public static void main(String[] args) {
		
		ATM atm=new Bank();
		
		atm.deposit(25000);
		atm.withdrawals(12000);
		atm.acc_Balance();
		atm.acc_Number(264564566);
		atm.acc_Type("Saving");
		atm.atm_Pin(4556);
		atm.cust_Cont_Number(977568965);
		atm.cust_Name("Irfan Khan");
		atm.linked_Aadhar(822654562);
		atm.transfer_Fund(5000);

	}

}
