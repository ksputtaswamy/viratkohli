package com.Challenges;

public class Challenge3 {
	public static void printEqual(int x,int y, int z) {
		if(x<0||y<0||z<0) {
			System.out.println("Invalid value.....");
		}else if(x==y&&x==z&&y==z)
		{
			System.out.println("All numbers are equal...");
			
		}else
		{
			System.out.println("All numbers are differnt......");
		}
		
	}
	public static void main(String[] args) {
		printEqual(1,1,1);
	}

}
