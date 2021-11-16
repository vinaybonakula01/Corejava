package com.in.encapsulation;

public class Squaretest {

	public static void main(String[] args) {
		Sqaure sqr = new Sqaure();
		sqr.setside1(20);
		sqr.setside2(25);
		
		int sd1=sqr.getside1();
		int sd2=sqr.getside2();
		int area=sd1*sd2;
		System.out.println("area"+area);
		
		
		

	}

}
