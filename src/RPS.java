import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        String player1Move = "";
        String player2Move = "";
        int playerOneWins = 0;
        int player2Wins = 0;


        System.out.println("Welcome to Rock, Paper, and Scissors!");

        // for loop

        while (true) {
            do{ System.out.print("Player 1: Please choose (R)ock, (P)aper, or (S)cissors. --> ");
            player1Move = scanner.nextLine(); }
            while (!(player1Move.equals("R") || player1Move.equals("P") || player1Move.equals("S")));

            do{ System.out.print("Player 2: Please choose (R)ock, (P)aper, or (S)cissors. --> ");
            player2Move = scanner.nextLine(); }
            while (!(player2Move.equals("R") || player2Move.equals("P") || player2Move.equals("S")));



            // who is the winner?
            if(player1Move.equals("R") && player2Move.equals("S"))
            {
                System.out.println("Rock beats Scissors: Player 1 Wins!");
                playerOneWins++;
            }

            else if(player1Move.equals("P") && player2Move.equals("R"))
            {
                System.out.println("Paper covers Rock: Player 1 Wins!");
                playerOneWins++;
            }

            else if(player1Move.equals("S") && player2Move.equals("P"))
            {
                System.out.println("Scissors cuts Paper: Player 1 Wins!");
                playerOneWins++;
            }

            else if(player1Move.equals("S") && player2Move.equals("R"))
            {
                System.out.println("Rock beats Scissors: Player 2 Wins!");
                player2Wins++;
            }

            else if(player1Move.equals("R") && player2Move.equals("P"))
            {
                System.out.println("Paper covers Rock: Player 2 Wins!");
                player2Wins++;
            }

            else if(player1Move.equals("P") && player2Move.equals("S"))
            {
                System.out.println("Scissors cuts Paper: Player 2 Wins!");
                player2Wins++;
            }

            else if(player1Move.equals(player2Move))
            {
                System.out.println("Tie!");
            }
            System.out.println("Play again? [Y/N]");
            String playAgain = scanner.nextLine();

            if(!playAgain.equals("Y")) {
                break;
            }
            // for loop ends

        }


        }
    }


