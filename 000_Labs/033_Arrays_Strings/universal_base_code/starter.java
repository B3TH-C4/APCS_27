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
		String [] lyrics = new String[10];
		lyrics[0] = "A duck walked up to a lemonade stand And he said to the man, runnin the stand";
		lyrics[1] = "Hey...BOM BOM BOM";
		lyrics[2] = "got any grapes";
		lyrics[3] = "the man said 'no we just sell lemonade.";
		lyrics[4] = "Its cold its fresh and its all homemade, would you like to give it a try?'";
		lyrics[5] = "The duck said, Goodbye";
		lyrics[6] = "then he waddled away (waddle waddle waddle)";
		lyrics[7] = "then he waddled away (waddle waddle waddle)";
		lyrics[8] = "then he waddled away (waddle waddle waddle)";
		lyrics[9] = "till the very next day bom bom bom bom bada dum";

		while(true){
			if(count == 9){
				System.out.println(lyrics[9]);
				break;
			}
			System.out.println(lyrics[count]);
			count++;
		}


		
	}
}
