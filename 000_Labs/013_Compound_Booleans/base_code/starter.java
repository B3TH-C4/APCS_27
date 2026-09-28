/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose a number");
		int one = sc.nextInt();
		System.out.println("choose another number");
		int two = sc.nextInt();
		System.out.println("choose a final third number");
		int three = sc.nextInt();

		if (one < two && one < three){
			System.out.println(one + " is the smallest integer");
		}
		if (two < one && two < three){
			System.out.println(two + " is the smallest integer");
		}
		if (three < one && three < two){
			System.out.println(three + " is the smallest integer");
		
		}
		if (one > two && one > three){
			System.out.println(one + " is the greatest integer");
		}
		if (two > one && two > three){
			System.out.println(two + " is the greates integer");
		}
		if (three > one && three > two){
			System.out.println(three + " is the greatest integer");
		}
	}
}
