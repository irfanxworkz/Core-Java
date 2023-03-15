package com.xworkz.weapon.services;

import com.xworkz.weapon.dto.WeaponDTO;

public interface WeaponServices {
	
	boolean validateAndThenSave(WeaponDTO dto);

}
