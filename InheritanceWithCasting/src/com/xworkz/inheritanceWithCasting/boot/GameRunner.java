package com.xworkz.inheritanceWithCasting.boot;
import com.xworkz.inheritanceWithCasting.thing.CandyCrush;
import com.xworkz.inheritanceWithCasting.thing.Game;
public class GameRunner
{
	public static void main(String[] args)
	{
		CandyCrush candy=new CandyCrush();
		candy.tileMatching();
		String name=candy.getName();
		System.out.println(name);
			
		Game game=new CandyCrush();
		String name1=game.getName();
		System.out.println(name1);
		
		CandyCrush cast=(CandyCrush) game;//casting
		cast.tileMatching();
		

	}

}
