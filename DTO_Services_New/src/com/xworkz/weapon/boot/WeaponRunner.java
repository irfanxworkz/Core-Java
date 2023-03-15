package com.xworkz.weapon.boot;

import java.time.LocalDate;

import com.xworkz.weapon.constant.Type;
import com.xworkz.weapon.dto.WeaponDTO;
import com.xworkz.weapon.services.WeaponServices;
import com.xworkz.weapon.services.WeaponServicesImpl;

public class WeaponRunner {

	public static void main(String[] args) {
		
		WeaponDTO weaponDto = new WeaponDTO("Avntomat Kakashnikov 1947", "Steel Billet and Hard Chromed", "Mikhail Timofeyevich kalashnikov", "Russia", "ARMY", "Battlefield", 578652, 3.47, 47, Type.GUN, LocalDate.ofYearDay(1949, 16));
		System.out.println(weaponDto);
		
		System.out.println("-----------------------------------------");
		
		WeaponServices weaponServices=new WeaponServicesImpl();
		boolean validate=weaponServices.validateAndThenSave(weaponDto);
		System.out.println("Validate: "+validate);

	}

}
