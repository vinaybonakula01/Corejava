package com.encapsulation.solving;

public class RectangleTes {

	public static void main(String[] args) {
	Rectangle rt = new Rectangle(20,30);
	int lth = rt.getlength();
    int bth = rt.getbreadth();
    int area = lth*bth;
    System.out.println("area:"+ area);
    rt.setlength(50);
    rt.setbreadth(60);
    int ln =rt.getlength();
    int br =rt.getbreadth();    
    int newarea=ln*br;
    System.out.println("newarea:"+ newarea);
	
	

	}

}
