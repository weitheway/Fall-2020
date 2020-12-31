/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 2 Question 4.3
 */

public class c4e3EstimateAreas {
	public static void main(String[] args) {
		System.out.println("This program will estimate the area enclosed by Atlanta, Orlando, Savannah, and Charlotte.");
		//This section is listing all the coordinates of the cities.
		//Atlanta,Georgia Coordinates as per Google: (33.7490° N, 84.3880° W)
		double x1 = 33.7490;
		double y1 = 84.3880;
		//Orlando, Florida Coordinates as per Google: (28.5383° N, 81.3792° W)
		double x2 = 28.5383;
		double y2 = 81.3792;
		//Savannah, Georgia Coordinates as per Google: (32.0809° N, 81.0912° W)
		double x3 = 32.0809;
		double y3 = 81.0912;
		//Charlotte, North Carolina Coordinates as per Google: (35.2271° N, 80.8431° W)
		double x4 = 35.2271;
		double y4 = 80.8431;
		System.out.println("Atlanta is located at "+x1+ "° N latitude and "+y1+ "° W longitude");
		System.out.println("Orlando is located at "+x2+ "° N latitude and "+y2+ "° W longitude");
		System.out.println("Savannah is located at "+x3+ "° N latitude and "+y3+ "° W longitude");
		System.out.println("Charlotte is located at "+x4+ "° N latitude and "+y4+ "° W longitude");
		
		//Note about the great circle distance formula
		System.out.println("The formula for great circle distance: d=radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1-y2))");
		System.out.println("Note: Use negative to indicate south and east");
		
		//This section is the triangle between Atlanta (x1,y1), Savannah (x3,y3), and Charlotte(x4,y4)
		//Side 1 = Atlanta to Charlotte, Side 2 = Charlotte to Savannah, Side 3 = Atlanta to Savannah
		double a2c = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x4)) + 
				   Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x4)) * 
				   Math.cos(Math.toRadians(y1)-Math.toRadians(y4))); 
		double c2s = 6371.01 * Math.acos(Math.sin(Math.toRadians(x4)) * Math.sin(Math.toRadians(x3)) + 
				   Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(x3)) * 
				   Math.cos(Math.toRadians(y4)-Math.toRadians(y3)));
		double a2s = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x3)) + 
				   Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x3)) * 
				   Math.cos(Math.toRadians(y1)-Math.toRadians(y3)));
		double s1 = (a2c+c2s+a2s)/2;
		double acs = Math.pow(s1*(s1-a2c)*(s1-c2s)*(s1-a2s), 0.5);
		
		//This section is the triangle between Atlanta (x1,y1), Savannah (x3,y3), and Orlando(x2,y2)
		//Side 1 = Atlanta to Savannah, Side 2 = Savannah to Orlando, Side 3 = Atlanta to Orlando
		double s2o = 6371.01 * Math.acos(Math.sin(Math.toRadians(x3)) * Math.sin(Math.toRadians(x2)) + 
				   Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(x2)) * 
				   Math.cos(Math.toRadians(y3)-Math.toRadians(y2)));
		double a2o = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + 
				   Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * 
				   Math.cos(Math.toRadians(y1)-Math.toRadians(y2)));
		double s2 = (a2s+s2o+a2o)/2;
		double aso = Math.pow(s2*(s2-a2s)*(s2-s2o)*(s2-a2o), 0.5);
		
		double total = acs + aso;
		
		System.out.println("The distance between Atlanta and Charlotte is "+a2c+" km.");
		System.out.println("The distance between Charlotte and Savannah is "+c2s+" km.");
		System.out.println("The distance between Atlanta to Savannah is "+a2s+" km.");
		System.out.println("The distance between Atlanta to Orlando is "+a2o+" km.");
		System.out.println("The distance between Savannah to Orlando is "+s2o+" km.");
		System.out.println("The area between Atlanta, Charlotte, and Savannah is: " + acs + " km^2");
		System.out.println("The area between Atlanta, Savannah, and Orlando is: " + aso + " km^2");
		System.out.println("The total area between Atlanta, Orlando, Savannah, and Charlotte is: " + total +" km^2");
	}

}
