/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 5 Question 6.18
 */

import javax.swing.JOptionPane;

public class c6e18Password {
	public static String error = "";
	public static void main(String[] args) {
		int option=JOptionPane.YES_OPTION;	
		JOptionPane.showMessageDialog(null, "This program will check whether a given password meets all password requirements or not.","Program Purpose", JOptionPane.INFORMATION_MESSAGE);
		while(option==JOptionPane.YES_OPTION){
			try{
				String password=JOptionPane.showInputDialog("Enter a Password: " +
			"\nNote - Valid passwords must"
			+ "\n1. Have at least 8 characters "
			+ "\n2. Consists of only letters and digits "
			+ "\n3. Have at least 2 digits");
				if(isValidPassword(password)) {
					option=JOptionPane.showConfirmDialog(null, "'" + password +"' is a valid password"+"\nDo you want to input another password?");
				}
				else {
					JOptionPane.showMessageDialog(null, error,"Error Detected", JOptionPane.ERROR_MESSAGE);
					option=JOptionPane.showConfirmDialog(null,password + " is an invalid password"+"\nDo you want to try another password?");
					
				}
			} // end try
			catch(Exception ex){
				String outputStr = " Invalid Password: " + 
			ex.getMessage() + "\nDo you want to continue? ";
				option = JOptionPane.showConfirmDialog(null, outputStr);
				} // end catch
			} // end while
	} // end main()   
	private static boolean isValidPassword(String str) throws Exception {   
		int NUM_DIGIT_COUNT = 0;
		if (str.length() < 8)
		{
			error = "Password must have at least 8 characters";
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (!(Character.isLetterOrDigit(str.charAt(i)))) {
				error = "Password must consists only of letters and digits";
				return false;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if ((Character.isDigit(str.charAt(i)))) {
				NUM_DIGIT_COUNT = NUM_DIGIT_COUNT + 1;
			}
		}
		if (NUM_DIGIT_COUNT < 2) {
			error = "Password must have at least 2 digits";
			return false;
		}
		return true;
	}// end isValidPassword

}
