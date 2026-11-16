/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int z = (int)(Math.random()*(200-51) + 51);
		int [] e = new int[z];
		e[z-1] = (int)(Math.random()*(100-1) + 1);
		int min = Integer.MAX_VALUE;
		for(int c = 0; c < e.length; c++){
			if(e[c] < min){
				min = e[c];
			}
		}

		int max = Integer.MAX_VALUE;
		for(int c = 0; c < e.length; c++){
			if(e[c] > max){
				max = e[c];
			}
		}
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		int count = 0;
		for(int i = 0; i < e.length; i+=e[z-1]){
			if(i==e.length){
				count = (int) (i/=e[z-1]);
				break;
			}
		}
		System.out.println("average: " + count);
		System.out.println("# of elements: " + e.length);





		
	}
}
