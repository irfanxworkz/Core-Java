package com.xworkz.assosiation.boot;
import com.xworkz.assosiation.things.Isro;
import com.xworkz.assosiation.things.Scientest;
public class IsroRunner {

	public static void main(String[] args) {
		Isro isro=new Isro();
		String[] loc= {"jaipur","delhi","bengaluru"};
		isro.setlocation(loc); 
		int[] sat= {12,14,18};
		isro.setsetelliteNos(sat);
		
		Scientest scientest1=new Scientest();
		Scientest scientest2=new Scientest();
		
		scientest1.setname("Abdul kalam");
		scientest1.setdesignation("director");
		
		scientest2.setname("Nambi narayan");
		scientest2.setdesignation("cheif of rocket");
		
		Scientest[] scientest= {scientest1,scientest2};
		isro.setscientest(scientest);
		isro.display();
	}

}
