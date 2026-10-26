/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount x = new BankAccount();
		x.printAccount();
		System.out.println();

		BankAccount w = new BankAccount("Yuko Boredom");
		w.printAccount();
		System.out.println();

		BankAccount v = new BankAccount("Mayoyama", 35, 1200);
		v.currentBalance();
		v.atm(67);
		v.printAccount();
		System.out.println();

		BankAccount u = new BankAccount("dihhwood", 67, 0);
		u.currentBalance();
		u.atm(1);
		u.printAccount();
		System.out.println();
	}
}
