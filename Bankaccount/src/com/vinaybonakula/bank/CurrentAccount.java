package com.vinaybonakula.bank;

public class CurrentAccount extends BankAccount {

	public CurrentAccount(int bankbalance) {
		super(bankbalance);
		
	}

	public CurrentAccount(String name, int balance) {
	this.name=name;
	this.bankbalance = balance;
	}

}
