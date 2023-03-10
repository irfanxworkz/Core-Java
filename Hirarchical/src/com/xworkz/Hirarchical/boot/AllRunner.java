package com.xworkz.Hirarchical.boot;

import com.xworkz.Hirarchical.thing.Doctor;
import com.xworkz.Hirarchical.thing.Engineer;

public class AllRunner {

	public static void main(String[] args) {
		Engineer engineer=new Engineer(43,"irfan",25,"irfan@gmail.com");
		System.out.println(engineer.toString());
		System.out.println("-------------------------------");
		
		Engineer engineer1=new Engineer(43,"irfan",25,"irfan@gmail.com");
		System.out.println(engineer1);
		System.out.println("--------------------------------");
		
		Engineer engineer2=new Engineer(56,"maham",28,"irfan@gmail.com");
		System.out.println(engineer2);
		System.out.println("-----------");
		
		boolean equals = engineer.equals(engineer1);
		System.out.println(equals);
		System.out.println("-----------");
		
		boolean equals1 = engineer1.equals(engineer2);
		System.out.println(equals1);
		System.out.println("-----------");
		
		boolean equals2 = engineer.equals(engineer2);
		System.out.println(equals2);
		
		
		
		System.out.println("Hash code of engineer is: "+engineer.hashCode());
		System.out.println("Hash code of engineer1 is: "+engineer1.hashCode());
		System.out.println("Hash code of engineer2 is: "+engineer2.hashCode());
		System.out.println("-------------------------------------------------------------");
		engineer1=engineer2;
		System.out.println("Hash code of engineer is: "+engineer1.hashCode());
		System.out.println("Hash code of engineer1 is: "+engineer2.hashCode());
		System.out.println("--------------------------------------------");
		
		Doctor dr=new Doctor(22,"Ashok",45,"Manish");
		System.out.println(dr);
		System.out.println("----------------------------------------------");
		boolean equals3 = engineer.equals(dr);
		System.out.println(equals3);
		System.out.println("--------------------------------------------");
		dr.specialist("dentist");
		dr.hospitalName("Lotus");
		

	}

}
