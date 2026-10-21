/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	
	public static void main(String args[]) { //first version
		Scanner sc = new Scanner(System.in);
		while (true){
			System.out.println("put in a message");
			String message = sc.nextLine();
			System.out.println(" does this require a key?");
			String ans = sc.nextLine();
			if (ans.equals("yes")){
				System.out.println("do you know what the key is");
				String know = sc.nextLine();
				if (know.equals("yes")){
					System.out.println(" what is the key");
					int key = sc.nextInt();
					sc.nextLine();
					String deciphe = Cipher.keyedEncode(message, key);
					System.out.println(deciphe);
				}
				else if(know.equals("no")){
					int count = 0;
					while (count != 37){
						String deciphe = Cipher.keyedEncode(message, count);
						System.out.println(deciphe);
						count ++;
					}
					
				}
				
			}
			else if (ans.equals("no")){
				String deciph = Cipher.encode(message);
				System.out.println(deciph);
			}
			else {
				System.out.println(" that doesnt work");
			}
			
		}


		

	}
	
}

