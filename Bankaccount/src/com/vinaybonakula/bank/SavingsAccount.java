package com.vinaybonakula.bank;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(int bankbalance) {
		super(bankbalance);
		// TODO Auto-generated constructor stub
	}
@Override
public int withdraw(int i) {
	return bankbalance=bankbalance-i-1000;
	
}
}
