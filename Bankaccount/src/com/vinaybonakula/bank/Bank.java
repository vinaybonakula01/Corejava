package com.vinaybonakula.bank;

import java.util.ArrayList;

public class Bank {
	private ArrayList<BankAccount> accounts = new ArrayList<>();

	public ArrayList<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<BankAccount> accounts) {
		this.accounts = accounts;
	}
}
