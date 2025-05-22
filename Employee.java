package com.thisKeyword;

public class Employee {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public void setSalary(String name , double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
	}
	
	public static void main(String [] args) {
		System.out.println("Before modification:");
		Employee employee = new Employee("Babu", 30000);
		employee.display();
		System.out.println("-----------------");
		System.out.println("After modification:");
		employee.setSalary("Ranga", 250000);
		employee.display();
		
	}
}
