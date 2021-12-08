package com.vinaysoft;

public class BankAccount {
	
	int bankbalance;
	
	public int deposit(int deposit) {
	return deposit;	
	}
    public int withdraw(int withdraw) {
    return withdraw;
    }
	public int getBankbalance() {
		return bankbalance;
	}
	public void setBankbalance(int bankbalance) {
		this.bankbalance = bankbalance;
	}
	public BankAccount(int bankbalance) {
		super();
		this.bankbalance = bankbalance;
	}
    
}
