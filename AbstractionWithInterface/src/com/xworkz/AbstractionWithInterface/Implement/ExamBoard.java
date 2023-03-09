package com.xworkz.AbstractionWithInterface.Implement;

import com.xworkz.AbstractionWithInterface.things.ExamRule;

public class ExamBoard implements ExamRule{

	@Override
	public double minPassingMark() {
		
		return 40;
	}

	@Override
	public double examTiming() {

		return 3;
	}

}
