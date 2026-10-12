/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("hello would you like to gamble");
		String yes = sc.nextLine();
		int mon = 100;
		if (yes.equals("yes") || yes.equals("Yes") || yes.equals("y") || yes.equals("Y")){
			while(true){
				System.out.println("wonderful! you currently have $" + mon);
				System.out.println("how much would you like to bid");
				int bid = sc.nextInt();
				sc.nextLine();
				int one = (int) (Math.random()*(10-1)+1);
				int two = (int) (Math.random()*(10-1)+1);
				int three = (int) (Math.random()*(10-1)+1);
				System.out.println("================");
				System.out.println("| " + one + " | " + two + " | " + three + " |");
				System.out.println("================");
				if (one == two || one == three){
					System.out.println("congrats! you've doubled your money!!");
					bid = bid*2;
					mon = mon + bid;
					System.out.println("would you like to play again?");
					String yes1 = sc.nextLine();
					if(yes1.equals("yes") || yes1.equals("Yes") || yes1.equals("Y") || yes1.equals("y")){
						System.out.println("");
					}
					else if(yes1.equals("no") || yes1.equals("No") || yes1.equals("N") || yes1.equals("n")){
						System.out.println("ok...i mean.. if that's what you want :(");
						break;
					}
					else{
						System.out.println("that's not an option bud");
						break;
					}
					
				}
				else if(one == two && one == three){
					System.out.println("congratulations!!! you hit the jackpot!!! you've tripled your money!");
					bid = bid*3;
					mon = mon + bid;
					System.out.println("would you like to play again");
					String yes2 = sc.nextLine();
					if(yes2.equals("yes") || yes2.equals("Yes") || yes2.equals("Y") || yes2.equals("y")){
						System.out.println("");
					}
					else if(yes2.equals("no") || yes2.equals("No") || yes2.equals("N") || yes2.equals("n")){
						System.out.println("ok...i mean.. if that's what you want :(");
						break;
					}
					else{
						System.out.println("that's not an option bud");
						break;
					}
				}
				else {
					System.out.println("aw shucks...");
					bid = bid - bid;
					System.out.println("would you like to play again");
					String yes3 = sc.nextLine();
					if(yes3.equals("yes") || yes3.equals("Yes") || yes3.equals("Y") || yes3.equals("y")){
						System.out.println("");
					}
					else if(yes3.equals("no") || yes3.equals("No") || yes3.equals("N") || yes3.equals("n")){
						System.out.println("ok...i mean.. if that's what you want :(");
						break;
					}
					else{
						System.out.println("that's not an option bud");
						break;
					}
					

				}


			}
		}
		else {
			System.out.println("thats not an option bud");
		}

	}

}
