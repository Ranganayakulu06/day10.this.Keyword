package com.thisKeyword;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void print() {
		System.out.println("X: " + this.x);
		System.out.println("Y: " + this.y);
		System.out.println("Current address reference: " + this);
	}
	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(30,40);
		
		p1.print();
		System.out.println();
		p2.print();
	}
	
}
