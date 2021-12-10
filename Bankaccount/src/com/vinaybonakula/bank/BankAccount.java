package com.vinaybonakula.bank;

public class BankAccount {
	int bankbalance;

	public BankAccount(int bankbalance) {
		super();
		this.bankbalance = bankbalance;
	}

	public int deposit(int i) {
	return bankbalance=bankbalance+i;
	}

	public int withDraw(int i) {
		
		return bankbalance=bankbalance-i;
	}

	public int withdraw(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
