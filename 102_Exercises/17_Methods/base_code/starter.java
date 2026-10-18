/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.
	public static boolean isLeapYear(int y){
		int yea = (y%4);
		int ye = (y%400);
		boolean leap = yea == 0 || ye == 0;
		boolean notLeap = yea != 0 && ye !=0;
		return leap;

		
	}
	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.
	public static int getDigitSum(int a){
		int fifth = a/10;
		int fourth = fifth%10;
		int third = fourth/10;
		int digit = fifth + fourth + third;
		return digit;

		

		
	}
	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	public static void printIfConsecutive(int a, int b, int c){
		int one = a + 1;
		int yes = b;
		int two = b +1;
		int three = c;
		boolean minus = c - 1 == two;
		booolean sub = b - 1 == 
		boolean con1 = one == b;
		boolean con2 = two == three;
		int ay = a;
		int by = b;
		int cy = c;
		if (con1 && con2){
			System.out.println("they are consecutive");
		}
		else{
			System.out.println("they are not consecutive");
		}


	}
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
