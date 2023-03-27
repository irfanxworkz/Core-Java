package com.xworkz.weapon.boot;

import java.time.LocalDate;

import com.xworkz.weapon.constant.Type;
import com.xworkz.weapon.dto.WeaponDTO;
import com.xworkz.weapon.repository.WeaponRepository;
import com.xworkz.weapon.repository.WeaponRepositoryImpl;
import com.xworkz.weapon.services.WeaponServices;
import com.xworkz.weapon.services.WeaponServicesImpl;

public class WeaponRunner {

	public static void main(String[] args) {
		
		WeaponDTO weaponDto = new WeaponDTO("Avntomat Kakashnikov 1947", "Steel Billet and Hard Chromed", "Mikhail Timofeyevich kalashnikov", "Russia", "ARMY", "Battlefield", 578652, 3.47, 47, Type.GUN, LocalDate.ofYearDay(1949, 16));
		System.out.println(weaponDto);
		
		System.out.println("-----------------------------------------");
		
		WeaponRepository weaponRepository=new WeaponRepositoryImpl();
		
		WeaponServices weaponServices=new WeaponServicesImpl(weaponRepository);
		boolean validate=weaponServices.validateAndThenSave(weaponDto);
		System.out.println("Validate: "+validate);
		
		System.out.println("------------------------------------------");
		
		WeaponDTO weaponDto1 = new WeaponDTO("Pistol", "Steel Billet", "Mikhail Timofeyevich", "India", "Indian-Army", "Battlefield", 578625568, 34.475, 478, Type.GUN, LocalDate.ofYearDay(2013, 16));
		WeaponServices weaponServices1=new WeaponServicesImpl(weaponRepository);
		boolean validate1=weaponServices1.validateAndThenSave(weaponDto1);
		System.out.println("Validate: "+validate1);
	}

}
