/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog a = new Dog("Gary");
		a.setAge(5);

		Dog b = new Dog("Blobby", "Golden Retriever");

		if (a.isSleep() == true){
			System.out.println(a.getName() + " is sleeping");
		}
		else if (a.isSleep() == false){ 
			a.bark();
		}

		System.out.println();

		if (b.isSleep() == true && a.isSleep() == false){
			a.bark();
			b.bark();
		}
		else if(b.isSleep() == false && a.isSleep() == false){
			a.bark();
			b.bark();
		}
		else {
			System.out.println();
		}
		



	}
}
