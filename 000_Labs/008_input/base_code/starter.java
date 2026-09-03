/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name."); 
		String name = sc.nextLine();

		System.out.println("write your birth date."); 
		String day = sc.nextLine();

		System.out.println("write your age."); 
		int age = sc.nextInt();

		System.out.println("how much is a buck fifty."); 
		int fifty = sc.nextInt();
		

	}
}