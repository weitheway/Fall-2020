/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 6 Question 11.1/12.5
 */

public class IllegalTriangleException extends Exception {
	public IllegalTriangleException() {}
	public IllegalTriangleException(String message) {
		super(message);
	}
}
