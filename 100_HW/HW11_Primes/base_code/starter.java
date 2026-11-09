/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a){
		int count = 2;
		int down = a;
		while (a!=0){
			count++;
			if(count ==a && down == 2){
				break;
			}
			if(a % (a-1) !=0){
				down--;
				return true;
			}
			else if (a % (a-1) == 0){
				down--;
				return false;
			}
			
		}
		return false;
	}
	public static void printPrime(int a){
		int count = 2;
		int yes = a;
		while (true){
			if (count == a){
				System.out.println(yes);
				break;
			}
			if(checkPrime(yes)==true){
				System.out.println(yes);
				yes--;
				
			}
			else if (checkPrime(yes) == false){
				yes = yes-1;
			}
			count++;
			
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("put in an integer");
		int eger = sc.nextInt();
		
		printPrime(eger);
	}
}
