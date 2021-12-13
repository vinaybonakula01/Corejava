package com.vinaybonakula.bank;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(int bankbalance) {
		super(bankbalance);
		// TODO Auto-generated constructor stub
	}
public SavingsAccount(String name , int balance) {
		this.name = name;
		this.bankbalance = balance;
		
	}
@Override
public int withDraw(int i) {
	return bankbalance=bankbalance-i-1000;
	
}
}
