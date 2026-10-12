/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = 900;
		while(true){
			System.out.println("guess the number out of 1000");
			int guess = sc.nextInt();
			if (guess != num){
				System.out.println("no that is not right try again");

			}
			else if ( guess == num){
				System.out.println("that is the correct answer!!!");
				break;
			}
		}




		
	}
}
