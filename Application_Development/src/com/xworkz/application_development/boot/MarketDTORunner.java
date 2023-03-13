package com.xworkz.application_development.boot;

import com.xworkz.application_development.dto.MarketDTO;

public class MarketDTORunner {

	public static void main(String[] args) {
		
		MarketDTO market= new MarketDTO();
		
		market.setNameOfMarket("Malleshwaram Market");
		market.setTypeOfMarket("General Market");
		market.setAreaOfMarket(93569);
		market.setNumberOfStore(252);
		market.setLocation("Malleshwaram Bengaluru, Karnata 560003");
		
		System.out.println(market);
	}

}
