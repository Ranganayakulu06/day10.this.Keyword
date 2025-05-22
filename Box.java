package com.thisKeyword;

public class Box {
	private int length;
	
	public Box(int length) {
		this.length=length;
	}
	public Box setLength(int length) {
		this.length = length;
		return this;
	}
	public void display() {
		System.out.println("Length: " + length);
	}
	
	public static void main(String[] args) {
		Box box = new Box(5);
		box.display();
		box.setLength(10).display();
	}
}
