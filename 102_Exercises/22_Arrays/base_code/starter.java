/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] run = new int[1000];
		 int count = 0;
		 run[count] = 0;
		 while(true){
			if(count == 1000){
				System.out.println(run[999]);
				break;
			}
			run[count] = (count + 1)*3;
			System.out.println(run[count]);
			count++;
			
		 }
		  System.out.println();   
		 System.out.println("then");
		 System.out.println();
		 int [] yes = new int[1000];
		 int counter =0;
		 int clount = 0;
		 yes[clount]=1000;
		 while (true){
			if (counter == 1000){
				System.out.println(yes[999]);					
				break;
			}
			System.out.println(yes[clount]);
			yes[clount]= yes[clount] - 1;
			clount++;
			counter++;
		 }
	}
}
