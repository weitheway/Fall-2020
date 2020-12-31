/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 1 Question 2.19
 */

import java.util.Scanner;

public class c2e19Triangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the x- and y-coordinates of the 3 corners of the triangle separated by a space and without parentheses: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		System.out.println("Point 1 = ("+x1+","+y1+")");
		System.out.println("Point 2 = ("+x2+","+y2+")");
		System.out.println("Point 3 = ("+x3+","+y3+")");
		//side1 = distance between 1 an 2
		double side1 = Math.pow(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2), 0.5); 
		//side2 = distance between 2 an 3
		double side2 = Math.pow(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2), 0.5);
		//side3 = distance between 1 an 3
		double side3 = Math.pow(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2), 0.5);
		double s = (side1+side2+side3)/2;
		double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
		System.out.println("The area of the triangle provided is: " + area);
	}
}
