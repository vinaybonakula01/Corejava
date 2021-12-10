package com.vinaybonakula.bank;

public class BankAccountRunner {

	
		public static void main(String[] args) {
	        BankAccount savingAccount = new SavingsAccount(10000);
	        BankAccount currentAccount = new CurrentAccount(10000);


	        System.out.println("after deposit saving account  balance: "+ savingAccount.deposit(90000));
	        System.out.println("after deposit saving account  balance: "+ currentAccount.deposit(490000));


	        System.out.println("after withdrawal saving account  balance: "+ savingAccount.withDraw(5000));
	        System.out.println("after withdrawal saving account  balance(1000 charges applied): "+ savingAccount.withDraw(10000));

	        System.out.println("after withdrawal current account balance: "+ currentAccount.withDraw(10000));
	}

}
