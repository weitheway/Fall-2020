/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 8 - Check Multiple Sudoku Solutions
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckSudoku {
	public static void main(String[] args) {
		System.out.println("This program will take Sudoku solutions from a text file and "
				+ "\ncheck if the solutions are valid or invalid Sudoku solutions. "
				+ "\nRequired format: Each solution have 9 rows of numbers separated by spaces "
				+ "\nwith a blank line separating each solution except for the last solution. "
				+ "\nThere should not be any blank lines after the last row of the last solution.\n");
		
		//Declaring variables to be used in program
		int value;
		int index=0;
		int NUM_OF_SOL;
		List<Integer> list = new ArrayList<Integer>();
		
		try {
			//Read in text file with Sudoku solutions
			File file = new File("SudokuSolutions.txt");
			Scanner input = new Scanner(file);
			
			//Parse through text file and add all numbers to a list
			//This will help determine how many solutions are in text file
			while(input.hasNextLine()) {
				value = input.nextInt();
			    list.add(value);
			}
			
			NUM_OF_SOL = list.size()/81;
			System.out.println("There are "+NUM_OF_SOL+" Sudoku solutions in this file.");
			
			//Create however many blank Sudoku grids as necessary from input file
			BlankSudokuBoard grid[] = new BlankSudokuBoard[NUM_OF_SOL];
			for (int i = 0; i < NUM_OF_SOL; i++) {
				grid[i] = new BlankSudokuBoard();
			}
			
			//Fill each board with corresponding values from text file 
			for (int i=0; i<NUM_OF_SOL; i++) {
				grid[i].addVal(list,index);
				index = grid[i].getIndex();
			}
			
			//Check whether each board is valid or not valid and
			for (int i=0; i<NUM_OF_SOL; i++) {
				if (grid[i].check()) {
					System.out.println("Solution " + (i+1) + " is a valid solution");
				}
				else{
					System.out.println("Solution " + (i+1) + " is an invalid solution");
				};
			}
		} catch (Exception e) {
			System.out.println("Error Detected: Input file not following proper formatting.");
		}

	}
}
