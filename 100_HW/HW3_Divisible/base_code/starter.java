/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose a number");
		int one = sc.nextInt();
		System.out.println("choose another number");
		int two = sc.nextInt();
		if (one % 2 == 0){
			System.out.println(one + " is an even number");
		}
		else {
			System.out.println(one + " is an odd number");
		}
		
		if(two % 2 == 0){
			System.out.println(two + " is an even number");
		}
		else {
			System.out.println(two + " is an odd number");
		}

		if (one % 3 == 0 && one % 4 == 0 && one % 5 == 0){
			System.out.println(one + " and " + two + " are divisible by 3, 4, and 5");
		}
		else {
			System.out.println(one + " and " + two + "are not divisible by 3, 4, and 5");
		}
	}
}
