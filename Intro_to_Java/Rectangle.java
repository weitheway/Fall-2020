/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 4 Question 9.1
 */

public class Rectangle {
	//Two double data fields named width and height and error message
	double width;
	double height;
	String error = "";
	//No-arg constructor that creates default rectangle of 1x1
	public Rectangle() {
		this.height = 1;
		this.width = 1;
	}
	//Constructor that creates a rectangle with given width/height
	public Rectangle(double width, double height) throws Exception{
		if( !isValidRect(width, height)) {
			Exception e = new Exception(error);
            throw e;
		}
		this.width = width;
		this.height = height;
	}
	//Error handling from chapter 12
	private boolean isValidRect(double width, double height) {
		if (width<=0 || height <=0 ) {
			error = "Error Detected: Width/Height should be greater than 0. ";
			return false;
		}
		return true;
	}
	//Method named getArea()
	public double getArea() {
		return width * height;
	}
	//Method named getPerimeter()
	public double getPerimeter() {
		return 2 * height + 2 * width;
	}
	//Method to display Width
	public double getWidth() {
		return this.width;
	}
	//Method to display Height
	public double getHeight() {
		return this.height;
	}
	
}
