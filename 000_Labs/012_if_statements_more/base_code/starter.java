/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pick an integer from 1 - 20");
		int one = sc.nextInt();
		System.out.println("pick another integer from the same range");
		int two = sc.nextInt();
		boolean yes = one == two;
		boolean no = one != two; 
		if (yes){
			System.out.println("yes they are equal");
			
		}

		if (no) { 
			System.out.println("no they are not equal");
		}
	}
}
