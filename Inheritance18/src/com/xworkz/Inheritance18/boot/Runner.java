package com.xworkz.Inheritance18.boot;
import com.xworkz.Inheritance18.thing.Sport;
import com.xworkz.Inheritance18.thing.T20Cricket;
import com.xworkz.Inheritance18.thing.Cricket;
import com.xworkz.Inheritance18.thing.TestCricket;
import com.xworkz.Inheritance18.thing.ODICricket;

public class Runner 
{
	public void display(Sport sport,Cricket cricket,TestCricket testcricket,ODICricket odicricket,T20Cricket t20cricket)
	{
		this.display(sport, cricket, testcricket, odicricket, t20cricket);
	}
	

	public static void main(String[] args)
	{
		Sport sport=new Sport();
		sport.getTotal(3);
		
		System.out.println("---------------------------------------------");
		
		Sport sport1=new Cricket();
		sport1.getTotal(1);
		
		Cricket cricket=(Cricket) sport1;
		cricket.getCountry("IND");
		cricket.getCoachName("KL");
		
		System.out.println("---------------------------------------------");
		
		Sport sport11=new TestCricket();
		TestCricket testcricket=(TestCricket) sport11;
		testcricket.getTotal(2);
		testcricket.getCountry("SRI");
		testcricket.getCoachName("SGI");
		testcricket.getCaptainName("BRT");
		
		System.out.println("---------------------------------------------");
		
		Sport sport111=new ODICricket();
		ODICricket odi=(ODICricket) sport111;
		odi.getTotal(3);
		odi.getCountry("ENG");
		odi.getCoachName("BTR");
		odi.getGroundName("HNDN");
		
		System.out.println("---------------------------------------------");
		
		Sport sport1111=new T20Cricket();
		T20Cricket t20=(T20Cricket) sport1111;
		t20.getTotal(7);
		t20.getCountry("PAK");
		t20.getCoachName("ABD");
		t20.getGroundName("JKD");
		t20.getSponsorName("VIVO");
		
		System.out.println("---------------------------------------------");
		
		Runner runner=new Runner();
		runner.display(sport, cricket, testcricket, odi, t20);
	}

}
