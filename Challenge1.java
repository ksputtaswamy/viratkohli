package com.Challenges;

public class Challenge1 {
	public static String   getDurationString(int min,int sec) {
		if(min>=0 && sec>=0 && sec<=59 ) {
			int hour=0;
			int minutes=0;
			int seconds=sec;
			hour=min/60;
			minutes=min%60;
			return hour+"h"+" : "+minutes+"m"+" : "+sec+"s";
		}
		else
		{
			return "Invalid Value";
		}
		
	}
	
	public static void getDurationString(int sec)
	{
		if(sec>=0)
		{
			int minutes;
			int seconds;
			minutes=sec/60;
			seconds=sec%60;
			System.out.println(minutes+""+ seconds);
		}
		else
		{
			System.out.println("Invalid Value");
		}
	}

	   public static void main(String[] args) {
		  
		   System.out.println(getDurationString(5,30));
		   getDurationString(4);
		   
		
	}
	

}
