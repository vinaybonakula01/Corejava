package com.vinaybonakula.bank;

import java.util.Scanner;

public class BankAccountRunner {

	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("WELL-COME TO OUR BANK");
			
            System.out.println("The bankbalance is needed to create the new account");
            int bankbalance =scanner.nextInt();
            System.out.println("new bankAccount is created and your bankbalance is:- "+bankbalance);
            System.out.println("AVAILABLE:");
            System.out.println("1.NEXT");
            System.out.println("2.BACK");
            System.out.println("CHOOSE");
            int CHOOSE = scanner.nextInt();
            System.out.println("selected option: "+CHOOSE);
            
            if(CHOOSE==1) {
               System.out.println("1.Savingsaccount");
               System.out.println("2.Currentaccount");
               System.out.println("select");
               int select = scanner.nextInt();
               System.out.println("selected option: "+select);
               if(select==1) {
            	   System.out.println("your bankbalance in SavingsAccount is:- "+ bankbalance);
               if(select==2) {
            	   System.out.println("your bankbalance in CurrentAccount"+bankbalance);
               }
               }
               
            }
            else if(CHOOSE==2) {
            	System.out.println("THANKYOU FOR VISITING! HAVE A NICE DAY");
            }
            
            
            
            
            
            
            
            

	}

}
