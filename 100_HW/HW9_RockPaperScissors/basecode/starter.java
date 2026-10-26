/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;
class starter {
    public static String getObject(){
        int role = (int) ((Math.random()*3) + 1);
        if (role == 1){
            String Role = "rock";
            return Role;
        }
        else if (role == 2){
            String Role2 = "paper";
            return Role2;
        }
        else if (role == 3){
            String Role3 = "scizzors";
            return Role3;
        }
        else {
            String role1 = "invalid";
            return role1;
        }
    }
    public static void compareTo(String anser){
        String Comput = getObject();
        System.out.println("computer's answer: " + Comput);
        String user = anser;
        int winner;
        if((user.equals("rock") && Comput.equals("scizzors")) || (user.equals("paper") && Comput.equals("rock")) || (user.equals("scizzors") && Comput.equals("paper"))){
            winner = 1;
            System.out.println("the winner is..." + winner + "!!");
        }
        else if((user.equals("rock") && Comput.equals("rock")) || (user.equals("paper") && Comput.equals("paper")) || (user.equals("scizzors") && Comput.equals("scizzors"))){
            winner = 0;
            System.out.println("the winner is..." + winner + "!! oh wait... its a tie");
        }
        else if((Comput.equals("rock") && user.equals("scizzors")) || (Comput.equals("paper") && user.equals("rock")) || (Comput.equals("scizzors") && user.equals("paper"))){
            winner = 2;
            System.out.println("the winner is..." + winner + "!!");
        }
        
        



    }
    public static void compareComput(){
        String player1 = getObject();
        System.out.println("player1: " + player1);
        String player2 = getObject();
        System.out.println("player2: " + player2);
        int winner;
        if((player1.equals("rock") && player2.equals("scizzors")) || (player1.equals("paper") && player2.equals("rock")) || (player1.equals("scizzors") && player2.equals("paper"))){
            winner = 1;
            System.out.println("the winner is player..." + winner + "!!");
        }
        else if((player1.equals("rock") && player2.equals("rock")) || (player1.equals("paper") && player2.equals("paper")) || (player1.equals("scizzors") && player2.equals("scizzors"))){
            winner = 0;
            System.out.println("the winner is player..." + winner + "!! oh wait... its a tie");
        }
        else if((player2.equals("rock") && player1.equals("scizzors")) || (player2.equals("paper") && player1.equals("rock")) || (player2.equals("scizzors") && player1.equals("paper"))){
            winner = 2;
            System.out.println("the winner is player..." + winner + "!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("would you like to play rock, paper, scizzors? (yes/no/done)");
            String answer = sc.nextLine();
            if (answer.equals("yes") || answer.equals("Yes") || answer.equals("y") || answer.equals("Y")){
                System.out.println("you are player 1 and the computer is player 2");
                System.out.println("ok... 3....2... 1.... rock paper scizzors shoot! (type in your move)");
                String shoot = sc.nextLine();
                System.out.println("...");
                compareTo(shoot);

            }
            else if (answer.equals("no") || answer.equals("No") || answer.equals("n") || answer.equals("N")){
                System.out.println("how many times should the computer play itself?");
                int times = sc.nextInt();
                int count = 0;
                int play = 1;
                while(count!=times){
                    System.out.println("--------------");
                    System.out.println("play #" + play);
                    compareComput();
                    System.out.println("----------------");
                    count++;
                    play++;

                }
            }
            else if(answer.equals("done")){
                System.out.println("ok thanks for playing!");
                break;
            }

        }
    }
}
