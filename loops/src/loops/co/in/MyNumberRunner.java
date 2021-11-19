package loops.co.in;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(5);
		boolean isprime = number.isprime();
		System.out.println("The given number is: " +isprime);
		int sum = number.sumUptoN();
		System.out.println("sum of the numbers up to given number is: "+sum);
		int sumofdivisers = number.sumofdivisers();
		System.out.println("sum of the divisers of a given number: "+sumofdivisers);
		number.printanumbertriangle();
		
		

	}

}
