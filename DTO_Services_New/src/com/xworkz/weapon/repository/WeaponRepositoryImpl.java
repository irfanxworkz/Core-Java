package com.xworkz.weapon.repository;

import com.xworkz.weapon.dto.WeaponDTO;

public class WeaponRepositoryImpl implements WeaponRepository {
	
	private WeaponDTO[] weaponDTO=new WeaponDTO[5];
	private int weaponIndex = 0;

	@Override
	public boolean save(WeaponDTO dto) {
		
		if(this.weaponIndex < this.weaponDTO.length) {
			this.weaponDTO[weaponIndex] = dto;
			weaponIndex++;
			return true;
		}
		else {
			System.err.println("Memory is full , cannot add more files, max allowed is 5");
			
		}
		return false;
	}

}
