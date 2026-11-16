/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] ran = new int[1000];
		for(int c = 0; c != 999; c++){
			ran[c] = (int) (Math.random()*(1000-1) + 1);
			System.out.println(ran[c]);
		}


		
	}
}
