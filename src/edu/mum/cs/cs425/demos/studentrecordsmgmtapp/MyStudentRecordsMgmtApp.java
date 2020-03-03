package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

public class MyStudentRecordsMgmtApp {

	public static void main(String[] args) {
		MyStudentRecordsMgmtApp myStd = new MyStudentRecordsMgmtApp();
		//myStd.fillData();
		
		int[] numArr = new int[]{9,54,89,19,9,11,0,12,100,76};
		myStd.printHelloWorld(numArr);
		
		myStd.findSecondBiggest(numArr);
	}
	
	void fillData() {
		Student s1 = new Student("110001", "Dave", "11/18/1951");
		Student s2 = new Student("110002", "Anna", "12/07/1990");
		Student s3 = new Student("110003", "Erica", "01/31/1974");
		Student s4 = new Student("110004", "Carlos", "08/22/2009");
		Student s5 = new Student("110005", "Bob", "03/05/1990");
		Student[] stdArr = new Student[] {s1,s2,s3,s4,s5};
		printListOfStudents(stdArr);
		getListOfPlatinumAlumniStudents(stdArr);
	}
	
	void printListOfStudents(Student[] students){
		Arrays.sort(students);
		System.out.println("\n\nList of Students in Ascending Order By Name");
		for(Student s : students) {
			System.out.println(s);
		}
	}
	
	void getListOfPlatinumAlumniStudents(Student[] students){
		List<Student> platStds = new ArrayList<Student>();
		for(Student s : students) {
			if(s.isPlatinumAlumni())
				platStds.add(s);
		}
		
		platStds.sort(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				return s1.getDateOfAdmission().compareTo(s2.getDateOfAdmission());
			}
		});
		
		
		System.out.println("\n\nList of Students in Descending Order By Date of Admission");
		for(Student s : platStds) {
			System.out.println(s);
		}
	}
	
	void printHelloWorld(int[] arr) {
		for(int n : arr) {
			if(n < 5 && n < 7) continue;
			if(n%5 == 0) System.out.println("Hello");
			else if(n%7 == 0) System.out.println("World");
			else if(n%5 == 0 && n%7 == 0) System.out.println("HelloWorld");
			else ;//System.out.println("");
		}
	}
	
	void findSecondBiggest(int[] arr) {
		if(arr.length <2)
			System.out.println("Invalid Array Size");
		int max = 0, sec_max = 0;
		for(int n : arr) {
			if(n > max) {
				sec_max = max;
				max = n;
			}
			else if (n > sec_max)
				sec_max = n;
			
		}
		System.out.println("\nSecond Biggest Number: "+sec_max);
	}
}
