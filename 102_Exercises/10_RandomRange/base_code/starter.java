/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pick an integer: ");
		int one = sc.nextInt();
		System.out.println("pick another integer");
		int two = sc.nextInt();
		System.out.println("here is are four random numbers between these two integers:");
		System.out.println(((int)((Math.random()*(two-one)+one)))+ ", " + ((int)((Math.random()*(two-one)+one))  + ", " + ((int)((Math.random()*(two-one)+one)))  + ", " + ((int)((Math.random()*(two-one)+one)))));

	}
}
