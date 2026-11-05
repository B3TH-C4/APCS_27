/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		int age = (int) ((Math.random()*100) + 1);
		PooleDwarf d1 = new PooleDwarf(randName(), age);
		PooleDwarf d2 = new PooleDwarf(randName());
		PooleDwarf d3 = new PooleDwarf(randName(), age);
		PooleDwarf d4 = new PooleDwarf(randName());
		PooleDwarf d5 = new PooleDwarf(randName(), age);
		PooleDwarf d6 = new PooleDwarf(randName());
		PooleDwarf d7 = new PooleDwarf(randName(), age);
		int count = 0;
		String n1 = d1.getName();
		String n2 = d2.getName();
		String n3 = d3.getName();
		String n4 = d4.getName();
		String n5 = d5.getName();
		String n6 = d6.getName();
		String n7 = d1.getName();
		if(n1.equals(n2) == true ){
			count++;
		}
		else{
			count = count;
		}
		if(n2.equals(n3) == true){
			count++;
		}
		else{
			count = count;
		}
		if(n3.equals(n4) == true){
			count++;
		}
		else{
			count = count;
		}
		if(n4.equals(n5) == true){
			count++;
		}
		else{
			count = count;
		}
		if(n5.equals(n6) == true){
			count++;
		}
		else{
			count = count;
		}
		if(n6.equals(n7) == true){
			count++;
		}
		else{
			count = count;
		}
		if(n7.equals(n1) == true){
			count++;
		}
		else{
			count = count;
		}
		System.out.println("there are " + count + " duplicates of dwarf " + d1.getName());
		
		

		
		
	}
}
