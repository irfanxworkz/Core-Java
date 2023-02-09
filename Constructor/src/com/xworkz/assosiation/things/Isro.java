package com.xworkz.assosiation.things;

public class Isro
{
	public String[] location;
	public int[] setelliteNos;
    public Scientest[] scientest;
	
	public Isro()
	{
		System.out.println("calling no-arg comstructor...");
	}
	
	public void setlocation(String[] location)
	{
		this.location=location;
	}
	
	public void setsetelliteNos(int[] setelliteNos)
	{
		this.setelliteNos=setelliteNos;
	}
	
	public void setscientest(Scientest[] scientest)
	{
		this.scientest=scientest;
	}
	
	public void display()
	{
		if(this.location !=null)
		{
			for(int seq=0;seq<this.location.length;seq++)
			{
				String element=this.location[seq];
				System.out.println("location:-"+element+" at index of: "+seq);
			}
		}
		else
		{
			System.err.println("not pointing to memory location...");
		}
		
		if(this.setelliteNos !=null)
		{
			for(int num=0;num<this.setelliteNos.length;num++)
			{
				int element =this.setelliteNos[num];
				System.out.println("setellite no:"+element+" at index of:"+num);
			}
			 
		}
		else
		{
			System.err.println("not pointing of setellite no: ");
		}
		
		if(this.scientest !=null)
		{
			for(int seq=0;seq<this.scientest.length;seq++)
			{
				Scientest element=this.scientest[seq];
				System.out.println("scientest at index of:"+seq);
				element.show();
			}
		}
		
	}
		 

}
