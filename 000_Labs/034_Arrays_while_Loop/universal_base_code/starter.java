/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int count = 0;
		int [] rand = new int[1000];
		
		while(true){
			if(count == 999){
				System.out.println(rand[count]);
			}
			rand[count] = (int) (Math.random()*(1000 - 1) + 1);
			System.out.println(rand[count]);
			count++;
			
		}


		
	}
}
