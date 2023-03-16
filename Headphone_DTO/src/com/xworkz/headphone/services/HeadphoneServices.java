package com.xworkz.headphone.services;

import com.xworkz.headphone.dto.HeadphoneDTO;

public interface HeadphoneServices {
	
	boolean validateAndThenSave(HeadphoneDTO dto);

}
