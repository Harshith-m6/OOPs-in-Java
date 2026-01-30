package com.rcb.Inheritance;

public class Main6 {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setStuId(101);
		s.setStuName("Harshith");
		
		System.out.println("Student details :"+s.getStuId()+" student Id \n"+s.getStuName()+" Student Name");
	}

}
