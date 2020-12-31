/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 3 Question 5.16/5.20/6.10
 */


/*
 	Adjusted assignment:
 	-only the first 50, then 
 	-populate an array containing the prime numbers less than 1000
 	-in a repeat loop ask the user to enter one number at a time to 
 	 test if it is prime  by searching the array.  If not show its 
 	 factors.  
 */

import java.util.Scanner;

public class c5_6e16_20_10Prime {
	private static int[] primes;
	private static int MaxVal = 1000;
	
	public static void main(String[] args) {
		int loop = 1;
		System.out.println("This program will display the first 50 primes, "
				+ "allow users to input a number, outputs if the input number is "
				+ "a prime and if not, outputs the factors.");
		Scanner input = new Scanner(System.in);
		
		int NUMBER_PRIME_LESS_THAN_MaxVal=countPrime(MaxVal);
		
		genPrime(NUMBER_PRIME_LESS_THAN_MaxVal); 
		
		DisplayPrime(50);
		
		while (loop == 1) {
			System.out.println("\nEnter a number you want to check");
			int n = input.nextInt();
			checkArray(primes, n);
			System.out.println("\nEnter 1 to input a new number, 0 to quit.");
			loop = input.nextInt();
		}
		
	}
	
	//From textbook
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
	//Count prime less than 1000
	public static int countPrime(int num) {
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (isPrime(i)) {
				count += 1;
			}
		}
		System.out.println("There are "+count+" primes less than "+MaxVal);
		return count;
	}
	//Generate array containing primes less than 1000
	public static void genPrime(int arrLength) {
		primes = new int[arrLength];
		int count = 0;
		int num = 2;
		while (count <arrLength) {
			boolean isPrime = true;
			for (int divisor = 2; divisor <=num/2;divisor++) {
				if (num % divisor == 0) {
					isPrime=false;
					break;
				}
			}
			if (isPrime) {
				primes[count]=num;
				count++;
			}
			num++;
		}
	}
	//Displays the first 50 primes
	public static void DisplayPrime(int displaynum) {
		final int linenum = 10;
		int count = 0;
		int num = 2;
		System.out.println("The first 50 of them are:");
		while(count<displaynum) {
			boolean isPrime=true;
			for (int divisor = 2; divisor <=num/2;divisor++) {
				if (num % divisor == 0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				count++;
				if(count%linenum==0) {
					System.out.println(num);
				}
				else {
					System.out.print(num+" ");
				}
			}
			num++;
		}
	}
	//Display factors for non prime inputs
	public static void smallestFactors(int num) {
		if (num <= 0) {
			System.out.println("Error detected. Please make sure you input a value between 0 and 1000.");
		} else if (num == 1) {
			System.out.println("1");
		} else {
			int i = 2;
			while (num != 1) {
				if (num % i == 0) {
					System.out.print(i + " ");
					num /= i;
				} else {
					i++;
				}
			}
		}
	}
	//Array search for input value. If not found, display the factors 
	public static void checkArray(int[] array, int num) {
		if (num >= 1000) {
			System.out.println("Error detected. Please make sure you input a value between 0 and 1000.");
		} 
		else {
			int test = 1;
			for (int i = 0; i < array.length; i++) {
				for (int j : array) {
					if (j == num) {
						test = 2;
						break;
					}
				}
			}
			if (test == 2) {
				System.out.println(num + " is found in primes array. It is a prime number");
			}
			else {
				smallestFactors(num);
			}
		}
	}
	
}

