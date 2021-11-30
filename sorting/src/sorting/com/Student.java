package sorting.com;



public class Student implements Comparable<Student> {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	String  name;
	int rollno;
	
public Student(String name, int rollno) {
	this.name = name;
	this.rollno = rollno;
	
	
				
	}

@Override
public String toString() {
	return "ClassStudents [name=" + name + ", rollno=" + rollno + "]";
}

@Override
public int compareTo(Student that) {
	
	return Integer.compare(this.rollno, that.rollno);
}


}
	
	

	
	


