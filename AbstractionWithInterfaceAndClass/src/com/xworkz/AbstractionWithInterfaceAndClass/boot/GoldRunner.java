package com.xworkz.AbstractionWithInterfaceAndClass.boot;

import com.xworkz.AbstractionWithInterfaceAndClass.Association.Anitha;
import com.xworkz.AbstractionWithInterfaceAndClass.Association.Bhairavi;
import com.xworkz.AbstractionWithInterfaceAndClass.Association.Priyanka;
import com.xworkz.AbstractionWithInterfaceAndClass.Association.Shruti;
import com.xworkz.AbstractionWithInterfaceAndClass.Implement.Abharan;
import com.xworkz.AbstractionWithInterfaceAndClass.Implement.DevendraSetu;
import com.xworkz.AbstractionWithInterfaceAndClass.Implement.MahaLakshmi;
import com.xworkz.AbstractionWithInterfaceAndClass.Implement.Malabar;
import com.xworkz.AbstractionWithInterfaceAndClass.things.GoldSeller;

public class GoldRunner {

	public static void main(String[] args) {
		
		GoldSeller seller1=new Malabar();
		GoldSeller seller2=new DevendraSetu();
		GoldSeller seller3=new Abharan();
		GoldSeller seller4=new MahaLakshmi();
		
		Anitha anitha=new Anitha(seller1);
		anitha.buyGold();
		System.out.println("--------------------");
		Shruti shruti= new Shruti(seller2);
		shruti.tinnaTago();
		System.out.println("------------------------");
		Bhairavi bhairavi=new Bhairavi(seller3);
		bhairavi.bangaraKaridi();
		System.out.println("------------------------");
		Priyanka priyanka=new Priyanka(seller4);
		priyanka.purchaseGold();
		System.out.println("--------------------------");

	}

}
