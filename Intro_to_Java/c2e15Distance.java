/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 1 Question 2.15
 */

import java.util.Scanner;

public class c2e15Distance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the x- and y-coordinates of point 1 separated by a space and without parentheses: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Point 1 = ("+x1+","+y1+")");
		System.out.println("Enter the x- and y-coordinates of point 2 separated by a space and without parentheses:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.println("Point 2 = ("+x2+","+y2+")");
		double distance = Math.pow(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2), 0.5);
		System.out.println("The distance between the two points is: "+distance);
	}
}
