package arrays.co.in;

public class Student {
	String name;
	int[] marks;
	

	public Student(String name , int[] marks) {
	this.name =name;
	this.marks=marks;
	}


	public int getnoofmarks() {
	int nom = marks.length;
	return nom;
	}


	public int gettotalsumofmarks() {
		int sum=0;
		for(int mark:marks) {
		sum=sum+mark;
		}
		return sum;
		}


	public int getmaximummark() {
		int maximum = Integer.MIN_VALUE;
		for(int mark:marks) {
			if(mark>maximum) {
				maximum = mark;
		}
		}
		return maximum;
	    }


	public int getminimum() {
		int minimum = Integer.MAX_VALUE;
		for(int mark:marks) {
			if(mark<minimum) {
				minimum = mark;
		}
		}
		
		return minimum;
	    }
	
		
	
}	


