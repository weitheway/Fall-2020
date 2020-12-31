/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 4 Question 9.1
 */

import java.util.Scanner;

public class c9e1Rectangle {
	public static void main(String[] args) throws Exception {
		System.out.println("This program will implement a Rectangle "
				+ "class that will display the width, height, area and perimeter when called.");
		Rectangle a = new Rectangle();
		Rectangle rect1 = new Rectangle(4,40);
		Rectangle rect2 = new Rectangle(3.5,35.9);
		System.out.println("RECTANGLE 1");
		System.out.println("The width of rectangle 1 is: " + rect1.getWidth());
		System.out.println("The height of rectangle 1 is: " + rect1.getHeight());
		System.out.println("The area of rectangle 1 is: " + rect1.getArea());
		System.out.println("The perimeter of rectangle 1 is: " + rect1.getPerimeter());
		System.out.println("RECTANGLE 2");
		System.out.println("The width of rectangle 2 is: " + rect2.getWidth());
		System.out.println("The height of rectangle 2 is: " + rect2.getHeight());
		System.out.println("The area of rectangle 2 is: " + rect2.getArea());
		System.out.println("The perimeter of rectangle 2 is: " + rect2.getPerimeter());
		while (true){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter 'run' followed by the width and height of another rectangle separated by a space or enter quit to end.");
			System.out.println("Example: run 2 2 for a 2x2 rectangle");
			try {
				String test = input.next();
				if (test.equals("quit")) {
					return;
				}
				double width = input.nextDouble();
				double height = input.nextDouble();
				a = new Rectangle(width, height);
				System.out.println("The width of rectangle  is: " + a.getWidth());
				System.out.println("The height of rectangle is: " + a.getHeight());
				System.out.println("The area of rectangle is: " + a.getArea());
				System.out.println("The perimeter of rectangle is: " + a.getPerimeter());
				
			} catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
	}		
}
