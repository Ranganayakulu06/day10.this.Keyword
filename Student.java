package com.thisKeyword;

public class Student {
	private int rollNo;
	private String name;
	
	public Student(int rollNo, String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	public void updateDetails(String name) {
		System.out.println("Old name: " + this.name);
		this.name=name;
		System.out.println("New name: " + this.name);
	}
	public void display() {
		System.out.println("Student RollNo: " + rollNo);
		System.out.println("Student Name: " + name);
	}
	public static void main(String [] args) {
		Student student = new Student(123456,"Ranga");
		student.display();
		student.updateDetails("Babu");
		student.display();
				
	}
}
