/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void toString(String a){
		String tell = a;
		System.out.println(tell);
	

	}
	public static void toStringCombined(String a, String b){
		String combine = a + " " + b;
		System.out.println(combine);

	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("write something");
		String smth = scan.nextLine();
		toString(smth);
		System.out.println("_______________________");
		System.out.println("write something");
		String write = scan.nextLine();
		System.out.println("write something again");
		String again = scan.nextLine();
		toStringCombined(write, again);
	
	}
	
}
