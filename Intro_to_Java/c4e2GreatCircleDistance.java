/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 2 Question 4.2
 */

import java.util.Scanner;

public class c4e2GreatCircleDistance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will compute the great circle disance between two points on the surface of a sphere.");
		System.out.println("The formula is: d=radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1-y2))");
		System.out.println("Note: Use negative to indicate south and east");
		System.out.println("Enter the latitude and longitude of point 1 in degrees on one line separated by a space: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter the latitude and longitude of point 2 in degrees on one line separated by a space: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.println("Point 1 is located at "+x1+ " latitude and "+y1+ " longitude");
		System.out.println("Point 2 is located at "+x2+ " latitude and "+y2+ " longitude");
		double d = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + 
				   Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * 
				   Math.cos(Math.toRadians(y1)-Math.toRadians(y2)));
		System.out.println("The distance between the two points is "+d+" km.");
	}
}
