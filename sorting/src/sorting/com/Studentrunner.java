package sorting.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Studentrunner {

	public static void main(String[] args) {
	List<Student> Students = List.of(new  Student("vinay",6),
				new Student("ramu",4),new Student("sampath",2),new Student("rakesh",13));
				
		List<Student> StudentsAl = new ArrayList<>(Students);
		System.out.println(Students);
        Collections.sort(StudentsAl);
        System.out.print(StudentsAl);
		
		
		}

}