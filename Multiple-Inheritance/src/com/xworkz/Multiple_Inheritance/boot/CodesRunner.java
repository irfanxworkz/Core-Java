package com.xworkz.Multiple_Inheritance.boot;

import com.xworkz.Multiple_Inheritance.implement.Codes;
import com.xworkz.Multiple_Inheritance.things.AbstractInfo;
import com.xworkz.Multiple_Inheritance.things.Developer;
import com.xworkz.Multiple_Inheritance.things.DubaiVisaRule;
import com.xworkz.Multiple_Inheritance.things.PassportRule;

public class CodesRunner {

	public static void main(String[] args) {
		
		Codes code=new Codes();
		
		code.setCreatedBy("Irfan");
		
		code.setUpdatedBy("Rahul");
		
		String str1=code.getCreatedBy();
		System.out.println(str1);
		
		String str2=code.getUpdatedBy();
		System.out.println(str2);
		
		String str=code.citizen();
		System.out.println("Citizen :"+str);
		
		boolean b1=code.criminalRecord();
		System.out.println("Crimimnal Record is :"+b1);
		
		boolean b2=code.followStanards();
		System.out.println("FollowStandard :"+b2);
		
		boolean b3=code.jail();
		System.out.println("Jail: "+b3);
		
		double d=code.maxGoldLimit();
		System.out.println("Gold Limit IS: "+d+" gram");
		
		double d1=code.minAmount();
		System.out.println("Minimum Amount is :"+d1);
		
		boolean b4=code.stayingHotel();
		System.out.println("Staying Hotel :"+b4);
		
		boolean b5=code.underStandingConcepts();
		System.out.println("UnderStanding Code: "+b5);
		System.out.println("--------------------------------------------");
		
		DubaiVisaRule visa=new Codes();
		
		double d2=visa.minAmount();
		System.out.println("Minimun Amount is:"+d2);
		
		double d3=visa.maxGoldLimit();
		System.out.println("Maximum Gold limit is:"+d3+" gram");
		
		boolean b6=visa.stayingHotel();
		System.out.println("Staying in hotel:"+b6);
		System.out.println("----------------------------------------------");
	
		PassportRule pass=new Codes();
		
		String str3=pass.citizen();
		System.out.println("Citizen Is :"+str3);
		
		boolean b7=pass.criminalRecord();
		System.out.println("Criminal Record Is: "+b7);
		
		boolean b8=pass.jail();
		System.out.println("Jail: "+b8);
		System.out.println("--------------------------------------------------");
		
		Developer deve=new Codes();
		
		boolean b9=deve.followStanards();
		System.out.println("Follow standard: "+b9);
		
		boolean b10=deve.underStandingConcepts();
		System.out.println("UnderStanding Concept :"+b10);
		
		deve.setCreatedBy("Karan");
		
		deve.setUpdatedBy("Kartik");
		
		String str4=deve.getCreatedBy();
		System.out.println(str4);
		
		String str5=deve.getUpdatedBy();
		System.out.println(str5);
		System.out.println("------------------------------------------------------");
		
		AbstractInfo info=new Codes();
		
		info.setCreatedBy("Nadeem");
		
		info.setUpdatedBy("Sami");
		
		String str6=info.getCreatedBy();
		System.out.println(str6);
		
		String str7=info.getUpdatedBy();
		System.out.println(str7);
		System.out.println("----------------------------------------------------------");

	}

}
