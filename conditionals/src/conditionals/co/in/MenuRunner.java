package conditionals.co.in;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("1.please enter a number1");
		int number1 = scanner.nextInt();
		System.out.println("The First number u have enterd is --"+number1);
		
		System.out.println("2.please enter number2");
		int number2 = scanner.nextInt();
		System.out.println("The Second number u have enterd is -- "+number2);
		
		System.out.println("Availabe operations are:");
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.multiply");
		System.out.println("4.divide");
		
		System.out.println("select your operation");
		int operation = scanner.nextInt();
		System.out.println("The selected operation no:- "+operation);
		 
		if(operation==1) {
			System.out.println("Result:-  "+(number1+number2));
		}
		
		else if(operation==2) {
			System.out.println("Result:-  "+(number1-number2));
		}
		else if(operation==3) {
			System.out.println("Result:-  "+(number1*number2));
			
		}
		else if(operation==4) {
			System.out.println("Result:-  "+(number1%number2));
		}
		else {
			System.out.println("invalid operation");
		}
	
		}

        }
