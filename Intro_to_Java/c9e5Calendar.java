/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 4 Question 9.5
 */

import java.util.GregorianCalendar;

public class c9e5Calendar {
	public static void main(String[] args) {
		System.out.println("This program will display the current year, month, and day.");
		System.out.println("This program will also display "
				+ "the elapsed time since January 1, 1970 given a pre-determined time in milliseconds");
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println("Today's date is "+(cal.get(GregorianCalendar.MONTH)+1) + 
				"/" + cal.get(GregorianCalendar.DAY_OF_MONTH) + "/" + cal.get(GregorianCalendar.YEAR));
		cal.setTimeInMillis(1234567898765L);
		System.out.println("1234567898765L milliseconds from 1/1/1970 is "+
		(cal.get(GregorianCalendar.MONTH)+1) + "/" + cal.get(GregorianCalendar.DAY_OF_MONTH) + "/" + 
				cal.get(GregorianCalendar.YEAR));	
	}

}
