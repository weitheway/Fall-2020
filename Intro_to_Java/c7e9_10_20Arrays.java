/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 3 Question 7.9/7.10/7.20
 */


/*
 	Adjusted assignment:
 	-Have the user enter the 10 numbers only once
 	-Get the minimum and its index, report it, then the sort the list and show it.
 */

import java.util.Scanner;

public class c7e9_10_20Arrays {

	public static void main(String[] args) {
		System.out.println("This program will ask users to input 10 numbers and then displays the minimum and index of minimum and then sort the array. ");
		Scanner input = new Scanner(System.in);
		double[] num = new double[10];
		System.out.println("Please input 10 numbers separated by a space: ");
		for (int i = 0; i<10;i++) {
			num[i]=input.nextDouble();
		}
		System.out.print("The inputted numbers are:");
		for (int i = 0;i<num.length;i++) {
			System.out.print(" " + num[i]);
		}
		System.out.println();
		double minimum = min(num);
		int index = indexOfSmallestElement(num);
		double [] sortedNum = selectionSort(num);
		System.out.println("The minimum value is "+minimum);
		System.out.println("The index of the minimum value is " +index);
		System.out.print("The sorted numbers are:");
		for (int i = 0; i< sortedNum.length;i++) {
			System.out.print(" " + sortedNum[i]);
		}
	}

	private static double[] selectionSort(double[] num) {
		for (int i = num.length - 1; i >= 0; i--) {
			double maxVal = num[i];
			int maxIndex = i;

			for (int j = i - 1; j >= 0; j--) {
				if (maxVal < num[j]) {
					maxVal = num[j];
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				num[maxIndex] = num[i];
				num[i] = maxVal;
			}
		}
		return num;
	}
	
	private static int indexOfSmallestElement(double[] num) {
		double minVal = num[0];
		int minIndex = 0;
		for (int i =1; i<num.length;i++) {
			if(num[i]<minVal) {
				minVal=num[i];
				minIndex = i;
			}
		}
		return minIndex;
		
	}

	private static double min(double[] num) {
		double minVal = num[0];
		for (int i =1; i<num.length;i++) {
			if(num[i]<minVal) {
				minVal=num[i];
			}
		}
		return minVal;
	}

}
