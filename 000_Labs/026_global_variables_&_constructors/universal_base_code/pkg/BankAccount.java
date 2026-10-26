/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
private String name;
private int Num;
private double balan;
private boolean isActive;
private int nextAccNum;


	// -------CONSTRUCTORS-------
	public BankAccount(){
		name = "unknown";
		Num = 0;
		balan = 0;
		isActive = true;
		
		
	}
	public BankAccount(String owner){
		name = owner;
		System.out.println("Owner: " + name);
		nextAccNum = (int) (Math.random()*(100-50) + 50);	 
		Num = nextAccNum;
		isActive = true;
		balan = 0;
		
		
	}
	public BankAccount(String owner, int AccNum, double balance){
		name = owner; 
		System.out.println(name);
		Num = AccNum;
		nextAccNum = (int) (Math.random()*(100-50) + 50);	 
		Num = nextAccNum;
		System.out.println("new account number: " + Num);
		balan = balance;
		isActive = true;


	}

	// -------METHODS-------
	public void printAccount(){
		System.out.println("Account Owner: " + name);
		System.out.println("Balance: $" + balan);
		System.out.println("Active? - " + isActive);
		System.out.println("New Account Number: " + Num);
	}

}