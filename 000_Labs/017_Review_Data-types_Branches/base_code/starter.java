/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose a name for your character");
		String name = sc.nextLine();

		System.out.println("now choose a title for your character (ex: ___ the great)");
		String title = sc.nextLine();

		System.out.println("do you want to be a wizard,warrior,or rogue?");
		String role = sc.nextLine();
		if((role.equals("wizard")) || (role.equals("Wizard"))){
			System.out.println("your role is a wizard");
			System.out.println("now...you have 20 points to spend for you... choose 1-10 points for each trait");
			int point = 20;
			System.out.println("strength: ");
			int strength = sc.nextInt();
			point = point - strength;
			System.out.println("dexterity: ");
			int dexterity = sc.nextInt();
			point = point - dexterity;
			System.out.println("intelligence: ");
			int intell = sc.nextInt();
			point = point- intell;
			System.out.println("charisma: ");
			int chariz = sc.nextInt();
			point = point - chariz;
			if (point < 0){
				System.out.println("you have 0 points left");
			}
			else if (point > 0){
				System.out.println("you have " + point + " points left");
			}

	
		}
		else if((role.equals("Warrior")) || (role.equals("warrior"))){
			System.out.println("your role is a warrior");
						System.out.println("now... its stat time");
			int point2 = 20;
			System.out.println("strength: ");
			int strength2 = sc.nextInt();
			point2 = point2 - strength2;
			System.out.println("dexterity: ");
			int dexterity2 = sc.nextInt();
			point2 = point2 - dexterity2;
			System.out.println("intelligence: ");
			int intell2 = sc.nextInt();
			point2 = point2 - intell2;
			System.out.println("charisma: ");
			int chariz2 = sc.nextInt();
			point2 = point2 - chariz2;
			if (point2 < 0){
				System.out.println("you have 0 points left");
			}
			else if (point2 > 0){
				System.out.println("you have " + point2 + " points left");
			}
		}
		else if((role.equals("Rogue")) || (role.equals("rogue"))){
			System.out.println("your role is a rogue");
						System.out.println("now... its stat time");
			int point3 = 20;
			System.out.println("strength: ");
			int strength3 = sc.nextInt();
			point3 = point3 - strength3;
			System.out.println("dexterity: ");
			int dexterity3 = sc.nextInt();
			point3 = point3 - dexterity3;
			System.out.println("intelligence: ");
			int intell33 = sc.nextInt();
			point3 = point3- intell33;
			System.out.println("charisma: ");
			int chariz3 = sc.nextInt();
			point3 = point3 - chariz3;
			if (point3 < 0){
				System.out.println("you have 0 points left");
			}
			else if (point3 > 0){
				System.out.println("you have " + point3 + " points left");
			}		
		}
		else { 
			System.out.println("that's not an option you chud.");
		}
	}
}
