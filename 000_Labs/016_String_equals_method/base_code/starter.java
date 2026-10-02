/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("do you want to be a wizard,warrior,or rogue?");
		String role = sc.nextLine();
		if((role.equals("wizard")) || (role.equals("Wizard"))){
			System.out.println("your role is a wizard");
		}
		else if((role.equals("Warrior")) || (role.equals("warrior"))){
			System.out.println("your role is a warrior");

		}
		else if((role.equals("Rogue")) || (role.equals("rogue"))){
			System.out.println("your role is a rogue");
		}
		else { 
			System.out.println("buddy that's not an option you chud.");
		}
	}
}
