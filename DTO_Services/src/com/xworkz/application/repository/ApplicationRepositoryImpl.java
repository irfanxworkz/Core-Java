package com.xworkz.application.repository;

import com.xworkz.application.dto.ApplicationDTO;

public class ApplicationRepositoryImpl implements ApplicationRepository {
	
	private ApplicationDTO[] applicationDTO =new ApplicationDTO[5];
	private int applicationIndex = 0;

	@Override
	public boolean save(ApplicationDTO dto) {
		if(this.applicationIndex < this.applicationDTO.length) {
			this.applicationDTO[applicationIndex] = dto;
			applicationIndex++;
			return true;
		}
		else {
			System.err.println("Memory is full , cannot add more files, max allowed is 5");
			
		}
		return false;
	}

}
