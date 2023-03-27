package com.xworkz.headphone.repository;

import com.xworkz.headphone.dto.HeadphoneDTO;

public class HeadphoneRepositoryImpl implements HeadphoneRepository {
	
	private HeadphoneDTO[] headphoneDTO=new HeadphoneDTO[5];
	private int headphoneIndex = 0;

	@Override
	public boolean save(HeadphoneDTO dto) {
			
		if(this.headphoneIndex < this.headphoneDTO.length) {
			this.headphoneDTO[headphoneIndex] = dto;
			headphoneIndex++;
			return true;
		}
		else {
			System.err.println("Memory is full , cannot add more files, max allowed is 5");
			
		}
		return false;
	}

}
