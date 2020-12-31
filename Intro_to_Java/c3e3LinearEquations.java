/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 2 Question 3.3
 */

import java.util.Scanner;

public class c3e3LinearEquations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will be solving a 2x2 linear equation.");
		System.out.println("The Cramer's rule is as follows:");
		System.out.println("ax+by=e");
		System.out.println("cx+dy=f");
		System.out.println("x=(ed-bf)/(ad-bc)");
		System.out.println("y=(af-ec)/(ad-bc)");
		System.out.println("Please enter values for "
				+ "a,b,c,d,e,and f in one line separated "
				+ "by a space");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		System.out.println("You have inputted a = " + a + ", b = "
				+b + ", c = " +c +" , d = "+d+", e = "+e +
				", f = " + f);
		if (a*d-b*c == 0) {
			System.out.println("The equation has no solution.");
		}else {
			double x = (e*d-b*f)/(a*d-b*c);
			double y = (a*f-e*c)/(a*d-b*c);
			System.out.println("x is " + x +" and y is " + y);
		}
	}

}
