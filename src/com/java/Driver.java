package com.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Driver {

	/*
	 * Input Student Exam Grade John Phy 45 Dave Phy 67 Dave Maths 82 John Maths 91
	 * Chris Eng 70 John Eng 88
	 * 
	 * Find out maximum marks in each subject
	 */

	public static void main(String[] args) {

		Student s = new Student("John", "Phy", 45);
		Student s1 = new Student("Dave", "Phy", 67);
		Student s2 = new Student("Dave", "Maths", 82);
		Student s3 = new Student("John", "Maths", 91);
		Student s4 = new Student("Chris", "Eng", 70);
		Student s5 = new Student("John", "Eng", 88);

		List<Student> list = new ArrayList<>();
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		List<Student> studentList = new ArrayList<>(list.stream()
				.collect(Collectors.toMap(Student::getSubject, obj -> obj, (existingValue, newValue) -> existingValue))
				.values());

		String[] str = new String[studentList.size()];
		
		int i = 0;
		
		for (Iterator<Student> iterator = studentList.iterator(); iterator.hasNext();) {
			Student stud = (Student) iterator.next();
			str[i++] = stud.getSubject();

		}
		
		for (String string : str) {
			Optional<Student> maxMarksStud = list.stream().filter(p -> p.getSubject().equals(string))
					.collect(Collectors.maxBy(Comparator.comparing(Student::getMarks)));
			maxMarksStud.stream().forEach(e -> {
				System.out.println(e);
			});
		}
	}

}
