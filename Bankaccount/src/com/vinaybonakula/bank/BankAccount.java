package com.vinaybonakula.bank;

public class BankAccount {
	int bankbalance;

	public BankAccount(int bankbalance) {
		super();
		this.bankbalance = bankbalance%2;
	}

	public int deposit(int i) {
	return bankbalance=bankbalance+i;
	}

	public int withDraw(int i) {
	return bankbalance=bankbalance-i;
	}

	@Override
	public String toString() {
		return "BankAccount [bankbalance=" + bankbalance + "]";
	}

	
	

}
