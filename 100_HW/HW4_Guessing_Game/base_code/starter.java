/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the Word!");
		String pet = "dog ";
		boolean yes = true;
		System.out.println("hint: a type of pet");
		String answer1 = sc.nextLine();
		
		if (answer1==pet){
			System.out.println("That is correct!!!");
		}
		else { 
			System.out.println("that unfortunately is incorrect :(");
			System.out.println("heres a second hint: a man's best friend");
			String answer2 = sc.nextLine();
			if (answer2==pet){
				System.out.println("yayyyyy that's the answer!!!");
			}
			else {
				System.out.println("You chud the correct answer was dog");
				System.out.println("LOCK IN");
			}
		}
		

	}
}
