package com.vinaysoft;

public class AxisBank {

	public static void main(String[] args) {
    SavingsAcount account = new SavingsAcount(300000);
    account.withdraw(200000);
    System.out.println(account.withdraw(200000));
	}

}
