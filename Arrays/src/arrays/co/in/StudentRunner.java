package arrays.co.in;

public class StudentRunner {

	public static void main(String[] args) {
		
		
		int[]marks = {99,98,89,89};
		Student student = new Student("vinay",marks);
		System.out.println("Name o fthe student                  :-- vinay");
		int number = student.getnoofmarks();
		System.out.println("Number of marks assigned to a student:-- "+number);
		int sum = student.gettotalsumofmarks();
		System.out.println("Total marks                          :-- "+sum);
		int maximum = student.getmaximummark();
		System.out.println("Maximum mark he got                  :-- "+maximum );
		int minimum = student.getminimum();
		System.out.println("Minimum mark he got                  :-- "+minimum);
		
	}

}
