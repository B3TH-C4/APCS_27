/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int nine = (int) (Math.random()*9);
		int hund = (int) ((Math.random()*100)+ 1);
		double point = ((Math.random()*3.5) + 2.5);
		double one = ((Math.random()*589)+14);
		
		System.out.println(nine);
		System.out.println(hund);
		System.out.println(point);
		System.out.println(one);
	}
}
