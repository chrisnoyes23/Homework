import java.util.Scanner;
public class negative
{
        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Give me a number! \nIf you want the program to keep running, give me a positive number, if you want it to end - a negative one.");
            int neg = keyboard.nextInt();

            int master = 0;

            int big = 0;
            
            int smol = 0;

            int count = 0;

            while(neg >= 0)
            {
                if(neg >= big)
                {
                    big = neg;
                }

                if(neg <= smol || count == 0)
                {
                    smol = neg;
                    count++;
                }

                master += neg;
                System.out.println("I thought I asked for a negative number!");
                System.out.println("Try again!");
                neg = keyboard.nextInt();
            }
            System.out.printf("That is a nice negative number! %d was it? \n", neg);

            if(count != 0)
            {
                System.out.printf("The sum of the positive numbers you entered was %d! \n", master);
                System.out.printf("The biggest positive number you gave me was %d! \n", big);
                System.out.printf("The smallest positive number you gave me was %d!", smol);
            }
        }
}