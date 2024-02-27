import java.util.Scanner;
import java.util.Random;
//Created by krishnaanupam56@gmail.com(author)
public class RockScissorsPaper
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int user, bot, u = 0, b = 0, i = 1;
        System.out.println("Enter the number of matches you want to play in a series :  ");
        int n=sc.nextInt();
        while (i <= n)
        {
            System.out.println(ANSI_BLUE+"\nMatch no " + i+ANSI_RESET);
            System.out.println(ANSI_WHITE +"Enter your choice \n 1 for Rock,\n 2 for Scissors,\n 3 for Paper: "+ANSI_RESET);

            // Validate user input
            while (true)
            {
                if (sc.hasNextInt())
                {
                    user = sc.nextInt();
                    if (user >= 1 && user <= 3)
                    {
                        break;
                    } else
                    {
                        System.out.println(ANSI_RED+"Invalid input. Please enter 1, 2, or 3."+ANSI_RESET);
                    }
                }
                else
                {
                    System.out.println(ANSI_RED+"Invalid input. Please enter an integer."+ANSI_RESET);
                    sc.next(); // Consume the invalid input
                }
            }

            bot = rand.nextInt(1, 4);
            System.out.println(ANSI_BLUE+"Your entry: " + user+ANSI_RESET);
            System.out.println(ANSI_CYAN+"Computer's entry: " + bot+ANSI_RESET);

            if ((user == 1 && bot == 2) || (user == 2 && bot == 3) || (user == 3 && bot == 1))
            {
                System.out.println(ANSI_GREEN+"You won"+ANSI_RESET);
                u++;
            }
            else if ((bot == 1 && user == 2) || (bot == 2 && user == 3) || (bot == 3 && user == 1))
            {
                System.out.println(ANSI_PURPLE+"Computer won"+ANSI_RESET);
                b++;
            }
            else
            {
                System.out.println(ANSI_YELLOW+"It's a draw"+ANSI_RESET);
            }
            i++;
        }

        if (u > b)
        {
            System.out.println(ANSI_GREEN+"User is the winner by " + u + " - " + b+ANSI_RESET);
        }
        else if (b > u)
        {
            System.out.println(ANSI_PURPLE+"Computer is the winner by " + b + " - " + u+ANSI_RESET);
        }
        else
        {
            System.out.println(ANSI_YELLOW+"It's a draw by " + u + " - " + b+ANSI_RESET);
        }
        sc.close();
    }
}
