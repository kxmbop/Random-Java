import java.util.Scanner;

public class Chap17Ex4

{
    public static void main(String[] Strings)
    {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Welcome to Yertle's Wuest");
        System.out.println("Enter the name of your character:");
        String name = input.nextLine();
        System.out.println("Enter strength (1-10):");
        int strength = input.nextInt();
        System.out.println("Enter health (1-10):");
        int health = input.nextInt();
        System.out.println("Enter luck (1-10):");
        int luck = input.nextInt();
        input.close();
        int total = strength + health + luck;

        if (total <= 15)
        {
            System.out.println("You have give your character enough points!");
            System.out.println("Values have been assigned");
            System.out.println(name + " , strength: " + strength + " , health: " + health + " , luck: " + luck);
        }
        else if ( total > 15)
        {
            System.out.println("You have give your character too many points!");
            System.out.println("Default values have been assigned");
            System.out.println(name + " , strength: 5, health: 5, luck: 5");
        }
        
    }
}