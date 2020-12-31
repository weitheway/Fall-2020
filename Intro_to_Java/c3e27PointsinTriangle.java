/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 2 Question 3.27
 */

import java.util.Scanner;
public class c3e27PointsinTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will test if the inputted point is within the given triangle.");
		System.out.println("The given triangle has a right angle at (0,0) and the other two points are at (200,0) and (0,100)");
		System.out.println("Please enter the x and y coordinates of your point on one line separated by a space");
		double x = input.nextDouble();
		double y = input.nextDouble();
		System.out.println("Inputted point is located at (" + x +","+y+")");
		if (x>0 && x<200 && y>0 && y<-0.5*x+100)
			System.out.println("The point is in the triangle.");
		else
			System.out.println("The point is not in the triangle.");
	}
}
