import java.util.Scanner;

public class Chap17Ex2

{
    public static void main(String[] Strings)
    {
        Scanner sc = new Scanner(System.in);

        float Tair, Tsteam, effieciency;

        System.out.print("Air Temperature: ");
        Tair = sc.nextFloat();
        System.out.print("Steam Temperature: ");
        Tsteam = sc.nextFloat();
        sc.close();

        if (Tsteam >= 373)
        {   
            effieciency = 1- Tair / Tsteam;
            System.out.println("Maximum possible efficiency: " + effieciency);
        }
        else if (300 <= Tsteam && Tsteam < 373)
        {
            System.out.println("Efficeincy is zero");
        }
        

    }


}