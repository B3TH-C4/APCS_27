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
		int [] size = new int[10];
		size[0] = 3;
		size[1] = 5;
		size[2] = 8;
		size[3] = 7;
		size[4] = 4;
		size[5] = 6;
		size[6] = 2;
		size[7] = 9;
		size[8] = 1;
		size[9] = 0;
		
		while(true){
			if(count == 9){
				System.out.println(size[9]);
			}
			System.out.println(size[count]);
			count++;
		}

		
	}
}
