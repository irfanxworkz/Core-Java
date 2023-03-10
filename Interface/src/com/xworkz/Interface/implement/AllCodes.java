package com.xworkz.Interface.implement;

import com.xworkz.Interface.things.CodingRule;
import com.xworkz.Interface.things.FamilyRule;
import com.xworkz.Interface.things.HospitalRule;
import com.xworkz.Interface.things.PubRule;
import com.xworkz.Interface.things.RailwayStation;

public class AllCodes implements CodingRule, FamilyRule, PubRule, HospitalRule, RailwayStation {

	// CodingRule
	@Override
	public String safe() {

		return null;
	}

	@Override
	public String secure() {

		return null;
	}

	@Override
	public String reiable() {

		return null;
	}

	@Override
	public boolean testable() {

		return false;
	}

	@Override
	public boolean maintainable() {

		return false;
	}

	@Override
	public String standards() {

		return null;
	}

	@Override
	public boolean portable() {

		return false;
	}

	@Override
	public boolean readable() {

		return false;
	}

	@Override
	public String result() {

		return null;
	}

	@Override
	public boolean easy() {

		return false;
	}

	// ---------------------------------------------------------------------------------

	// FamilyRule
	@Override
	public boolean dontTalk() {

		return false;
	}

	@Override
	public boolean dontSit() {

		return false;
	}

	@Override
	public String goingOut() {

		return null;
	}

	@Override
	public String havingParty() {

		return null;
	}

	@Override
	public boolean giveRespect() {

		return false;
	}

	@Override
	public int pocketMoney() {

		return 0;
	}

	@Override
	public boolean usePhone() {

		return false;
	}

	@Override
	public String interruption() {

		return null;
	}

	@Override
	public boolean afterNoonSleep() {

		return false;
	}

	@Override
	public String food() {

		return null;
	}

	@Override
	public boolean inTime() {

		return false;
	}

	@Override
	public boolean loudVoice() {

		return false;
	}

	@Override
	public boolean dress() {

		return false;
	}

	@Override
	public boolean claen() {

		return false;
	}

	@Override
	public boolean noSmoke() {

		return false;
	}

	// ---------------------------------------------------------------------------------

	// PubRule
	@Override
	public int noOfPeople() {

		return 0;
	}

	@Override
	public boolean smokingArea() {

		return false;
	}

	@Override
	public boolean couplesOnly() {

		return false;
	}

	@Override
	public String drinkName() {

		return null;
	}

	@Override
	public boolean dance() {

		return false;
	}

	// ---------------------------------------------------------------------------------

	// HospitalRule
	@Override
	public boolean icuWard() {

		return false;
	}

	@Override
	public int noOfAmbulance() {

		return 0;
	}

	@Override
	public String hospitalName() {

		return null;
	}

	@Override
	public int noOfBed() {

		return 0;
	}

	@Override
	public boolean noise() {

		return false;
	}

	@Override
	public String drName() {

		return null;
	}

	@Override
	public int noOfStaff() {

		return 0;
	}

	@Override
	public boolean parking() {

		return false;
	}

	@Override
	public int openTime() {

		return 0;
	}

	@Override
	public int visitingTime() {

		return 0;
	}
	// ---------------------------------------------------------------------------------

	// RailwayStation
	@Override
	public boolean noLoudSound() {

		return false;
	}

	@Override
	public String laggageRule() {

		return null;
	}

	@Override
	public boolean middleBerth() {

		return false;
	}

	@Override
	public boolean chainPulling() {

		return false;
	}

	@Override
	public boolean journyExtention() {

		return false;
	}

	@Override
	public int after10PM() {

		return 0;
	}

	@Override
	public boolean waitingListTicketTravel() {

		return false;
	}

	@Override
	public boolean enRouteJournyBreak() {

		return false;
	}
//---------------------------------------------------------------------------------

}
