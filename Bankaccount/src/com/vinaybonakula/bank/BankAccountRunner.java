package com.vinaybonakula.bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.vinaybonakula.bank.Transaction.Transactiontype;

public class BankAccountRunner {
       
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("WELL-COME TO OUR BANK");
			ArrayList<BankAccount> accounts = new ArrayList<>();
			
			System.out.println("Choose your options....");
			
			System.out.println("1. Create Account");
			System.out.println("2. View statement");
			System.out.println("3. deposit");
			System.out.println("4. withdraw.");
			System.out.println("0. exit");
			int choice =1 ;//scanner.nextInt();
			while(choice != 0) {
				System.out.println("Choose your options....");
				
				System.out.println("1. Create Account");
				System.out.println("2. View statement");
				System.out.println("3. deposit");
				System.out.println("4. withdraw.");
				System.out.println("0. exit");
				 choice = scanner.nextInt();
				switch(choice) {
				 case 1:
				 {
					 System.out.println("Choose account type");
					 System.out.println("1'SavingsAccount");
					 System.out.println("2.CurrentAccount");
					 int choice2 = scanner.nextInt();
					 if(choice2 == 1) {
						 //creat current in list and return number
						 System.out.println(" submit your name::");	
						 String name = scanner.next();
						 System.out.println("give your bankbalance for your account:");	
						 int balance = scanner.nextInt();
						 BankAccount savingAccount = new SavingsAccount(name, balance);
						 accounts.add(savingAccount);
						 System.out.println("bank account is created ! your account id:-  "+accounts.size());
						 Transaction transaction = new Transaction(new Date(), balance,Transactiontype.CREDIT);
						 List<Transaction> transactionlist = savingAccount.transactions;
						 transactionlist.add(transaction);
						 
					 }else {
						 System.out.println("submit your name:");	
						 String name = scanner.next();
						 System.out.println("give your bankbalance for your account:");	
						 int balance = scanner.nextInt();
						 BankAccount currentAccount = new CurrentAccount(name, balance);
						 accounts.add(currentAccount);
						 System.out.println("bank account is created ! your account id:-  "+accounts.size());
						 Transaction transaction = new Transaction(new Date(), balance,Transactiontype.CREDIT);
						 List<Transaction> transactionlist =  currentAccount.transactions;
						 transactionlist.add(transaction);
						 
					}
					 
					 break;
				 }
				 case 2:
				 {
					   System.out.println("Give ur account id");
				       int id = scanner.nextInt();
				       BankAccount custAccount = accounts.get(id-1);
				       custAccount.printStatement();
			           break;
				       
				 }
				 case 3:
				 { 
					   System.out.println("Give ur account id");
				       int id = scanner.nextInt();
				       BankAccount custAccount = accounts.get(id-1);
				       System.out.println("enter your deposit amount");
				       int amount =scanner.nextInt();
				       System.out.println("your balance after deposit"+ custAccount.deposit(amount));
				       Transaction transaction = new Transaction(new Date(), amount,Transactiontype.DEBIT);
						 List<Transaction> transactionlist =  custAccount .transactions;
						 transactionlist.add(transaction);
						 
				       break;
				 }
				 case 4:
				 {
					  System.out.println("Give ur account id");
					  int id = scanner.nextInt();
				      BankAccount custAccount = accounts.get(id-1);
				      System.out.println("enter your withDraw amount");
				      int amount =scanner.nextInt();
				      System.out.println("your balance after deposit"+ custAccount.withDraw(amount));
				      Transaction transaction = new Transaction(new Date(), amount,Transactiontype.DEBIT);
						 List<Transaction> transactionlist =  custAccount .transactions;
						 transactionlist.add(transaction);
				      break;
				 }
				 default:
				 {	 System.out.print("Thank you");
					 choice = 0;
					 break;
				 }
				}
			}
			
		}

		
}