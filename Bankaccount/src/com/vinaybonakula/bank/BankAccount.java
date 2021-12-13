package com.vinaybonakula.bank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	int bankbalance;
	String name;
	int id;

	List<Transaction> transactions = new ArrayList<Transaction>();

	public BankAccount() {
		//
	}
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

	@Override
	public String toString() {
		return "BankAccount [bankbalance=" + bankbalance + "]";
	}
	public void printStatement() {
     for(Transaction transaction:transactions) {
    	 
    	System.out.println(transaction); 
     }
		
	}

	
	

}
