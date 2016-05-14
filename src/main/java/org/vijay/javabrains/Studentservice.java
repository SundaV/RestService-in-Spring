package org.vijay.javabrains;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Studentservice {
	 private Map<Long, Student> student=DatabaseClass.getAllstudent();

	public List<Student> getAllStudent() {

		Student s = new Student("vijay", 1);
		Student s1 = new Student("sat", 2);
		ArrayList<Student> al = new ArrayList<>();
		al.add(s);
		al.add(s1);
		return al;
		
		

	
	}

}
