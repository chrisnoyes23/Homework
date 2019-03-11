import java.util.Scanner;
import java.util.Random;
    public class rockps
    {
        public static void main(String[] args)
        {   
            printInstructions();
            String playAgain;
            do
            {   
                System.out.println("Rock, paper, or scissors?\n");

                Scanner kb = new Scanner(System.in);

                String input;
                int rps;

                input = getInput();
                rps = getReply();

                decideWinner(input, rps);

                System.out.println("Would you like to play again?");
                playAgain = kb.nextLine();
            } while (playAgain.equals("yes"));
        }

        static void printInstructions()
        {
            System.out.println(" ______    _______  _______  ___   _    _______  _______  _______  _______  ______      _______  _______  ___   _______  _______  _______  ______    _______ ");
            System.out.println("|    _ |  |       ||       ||   | | |  |       ||   _   ||       ||       ||    _ |    |       ||       ||   | |       ||       ||       ||    _ |  |       |");
            System.out.println("|   | ||  |   _   ||       ||   |_| |  |    _  ||  |_|  ||    _  ||    ___||   | ||    |  _____||       ||   | |  _____||  _____||   _   ||   | ||  |  _____|");
            System.out.println("|   |_||_ |  | |  ||       ||      _|  |   |_| ||       ||   |_| ||   |___ |   |_||_   | |_____ |       ||   | | |_____ | |_____ |  | |  ||   |_||_ | |_____ ");
            System.out.println("|    __  ||  |_|  ||      _||     |_   |    ___||       ||    ___||    ___||    __  |  |_____  ||      _||   | |_____  ||_____  ||  |_|  ||    __  ||_____  |");
            System.out.println("|   |  | ||       ||     |_ |    _  |  |   |    |   _   ||   |    |   |___ |   |  | |   _____| ||     |_ |   |  _____| | _____| ||       ||   |  | | _____| |");
            System.out.println("|___|  |_||_______||_______||___| |_|  |___|    |__| |__||___|    |_______||___|  |_|  |_______||_______||___| |_______||_______||_______||___|  |_||_______|");
            System.out.println("_____________________________________________________________________________________________________________________________________________________________");
            System.out.println();
            System.out.println("_____________________________________________________________________________________________________________________________________________________________");
            System.out.println("                                        This is Rock Paper Scissors. Type rock, paper, or scissors and see if you win!");
        }

        static String getInput()
        {
            Scanner kb = new Scanner(System.in);
            String input;
            
            input = kb.nextLine();

            if(input.equals("rock") || input.equals("paper") || input.equals("scissors"))
            {
                System.out.printf("\nSo, you decided to play %s? \n \n", input);
            }
            else
            {
                System.out.println("Please enter a valid answer next time.");
            }
            return input;
        }

        static int getReply()
        {
            int[] randomAns = {1, 2, 3};

            Random rand = new Random();

            int rps;
            rps = randomAns[rand.nextInt(randomAns.length)];
            if(rps == 1)
            {
                System.out.println("The computer played rock! \n");
            }
            else if(rps == 2)
            {
                System.out.println("The computer played paper! \n");
            }
            else if(rps == 3)
            {
                System.out.println("The computer played scissors! \n");
            }
            return rps;
        }

        static void decideWinner(String input, int rps)
        {
            if(input.equals("rock") && rps == 2)
            {
                System.out.println("You lose!");
            }
            else if(input.equals("paper") && rps == 3)
            {
                System.out.println("You lose!");
            }
            else if(input.equals("scissors") && rps == 1)
            {
                System.out.println("You lose!");
            }
            else if(input.equals("rock") && rps == 3)
            {
                System.out.println("You win!");
            }
            else if(input.equals("paper") && rps == 1)
            {
                System.out.println("You win!");
            }
            else if(input.equals("scissors") && rps == 2)
            {
                System.out.println("You win!");
            }
            else if(input.equals("rock") && rps == 1)
            {
                System.out.println("It's a draw!");
            }
            else if(input.equals("paper") && rps == 2)
            {
                System.out.println("It's a draw!");
            }
            else if(input.equals("scissors") && rps == 3)
            {
                System.out.println("It's a draw!");
            }
        }
    }