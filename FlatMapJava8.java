package com.order;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapJava8 {

	public static void main (String [] args) {
	
	
	StudentDatabase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream)
	.distinct().collect(Collectors.toList()).forEach(System.out::println);
	}
}
