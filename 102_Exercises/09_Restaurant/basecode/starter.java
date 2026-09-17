/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome...");
		System.out.println("what is the name of this restaraunt?");
		String name = sc.nextLine();
		System.out.println();

		System.out.println("who is the owner?");
		String owner = sc.nextLine();
		System.out.println();

		System.out.println("welcome " + owner + "! Time to make your menu.");
		System.out.println("what will be the first item?");
		String first = sc.nextLine();
		System.out.println("how much will it cost?");
		double cost1 = sc.nextDouble();
		System.out.println("how much do you want");
		double much1 = sc.nextDouble();
		String skip = sc.nextLine();

		System.out.println("moving on to the second item. what will be it's name?");
		String two = sc.nextLine();
		System.out.println("how much will it cost?");
		double cost2 = sc.nextDouble();
		System.out.println("how much dou you want");
		double much2 = sc.nextDouble();
		skip = sc.nextLine();

		System.out.println("what will be the third item?");
		String third = sc.nextLine();
		System.out.println("how much will it cost?");
		double cost3 = sc.nextDouble();
		System.out.println("how much do you want?");
		double much3 = sc.nextDouble();
		skip = sc.nextLine();

		System.out.println("and how much do you want to tip?");
		double tip = sc.nextDouble();

		double subtotal = cost1 + cost2 + cost3;
		double total = subtotal * tip;
		
		System.out.println("recipt:");
		System.out.println("///////////////////////////////////////");
		System.out.println("         eating at " + name);
		System.out.println("owner: " + owner);
		System.out.println("///////////////////////////////////////");
		System.out.println("  item        qty           cost   ");
		System.out.println("///////////////////////////////////////");
		System.out.println(first + "           " + much1 + "              " + cost1);
		System.out.println(two  +  "           " + much2 + "              " + cost2);
		System.out.println(third + "           " + much3 + "              " + cost3);
		System.out.println("///////////////////////////////////////");
		System.out.println("subtotal:     " + (cost1 + cost2 + cost3));
		System.out.println("Tip:          "  + tip);
		System.out.println("Tip Amount:   " + (tip *  subtotal));
		System.out.println("Total cost:   $"  + total);
		System.out.println("///////////////////////////////////////");



		
	}
}
