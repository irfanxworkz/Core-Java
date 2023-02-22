package com.xworkz.Concept.thing;

public class Park 
{
	private String parkName;
	private String location;
	private int parkSize;
	private int openTiming;
	private boolean clean;
	private boolean playGround;
	
	public Park(String parkName,String location,int parkSize,int openTiming,boolean clean,boolean playGround)
	{
		this.parkName=parkName;
		this.location=location;
		this.parkSize=parkSize;
		this.openTiming=openTiming;
		this.clean=clean;
		this.playGround=playGround;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in Park : "+obj);
		if(obj !=null)
		{
			System.out.println("Object is not null...");
			if(obj instanceof Park)
			{
				System.out.println("Obj is park type, compare it...");
				
				Park cast=(Park) obj;
				Park park1=this;
				Park park2=cast;
				
				if(park1.parkName.equals(park2.parkName) 
						&& park1.location.equals(park2.location)
						&& park1.parkSize==park2.parkSize
						&& park1.openTiming==park2.openTiming 
						&& park1.clean==park2.clean
						&& park1.playGround==park2.playGround
					)
				{
					System.out.println("both are same");
					return true;
				}
				else
				{
					System.out.println("Both are Not same");
				}
			}
			else
			{
				System.out.println("obj is not Park type, not compared it");
			}
		}
		else
		{
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}
	
	
	@Override
	public String toString() {
		System.out.println("Running toString in Park Class...");
		return "[Park name is: "+parkName+"] [park location is: "+location+"] [parksize is: "+parkSize+"] [park Opening time is: "+openTiming+"] [park is clean : "+clean+"] [park has playgpund :"+playGround+"]";
	}
}
