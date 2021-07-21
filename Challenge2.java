package com.Challenges;

public class Challenge2 {
	static double pi=3.14;
	public static double area(double r) {
		if(r<0) {
			return -1.0;
		}
		return pi*(r*r);
	}

	public static double area(double x,double y) {
		if(x<0&&y<0) {
			return -1.0;
		}
		return x*y;
	}
	
	   public static void main(String[] args) {
		System.out.println(area(15));
		System.out.println(area(12,14));
	}
}
