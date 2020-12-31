/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 4 Question 9.11/9.12
 */
public class LinearEquation {
	//Private data fields for a,b,c,d,e, and f
	private double a,b,c,d,e,f;
	//Constructor with the arguments above
	public LinearEquation(double a, double b, double c, double d, double e, double f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	//Constructor with the arguments from Exercise 12
	public LinearEquation(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
		this.a = (y1-y2);
		this.b = -(x1-x2);
		this.c = (y3-y4);
		this.d = -(x3-x4);
		this.e = (y1-y2)*x1 - (x1-x2) * y1;
		this.f = (y3-y4)*x3 - (x3-x4) * y3;
	}
	//Boolean method named isSolvable
	public boolean isSolvable(){
		if(a*d - b*c == 0)
			return false;
		return true;
	}
	//Six getter methods for a,b,c,d,e, and f
	public double getA(){
		return this.a;
	}
	public double getB(){
		return this.b;
	}
	public double getC(){
		return this.c;
	}
	public double getD(){
		return this.d;
	}
	public double getE(){
		return this.e;
	}
	public double getF(){
		return this.f;
	}
	//Methods getX() and getY() to return the solution for equation
	public double getX(){
		return (this.e*this.d - this.b*this.f)/(this.a*this.d-this.b*this.c);
	}
	public double getY(){
		return (this.a*this.f - this.e*this.c)/(this.a*this.d-this.b*this.c);
	}
}
