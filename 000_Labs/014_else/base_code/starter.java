/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int bruh = 80;
		System.out.println("guess a number from 1 - 1000");
		int yes = sc.nextInt();
		if (yes == bruh){
			System.out.println("that's the correct answer!!!");
		}
		else {
			System.out.println("no you chud the answer was 80");
		}
	}
}
