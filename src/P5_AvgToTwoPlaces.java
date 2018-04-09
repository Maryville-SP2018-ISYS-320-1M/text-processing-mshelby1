/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 4/8/2018
*/

import java.util.Scanner;

public class P5_AvgToTwoPlaces {

	public static void main(String[] args) {
		int AmountofVariables = 3;
		int x = 2;
		int y = 2;
		int z = 3;
		double sum = x + y + z;
		
		
		System.out.println("This program computes the average of a series of numbers.");
		System.out.println("How many numbers will you enter? " + AmountofVariables);
		System.out.println("Enter number 1: " + x);
		System.out.println("Enter number 2: " + y);
		System.out.println("Enter number 3: " + z);		
		System.out.printf("The average value is: %.2f", sum / AmountofVariables);
	}

}
