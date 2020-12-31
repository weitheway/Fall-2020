/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 4 Question 9.11/9.12
 */
import java.util.Scanner;
public class c9e11_12Lines {
	public static void main(String[] args) {
		System.out.println("The following program allows you to enter "
				+ "values for a 2x2 system of linear equations and provides \n"
				+ "the solution (if any) as well as allowing you to enter 2 line "
				+ "segments and display the intersection point.\n");
		while (true){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter 'run' followed by the values of a,b,c,d,e,f separated by a space or enter quit to end.");
			System.out.println("Example: run 1 2 3 4 5 6");
			String test = input.next();
			if (test.equals("quit")) {
				return;
			}
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			double d = input.nextDouble();
			double e = input.nextDouble();
			double f = input.nextDouble();
			LinearEquation LinearEQ = new LinearEquation(a, b, c, d, e, f);
			
			if(LinearEQ.isSolvable())
				System.out.println("The solution is: X = " + LinearEQ.getX() + " and Y = " + LinearEQ.getY());
			else
				System.out.println("This 2x2 system of linear equations has no solution");
			
			System.out.println("Enter 'run' followed by the endpoints of two lines x1,y1,x2,y2,x3,y3,x4,y4 separated by a space or enter quit to end.");
			System.out.println("Example: run 1 2 3 4 5 6 7 8");
			String test2 = input.next();
			if (test2.equals("quit")) {
				return;
			}
			double x1 = input.nextDouble();			
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			double x3 = input.nextDouble();
			double y3 = input.nextDouble();
			double x4 = input.nextDouble();
			double y4 = input.nextDouble();
			LinearEquation LinearEQ2 = new LinearEquation(x1, y1, x2, y2, x3, y3, x4, y4);
			if(LinearEQ2.isSolvable())
				System.out.println("The intersection point of these two lines is at: X = " + LinearEQ2.getX() + " and Y = " + LinearEQ2.getY());
			else
				System.out.println("These two lines do not intersect.");
		}
	}
}
