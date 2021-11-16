package com.primitivedatatypes;

public class Binumbertest {

	public static void main(String[] args) {
		Binumber numbers = new Binumber(2,3);
	    System.out.println(numbers.add(2, 3));
	    System.out.println(numbers.multiply(2,3));
	    numbers.doublevalue();
		
	    System.out.println(numbers.geta());//answer is 4 because above this we have doubl ed the value
	    System.out.println(numbers.getb());
	    
		

	}

}
