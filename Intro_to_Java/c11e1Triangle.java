/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 6 Question 11.1
 */

import javax.swing.JOptionPane;
import java.util.Scanner;
public class c11e1Triangle {

	public static void main(String[] args) {
		int option=JOptionPane.YES_OPTION;	
		JOptionPane.showMessageDialog(null, "This program will ask the user to enter three sides of the triangle, a color, and a Boolean value for colorfill create a triangle.","Program Purpose", JOptionPane.INFORMATION_MESSAGE);
		while(option==JOptionPane.YES_OPTION){
			try{
				String dim = JOptionPane.showInputDialog("Enter values for side1, side2, and side3 separated by a space: " );
				if (dim == null) {
					option=JOptionPane.showConfirmDialog(null, "Do you want to create a new triangle?");
					return;
				}
				Scanner s = new Scanner(dim);
				Triangle t = new Triangle(s.nextDouble(),s.nextDouble(),s.nextDouble());
				String c = JOptionPane.showInputDialog("Enter a color for the triangle: " );
				s = new Scanner(c);
				t.setColor(s.next());
				String b = JOptionPane.showInputDialog("Do you want to fill the triangle? Enter true or false. " );
				s = new Scanner(b);
				t.setFilled(s.nextBoolean());
				option=JOptionPane.showConfirmDialog(null, "Triangle summary: \n" + t+"\nArea: "+t.getArea()+"\nPerimeter: "+t.getPerimeter()+"\nColor: "+t.getColor()+"\nFilled: "+t.isFilled()+"\nDo you want to create a new triangle?");
		
			}
			catch(IllegalTriangleException ex){
				JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Detected", JOptionPane.ERROR_MESSAGE);
				option = JOptionPane.showConfirmDialog(null, "Do you want to input new values for the sides?");
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error Detected", JOptionPane.ERROR_MESSAGE);
				option = JOptionPane.showConfirmDialog(null, "Do you want to input new values for the sides?");
			}
		} 
	}

}
