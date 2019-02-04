import java.util.Scanner;
public class operatorss
{
        public static void main(String[] args)

        {
            Scanner keyboard = new Scanner(System.in);
            int x;
            int y;
            System.out.println("Yo, dude, let's see what numbers you got, bro!");
            x = keyboard.nextInt();
            System.out.println("I need just one more number, my guy.");
            y = keyboard.nextInt();
            System.out.printf("%d+%d=%d\n" , x , y , x+y );
            System.out.printf("%d-%d=%d\n" , x , y , x-y );
            System.out.printf("%dx%d=%d\n" , x , y , x*y );
            System.out.printf("%d/%d=%d\n" , x , y , x/y );
        }
}