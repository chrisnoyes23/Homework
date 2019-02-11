import java.util.Scanner;
    public class leap
    {
        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);
            
            int year;

            System.out.println("Give me a number and I will tell you if it is a leap year!");
            year = keyboard.nextInt();

            if(year % 4 == 0 && (year % 400 == 0 || year % 100 != 0))
            {
                System.out.printf("%d is a leap year!", year);
            }

            else
            {
                System.out.printf("%d is not a leap year!", year);
            }  
        }
    }