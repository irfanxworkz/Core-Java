package com.xworkz.festival.repository;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.exception.FestivalMemoryFullException;

public class FestivalRepositoryImpl implements FestivalRepository {
	
	private FestivalDTO[] festivalDTO = new FestivalDTO[4];
	private int indexFestival = 0;

	@Override
	public boolean save(FestivalDTO dto) {
		if (this.indexFestival < this.festivalDTO.length) {
			this.festivalDTO[indexFestival] = dto;
			indexFestival++;
			return true;
		} else {
			System.err.println("memory is full cannot add morefiles,max allowed is 4");
			throw new FestivalMemoryFullException("Memory is full cannot add festivals..");
		}
	}
	

}
