package com.adnan.classandobjects;

public class Box {
	
	int l;
	int b;
	
	public Box(int x, int y) {
		this.l = x;
		this.b = y;
	}
	
	public static void main(String[] args) {
		
//		Box box1 = new Box();				instead this we could use constructor
//		box1.l = 10;
//		box1.b = 20;
//		
//		Box box2 = new Box();
//		box2.l = 30;
//		box2.b = 50;
		
		
		Box box1 = new Box(10, 20);
		Box box2 = new Box(30, 50);
		
		System.out.println("Box 1 [ length = " + box1.l + ", breadth = " + box1.b + " ]");
		System.out.println("Box 2 [ length = " + box2.l + ", breadth = " + box2.b + " ]");
		
		System.out.println("now box1 = box2 let's see what happens");
		
		box1 = box2;
		
		System.out.println("Box 1 [ length = " + box1.l + ", breadth = " + box1.b + " ]");
		System.out.println("Box 2 [ length = " + box2.l + ", breadth = " + box2.b + " ]");
		
		System.out.println("now let's change the value of one of the box and see what happens");
		
		box2.l = 99;
		box2.b = 99;
		
		System.out.println("Box 1 [ length = " + box1.l + ", breadth = " + box1.b + " ]");
		System.out.println("Box 2 [ length = " + box2.l + ", breadth = " + box2.b + " ]");
	}

}
