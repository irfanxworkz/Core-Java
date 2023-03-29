package com.xworkz.festival.services;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.exception.InvalidFestivalException;

public interface FestivalServices {

	boolean validateAndThenSave(FestivalDTO dto) throws InvalidFestivalException;
}
