package com.in.Bigdecimal;

import java.math.BigDecimal;

public class Simpleintrestcalculater {
	BigDecimal principal;
	BigDecimal intrest;

	public Simpleintrestcalculater(String principal, String intrest) {
		this.principal=new BigDecimal(principal) ;
		this.intrest=new BigDecimal(intrest).divide(new BigDecimal(100));
		
	}

	public BigDecimal calculatetotalvalue(int noofyears) {
		
		BigDecimal totalsum=principal.add(principal.multiply(intrest).multiply(new BigDecimal(noofyears)));
		                                                                          //totalsum=principal+principal*intrest*noofyears
		return totalsum;
	}

	
		
	

}
