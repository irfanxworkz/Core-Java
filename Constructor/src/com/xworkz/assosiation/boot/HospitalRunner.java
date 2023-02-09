package com.xworkz.assosiation.boot;
import com.xworkz.assosiation.things.Hospital;
import com.xworkz.assosiation.things.Doctor;
public class HospitalRunner {

	public static void main(String[] args) 
	{
		Hospital hsptl=new Hospital();
		hsptl.setName("Lotus Hospital");
		
		Doctor dr1=new Doctor();
		Doctor dr2=new Doctor();
		
		dr1.setName("Rahul Gupta");
		String[] spec= {"allergist","dermatologist","cardiologist","dentist","gynecologist"};
		dr1.setSpecilization(spec);
		dr1.setExperience(14.3);
		
		dr2.setName("Sunil Sharma");
		String[] specl= {"anesthesiology","ophthalmology","Pediatrics","Psychiatry","Clinical Pathology"};
		dr2.setSpecilization(specl);
		dr2.setExperience(8.6);
		
		Doctor[] doctors= {dr1,dr2};
		hsptl.setDoctor(doctors);
		hsptl.display();
				
	}

}
