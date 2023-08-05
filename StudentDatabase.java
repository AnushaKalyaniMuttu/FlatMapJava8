package com.order;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

	public static List<Student> getAllStudents(){
		Student s1=new Student("Adam",2,3.6,"male",Arrays.asList("swimming","basketball","volleyball"),10);
		Student s2=new Student("Jenny",2,3.6,"female",Arrays.asList("swimming","gymnastic","soccer"),20);
		Student s3=new Student("Emily",3,4.0,"male",Arrays.asList("swimming","basketball","aerobics"),30);
		Student s4=new Student("Dave",3,4.0,"female",Arrays.asList("swimming","basketball","volleyball"),40);
		Student s5=new Student("Sophia",4,3.5,"female",Arrays.asList("swimming","dancing","football"),50);
		Student s6=new Student("James",4,3.9,"male",Arrays.asList("swimming","basketball","baseball","football"),60);
		List<Student> students=Arrays.asList(s1,s2,s3,s4,s5,s6);
		return students;
	
	}
	
}
