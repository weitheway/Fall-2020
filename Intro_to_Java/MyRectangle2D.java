/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 6 Question 10.13
 */

public class MyRectangle2D extends GeometricObject {
	private double x;
	private double y;
	private double width;
	private double height;
	String error = "";
	
	public MyRectangle2D() {
		this.x = 0;
		this.y = 0;
		this.width =1;
		this.height=1;
	}
	
	public MyRectangle2D(double x, double y, double width, double height) throws Exception {
		this.x = x;
		this.y = y;
		if( !isValidDim(width, height)) {
			Exception e = new Exception(error);
            throw e;
		}
		this.width=width;
		this.height=height;
	}
	
	private boolean isValidDim(double width, double height) {
		if (width<=0 || height <=0 ) {
			error = "Error Detected: Width/Height should be greater than 0. ";
			return false;
		}
		return true;
	}

	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * height + 2 * width;
	}
	
	public boolean contains(double x, double y) {
		return Math.abs(x - this.x) <= width / 2 && Math.abs(y - this.y) <= height / 2;
	}
	
	public boolean contains(MyRectangle2D r) {
		return contains(r.x - r.width / 2, r.y + r.height / 2) &&
			   contains(r.x - r.width / 2, r.y - r.height / 2) &&
			   contains(r.x + r.width / 2, r.y + r.height / 2) &&
			   contains(r.x + r.width / 2, r.y - r.height / 2);
	}
	
	public boolean overlaps(MyRectangle2D r) {
		return (Math.abs(r.x-x) < (r.width+width)/2 && Math.abs(r.y-y) < (r.height+height)/2);
	}
	public boolean abut(MyRectangle2D r){
		if ((Math.abs(r.x-x)==r.width/2+width/2 || Math.abs(r.y-y)==r.height/2+height/2 ) && !this.overlaps(r)) {
			return true;
		}
		return false;
	}
	public boolean distinct(MyRectangle2D r) {
		if (this.contains(r) || this.overlaps(r)||this.abut(r)) {
			return false;
		}
		else {
			return true;
		}
	}
	public String toString() {
		return "X-Coordinate: " + this.x + " Y-Coordinate: " +this.y+" width: "+this.width+" height: "+height;
	}
}
