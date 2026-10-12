/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name");
		String name = sc.nextLine();
		System.out.println("how many times do you want to print your name");
		int time = sc.nextInt();
		int x = 0;
		while(x != time){
			if (x == time){
				break;
			}
			System.out.println(name);
			x ++;
		}



		
	}
}
