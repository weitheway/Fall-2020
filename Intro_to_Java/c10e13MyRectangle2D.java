/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 6 Question 10.13
 */

import javax.swing.JOptionPane;
import java.util.Scanner;

public class c10e13MyRectangle2D {

	public static void main(String[] args) {
		int outer=JOptionPane.YES_OPTION;	
		int inner=JOptionPane.YES_OPTION;	
		JOptionPane.showMessageDialog(null, "This program will ask the user to create a base rectangle then ask users to create multiple rectangles and "
				+ "\nthe program will test if the base rectangle contain, overlap, abut, or is distinct from the test rectangles","Program Purpose", JOptionPane.INFORMATION_MESSAGE);
		while(outer==JOptionPane.YES_OPTION){
			try{
				String base=JOptionPane.showInputDialog("Create a base rectangle. Enter values for x y width and height separated by a space: ");
				Scanner s = new Scanner(base);
				MyRectangle2D r1 = new MyRectangle2D(s.nextDouble(),s.nextDouble(),s.nextDouble(),s.nextDouble());
				while(inner==JOptionPane.YES_OPTION){
					try{
						String test =JOptionPane.showInputDialog("Create a test rectangle. Enter values for x y width and height separated by a space: ");
						s = new Scanner(test);
						MyRectangle2D r2 = new MyRectangle2D(s.nextDouble(),s.nextDouble(),s.nextDouble(),s.nextDouble());
						JOptionPane.showMessageDialog(null, "BASE RECTANGLE: "+ r1+ "\n"+ "Base Area = "+ r1.getArea() + " Base Perimeter = "+r1.getPerimeter()+
						"\nTEST RECTANGLE: "+r2+"\n"+"Test Area = "+r2.getArea()+" Test Perimeter = "+r2.getPerimeter()+
						"\nContains: " + r1.contains(r2)+" Overlap: " + r1.overlaps(r2)+" Abut: " + r1.abut(r2)+ " Distinct: "+r1.distinct(r2), "Test Result", JOptionPane.INFORMATION_MESSAGE);
						inner=JOptionPane.showConfirmDialog(null, "Do you want to create a new test rectangle?");
						
					} 
					catch(Exception ex){
						String outputStr = ex.getMessage() + "\nDo you want to create another test rectangle? ";
						inner = JOptionPane.showConfirmDialog(null, outputStr);
					}	
				}
				outer=JOptionPane.showConfirmDialog(null, "Do you want to create a new base rectangle?");
				inner = outer;
			}
				
			catch(Exception ex){
				String outputStr = ex.getMessage() + "\nDo you want to create a new base rectangle? ";
				outer = JOptionPane.showConfirmDialog(null, outputStr);
			}
		}
	}
}
