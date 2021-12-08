package com.vinaysoft;

public class SavingsAcount extends BankAccount {
   
	public SavingsAcount(int bankbalance) {
	super(bankbalance);
	}

@Override
  public int withdraw(int withdraw) {
    if(withdraw > 100000) {
    return	withdraw*80%100;
    }
    else {
    return withdraw;
    }
  }
 

}
