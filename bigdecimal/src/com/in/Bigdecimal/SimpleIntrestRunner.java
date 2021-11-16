package com.in.Bigdecimal;

import java.math.BigDecimal;

public class SimpleIntrestRunner {

	public static void main(String[] args) {
		Simpleintrestcalculater calculater = new Simpleintrestcalculater("4500.00","7.5");
		BigDecimal totalsum = calculater.calculatetotalvalue(5);
	
		System.out.println(totalsum);
		
				}

}
