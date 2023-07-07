import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Initialize the Scanner and print a welcome message
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors,Lizard, Spock!");
        // Creating score variables
        int wins=0;
        int losses=0;
        //Use a while(true) loop and only break the loop if the user wants to quit or played 3 games
        int chances=3;
        while(chances>0) {

            //Get the user's move through user input
            System.out.print("What is your move? To make a move, enter rock, paper, scissors, lizard or spock. To quit the game, enter quit. ");
            String myMove = in.nextLine();

            //Check if the user wants to quit the game
            if(myMove.equals("quit")) {
                break;
            }

            //Check if the user's move is valid (rock, paper, or scissors)
            if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")&& !myMove.equals("lizard")&& !myMove.equals("spock")) {

                System.out.println("Your move isn't valid!");

            } else {

                //Get a random number in between 0 and 3 and convert it to an integer so that the possibilities are 0, 1, 2, 3, or 4
                int rand = (int)(Math.random()*5);

                //Convert the random number to a string using conditionals and print the opponent's move
                String opponentMove = "";
                if(rand == 0) {
                    opponentMove = "rock";
                } else if(rand == 1) {
                    opponentMove = "paper";
                } else if (rand ==2) {
                    opponentMove = "scissors";
                }else if (rand ==3) {
                    opponentMove = "lizard";
                }else {
                    opponentMove = "spock";}
                System.out.println("Opponent move: " + opponentMove);

                //Print the results of the game: tie, lose, win
                if(myMove.equals(opponentMove)) {
                    System.out.println("It's a tie!");
                } else if((myMove.equals("rock") && opponentMove.equals("scissors"))
                        || (myMove.equals("scissors") && opponentMove.equals("paper"))
                        || (myMove.equals("paper") && opponentMove.equals("rock"))
                        || (myMove.equals("rock") && opponentMove.equals("lizard"))
                        || (myMove.equals("lizard") && opponentMove.equals("spock"))
                        || (myMove.equals("spock") && opponentMove.equals("scissors"))
                        || (myMove.equals("scissors") && opponentMove.equals("lizard"))
                        || (myMove.equals("lizard") && opponentMove.equals("paper"))
                        || (myMove.equals("paper") && opponentMove.equals("spock"))
                        || (myMove.equals("spock") && opponentMove.equals("rock"))) {
                    System.out.println("You won!");
                    wins++;
                } else {
                    System.out.println("You lost!");
                    losses++;
                }

            }
            System.out.println("Yoy have won " + wins  + " games!");
            System.out.println("Yoy have lost " + losses  + " games!");
            chances=chances-1;

        }
        if (wins >losses) {
            System.out.println("You win more games than you lost!");
        } else if(losses>wins){
                System.out.println("You lost more games than you win!");
        }else {
            System.out.println("You have tie");
        }


        //Print a final message for the user
        System.out.println("Thanks for playing Rock, Paper, Scissors, Lizard, Spock!");

    }
}