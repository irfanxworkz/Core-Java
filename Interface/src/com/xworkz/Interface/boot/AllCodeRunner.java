package com.xworkz.Interface.boot;

import com.xworkz.Interface.implement.AllCodes;
import com.xworkz.Interface.things.CodingRule;
import com.xworkz.Interface.things.FamilyRule;
import com.xworkz.Interface.things.HospitalRule;
import com.xworkz.Interface.things.PubRule;
import com.xworkz.Interface.things.RailwayStation;

public class AllCodeRunner {

	public static void main(String[] args) {
		
		AllCodes all=new AllCodes();
		
	
		CodingRule coding=new AllCodes();
		
		FamilyRule family=new AllCodes();
		
		HospitalRule hospital=new AllCodes();
		
		PubRule pub=new AllCodes();
		pub.couplesOnly();
		pub.dance();
		pub.drinkName();
		pub.noOfPeople();
		pub.smokingArea();
		
		RailwayStation railway=new AllCodes();
	}

}
