import java.util.Scanner;

public class Chap17Ex5
{
    public static void main(String[] Strings)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight: ");
        int weight = sc.nextInt();
        sc.close();

        if(weight <= 299)
        {
            System.out.println("Charges: $200");
        }
        else if (weight >= 300 )
        {
            int num = weight / 100;
            double total = 200 + ((num - 2) * 8);
            System.out.println("Charges: $" + total);
        }
    
    }
}