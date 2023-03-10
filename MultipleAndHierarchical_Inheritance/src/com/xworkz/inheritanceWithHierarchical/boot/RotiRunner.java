package com.xworkz.inheritanceWithHierarchical.boot;
import com.xworkz.inheritanceWithHierarchical.thing.RagiRoti;
import com.xworkz.inheritanceWithHierarchical.thing.Roti;
import com.xworkz.inheritanceWithHierarchical.thing.OnionRagiRoti;
import com.xworkz.inheritanceWithHierarchical.thing.OnionMasalaRagiRoti;
import com.xworkz.inheritanceWithHierarchical.thing.ButterRoti;
import com.xworkz.inheritanceWithHierarchical.thing.JowerRoti;
import com.xworkz.inheritanceWithHierarchical.thing.Naan;
import com.xworkz.inheritanceWithHierarchical.thing.Kulcha;


public class RotiRunner {

	public static void main(String[] args) 
	{
		
		Roti roti=new Roti();
		String shape=roti.getShape();
		System.out.println("Roti Shape is: "+shape);
		
		System.out.println("----------------------------------------------");
		
		RagiRoti ragi=new RagiRoti();
		ragi.getCalories();
		
		Roti roti1=new RagiRoti();
		String shape1=roti1.getShape();
		System.out.println("Roti shape is: "+shape1);
		
		if(roti1 instanceof RagiRoti)
		{
			RagiRoti ragiroti=(RagiRoti) roti1;
			int calories=ragiroti.getCalories();
			System.out.println(calories);
		}
		else
		{
			System.out.println("roti1 is not ref to RagiRoti class...");
		}
		
		
		System.out.println("----------------------------------------------");
		
		OnionRagiRoti onion=new OnionRagiRoti();
		onion.getWeight();
		
		RagiRoti ragi2=new OnionRagiRoti();
		ragi2.getCalories();
		if(ragi2 instanceof OnionRagiRoti)
		{
			OnionRagiRoti onionragiroti=(OnionRagiRoti) ragi2;
			onionragiroti.getWeight();
		}
		else
		{
			System.out.println("ragi2 is not ref to OnionRagiRoti class...");
		}
		
		Roti roti2=new OnionRagiRoti();
		String shape2=roti2.getShape();
		System.out.println("Roti shape is: "+shape2);
		
		System.out.println("----------------------------------------------");
		
		Roti roti3=new OnionMasalaRagiRoti();
		String shape3=roti3.getShape();
		System.out.println("roti shape is: "+shape3);
		
		RagiRoti ragi3=new OnionMasalaRagiRoti();
		ragi3.getCalories();
		
		OnionRagiRoti onion1=new OnionMasalaRagiRoti();
		onion1.getWeight();
		
		OnionMasalaRagiRoti onionmasala=new OnionMasalaRagiRoti();
		double weight=onionmasala.getThickNess();
		System.out.println("OnionMasalaRagiRoti ThickNess is: "+weight);
		
		System.out.println("-----------------------------------------------");
		
		Roti roti4=new ButterRoti();
		String shape4=roti4.getShape();
		System.out.println("Roti shape is: "+shape4);
		//roti4.getShape();
		
		ButterRoti butter=new ButterRoti();
		double length=butter.getLength();
		System.out.println("ButterRoti length is: "+length);
		
		System.out.println("------------------------------------------------");
		
		Roti roti5=new JowerRoti();
		String shape5=roti5.getShape();
		System.out.println("Roti shape is: "+shape5);
		
		ButterRoti butter1=new JowerRoti();
		double length1=butter1.getLength();
		System.out.println("ButterRoti length is: "+length1);
		
		JowerRoti jower=new JowerRoti();
		double price=jower.getPrice();
		System.out.println("JowerRoti price is: "+price);
		
		System.out.println("-----------------------------------------------");
		
		Roti roti6=new Naan();
		String shape6=roti6.getShape();
		System.out.println("Roti shape is: "+shape6);
		
		ButterRoti butter2=new Naan();
		double length2=butter2.getLength();
		System.out.println("ButterRoti length is: "+length2);
		
		Naan naan=new Naan();
		String type=naan.getType();
		System.out.println("Naan Type is :"+type);
		
		System.out.println("-------------------------------------------------");
		
		Roti roti7=new Kulcha();
		String shape7=roti7.getShape();
		System.out.println("Roti shape is: "+shape7);
		
		ButterRoti butter3=new Kulcha();
		double length3=butter3.getLength();
		System.out.println("ButterRoti length is: "+length3);
		
		Naan naan1=new Kulcha();
		String type1=naan1.getType();
		System.out.println("Naan Type is :"+type1);
		
		Kulcha kulcha=new Kulcha();
		double size=kulcha.getSize();
		System.out.println("Kulcha size is: "+size);
		
		
		
		System.out.println("___________________________________________________________________");
		
		
	}

}
