/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 8 - Check Multiple Sudoku Solutions
 */

import java.util.List;

public class BlankSudokuBoard{
	//Declaring variables to be used in program
	private int[][] grid;
	private List<Integer> list;
	private int index;
	
	//Initialize 9x9 Sudoku grid
	public BlankSudokuBoard() {
		this.grid = new int[9][9];
	}
	
	//Add values from list containing all numbers found in solution text file
	//Every 81 numbers = 1 Sudoku board
	public void addVal(List<Integer> list, int index){
		this.list = list;
		this.index = index;
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++) {
				this.grid[i][j] = list.get(this.index);
				this.index++;
			}
	}
	
	//Return the index of the start of the new solution grid 
	public int getIndex() {
		return this.index;
	}
	
	//Check if the current solution is valid or invalid 
	public boolean check() {
		if (isValid(this.grid))
			return true;
		else
			return false;
	}
	
	//These two methods were obtained from textbook pp 298 - 300
	
	//Check whether a solution is valid
	public static boolean isValid(int[][] grid) {
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid))
					return false;
		return true; 
	}	
	public static boolean isValid(int i, int j, int[][] grid) {	
		// Check whether grid[i][j] is unique in i's row
		for (int column = 0; column < 9; column++)
			if (column != j && grid[i][column] == grid[i][j])
				return false;
		// Check whether grid[i][j] is unique in j's column
		for (int row = 0; row < 9; row++)
			if (row != i && grid[row][j] == grid[i][j])
				return false;
		// Check whether grid[i][j] is unique in the 3-by-3 box
		for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
			for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
				if (row != i && col != j && grid[row][col] == grid[i][j])
					return false;
		return true;
	}
}
