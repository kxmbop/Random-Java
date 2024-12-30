
import java.util.Scanner;

public class Chap16Ex9

{
public static void main(String[] Strings) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Age: ");
    int age = input.nextInt();

    System.out.print("Enter time in 24hour format: ");
    int time = input.nextInt();

    input.close();

        if (age >= 13)
        {
            if (time < 1700)
            {
                System.out.println("Ticket price is: $8.00");
            }
            else if (time >= 1700 && time <= 2159)
            {
                System.out.println("Ticket price is: $5.00");
            }
            else if (time >= 2200)
            {
                System.out.println("Ticket price is: $4.00");
            }
        }
        if (age < 13)
        {
            if (time < 1700)
            {
                System.out.println("Ticket price is: $4.00");
            }
            else if (time >= 1700)
            {
                System.out.println("Ticket price is: $2.00");
            }
            else if (time >= 2200)
            {
                System.out.println("No children tickets beyond this time!");
            }
        }
        
    }
}