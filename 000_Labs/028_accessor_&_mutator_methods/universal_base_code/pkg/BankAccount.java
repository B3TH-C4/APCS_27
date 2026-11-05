/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String name;
	int Num;
	double balan;
	boolean isActive;
	int nextAccNum;
	String open;


	// -------CONSTRUCTORS-------
	public BankAccount(){
		name = "unknown";
		Num = 0;
		balan = 0;
		isActive = true;
		
		
	}
	public BankAccount(String owner){
		name = owner;
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
		balan = balance;
		isActive = true;


	}
	public BankAccount(String owner, double balance){
		name = owner; 
		System.out.println(name);
		Num = 0;
		nextAccNum = (int) (Math.random()*(100-50) + 50);	 
		Num = nextAccNum;
		balan = balance;
		isActive = true;


	}
	

	// -------METHODS-------
	public String getOwner(){
		return name;
	}
	public void setOwner(String acc){
		name = acc;
		return;
	}
	public int getNum(){
		return Num;
	}
	public void setNum(int num){
		Num = num;
		return;
	}
	public double getBalance(){
		return balan;
	}
	public void setBalance(double a){
		balan = a;
		return;
	}
	public boolean getIsActive(){
		return isActive;
	}
	public void setIsActive(boolean a){
		if(a==false){
			isActive = a;
			return;
		}
		else if (a == true){
			isActive = a;
			return;
		}
		else {
			isActive = false;
			return;
		}
	}
	public String getOpen(){
		return open;
	}
	public void currentBalance(){
		System.out.println("Current Balance: $" + balan);
	}
	public void withdraw(double a){
		balan = balan - a;
		System.out.println("Balance: $" + balan);
	}
	public void deposit(double a){
		balan = balan + a;
		return;

	}
	public void checkBalance(){
		System.out.println("Balance: $" + balan);
	}
	public void closeAccount(){
		String close = "Account closed";
		System.out.println(close);
	}

	public void atm(double initial){
		double add = initial;
		balan = balan + initial;
		System.out.println("Name: " + name);
		System.out.println("Deposit: $" + add);
		System.out.println("Current Balance: $" + balan);

	}
	public void displayAccountInfo(){
		System.out.println("Account Owner: " + name);
		System.out.println("Balance: $" + balan);
		System.out.println("Active? - " + isActive);
		System.out.println("New Account Number: " + Num);
	}
}