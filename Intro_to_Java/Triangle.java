/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 6 Question 11.1
 */

public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	String error = "";
	
	public Triangle() {
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}
	public Triangle(double side1, double side2, double side3) throws Exception,IllegalTriangleException{
		if (side1+side2<=side3 || side1+side3<=side2 || side2+side3<=side1) {
			error = "Error Detected: The sum of two sides is not greater than the third side.";
			IllegalTriangleException ex = new IllegalTriangleException(error);
			throw ex;
		}
		if( !isValidSides(side1, side2, side3)) {
			Exception e = new Exception(error);
            throw e;
		}
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	private boolean isValidSides(double side1, double side2, double side3) {
		if (side1<=0 || side2 <=0 || side3 <=0) {
			error = "Error Detected: Sides should be greater than 0. ";
			return false;
		}
		return true;
	}
	
	public double getSide1() {
		return this.side1;
	}
	public double getSide2() {
		return this.side2;
	}
	public double getSide3() {
		return this.side3;
	}
	
	public double getArea() {
		double s;
		s = (this.side1 + this.side2 + this.side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	
	public double getPerimeter() {
		return this.side1+this.side2+this.side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " +side1+" side2 = "+side2+" side3= "+side3;
	}
}
