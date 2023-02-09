package com.xworkz.assosiation.boot;
import com.xworkz.assosiation.things.Engineer;
import com.xworkz.assosiation.things.Degree;

public class EngineerRunner 
{
	public static void main(String args[])
	{
	Engineer er=new Engineer();
	er.setName("Irfan");
	er.setSalary(45000);
	String[] skls= {"c","c++","core java","sql","javascript"};
	er.setSkills(skls);
	
	Degree deg1=new Degree();
	Degree deg2=new Degree();
	deg1.setName("Btech");
	deg1.setDuration(4);
	deg1.setPursuing(true);
	deg1.setPercentage(65.89);
	deg1.setBranch("(Computer Science)");
	
	deg2.setName("Mtech");
	deg2.setDuration(2);
	deg2.setPursuing(false);
	deg2.setPercentage(72.39);
	deg2.setBranch("(Computer Science Engineering)");
	
	Degree[] degree= {deg1,deg2};
	
	er.setDegree(degree);
	er.display();
	}
	
}
