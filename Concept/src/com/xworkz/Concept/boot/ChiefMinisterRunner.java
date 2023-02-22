package com.xworkz.Concept.boot;

import com.xworkz.Concept.thing.ChiefMinister;

public class ChiefMinisterRunner {

	public static void main(String[] args) {
		
		ChiefMinister chief1=new ChiefMinister("Ashok Gahlot","Rajasthan","CONG","Jodhpur","SPG-Commando",60,5,204,3,2023,10000,true,true);
		System.out.println(chief1);
		System.out.println("--------------------------------------------------------------------");
		
		ChiefMinister chief2=new ChiefMinister("Ashok Gahlot","Rajasthan","CONG","Jodhpur","SPG-Commando",60,5,204,3,2023,10000,true,true);
		System.out.println(chief2);
		System.out.println("--------------------------------------------------------------------");
		
		ChiefMinister chief3=new ChiefMinister("Yogi Adityanath","UP","bjp","Gorkhpur","Z+ Security",52,10,312,0,2023,100000,false,true);
		System.out.println(chief3);
		System.out.println("--------------------------------------------------------------------");
		
		boolean equals=chief1.equals(chief2);
		System.out.println("both are same :"+equals);
		System.out.println("-----------");
		
		boolean equals1=chief1.equals(chief3);
		System.out.println("both are Same :"+equals1);
		System.out.println("-----------");

	}

}
