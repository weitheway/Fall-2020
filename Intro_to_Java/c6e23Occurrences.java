/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 5 Question 6.23
 */

import javax.swing.JOptionPane;

public class c6e23Occurrences {
	public static void main(String[] args) {
		int option=JOptionPane.YES_OPTION;	
		JOptionPane.showMessageDialog(null, "This program counts the number a given character occurs in a string.","Program Purpose", JOptionPane.INFORMATION_MESSAGE);
		while(option==JOptionPane.YES_OPTION){
			String inp = JOptionPane.showInputDialog("Enter a String: "+"\nNote - Punctuations are allowed.");
			if (inp.length()!=0) {
				String letter = JOptionPane.showInputDialog("Enter a character to search for: ");
				char test = letter.charAt(0);
				int occurrence = count(inp,test);
				JOptionPane.showMessageDialog(null, "The letter '"+test+"' occurs in the string '"+inp+"' "+occurrence+" time(s).","Occurence Count", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "Please enter a string.","Error Detected", JOptionPane.ERROR_MESSAGE);
			}
			option = JOptionPane.showConfirmDialog(null, "Do you want to input another string and character?");
		}
	}
	private static int count(String str, char a) {   
		int count = 0;
		for (int i= 0; i<str.length();i++) {
			if (str.charAt(i)==a) {
				count++;
			}
		}
		return count;
	}


}
