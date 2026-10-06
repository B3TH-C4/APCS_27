/*
 *	Author:
 *  Date:
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
        Scanner ble = new Scanner(System.in);
        System.out.println("welcom! do you want to play a scavenger hunt? ye/no answer");
        String yes = ble.nextLine();
        if (yes.equals("yes") || yes.equals("Yes") || yes.equals("y") || yes.equals("Y")){
            System.out.println("wonderful!!! your goal is to find the magic word. each question you get right gifts you a letter to find the magic word!!!here's your first question what is 8 x 5?");
            int forty = ble.nextInt();
            ble.nextLine();
            if (forty == 40){
                System.out.println("that is correct!!! the first letter you get is P");
                System.out.println("next question... what planet is closest to the sun?");
                String merc = ble.nextLine();
                if (merc.equals("mercury") || merc.equals("Mercury")){
                    System.out.println("that is correct!!! your next letter is O");
                    System.out.println("heres your next question... what kind of food has layers of bread, tomato sauce, cheese, and is cooked in a circular shape? ");
                    String pizza = ble.nextLine();
                    if (pizza.equals("Pizza") || pizza.equals("pizza")){
                        System.out.println("that is correct!!! yout third letter is T");
                        System.out.println("question #4: X = 8 x 4. solve for X");
                        int threto = ble.nextInt();
                        if (threto == 32){
                            System.out.println("correct!! the next letter is A");
                            System.out.println("next question: 8x + 10y = 4x - 3y. solve for x when y = 4");
                            int teen = ble.nextInt();
                            if (teen == 13){
                                System.out.println("CORRECT!!! the letter you get is T");
                                System.out.println("your next question... how many protons does oxygen have (if you don't know you can look at a periodic table i also suck at the periodic table)");
                                int eigh = ble.nextInt();
                                ble.nextLine();
                                if(eigh == 8){
                                    System.out.println("that is correct!!! your final and last letter is O");
                                    System.out.println("and now...the magic word....");
                                    System.out.println("POTATO!!!!!");

                                }
                                else {
                                    System.out.println("this is the wrong answer");
                                }

                            }
                            else {
                                System.out.println("this answer is wrong");
                            }
                        }
                        else{
                            System.out.println("this is wrong");
                        }
                    }
                    else{
                        System.out.println("that is wrong");
                    }
                }
                else{
                    System.out.println("that is the wrong answer");
                }
                        
            }
            else {
                System.out.println("that is incorrect");
            }
                    
        }
        else{
            System.out.println("welp... :(");
        }
    }
           
}
        
    

