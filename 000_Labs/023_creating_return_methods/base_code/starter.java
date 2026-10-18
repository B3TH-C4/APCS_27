/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void pow(int a, int b){

		int num = a;
		int crown = 0;
		while(crown < b){
			num = num * a;
			crown++;
		}
		System.out.println("its" + num);
		
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = scan.nextInt();
		System.out.println("enter another number");
		int num2 = scan.nextInt();
		System.out.println("we are going to find what " + num1 + " to the power of " + num2 + " is");
		System.out.println(" ");
		pow(num1, num2);









		
	}
}
