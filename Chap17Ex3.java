import java.util.Scanner;

public class Chap17Ex3
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("How many items to heat: ");
        int item = sc.nextInt();
        System.out.print("Time for one item: ");
        int time = sc.nextInt();
        sc.close();
        if(item == 1)
        {   
            int mins = time / 100;
            int secs = (time / 10) % 10;
            int secss = time % 10;
            System.out.println("Heat for " + mins + " minutes " + secs + secss + " seconds");
        }
        else if (item ==2)
        {
            int mins = ((time / 2) + time) / 100;
            int secs = ((time / 2) + time) / 10 % 10;
            int secss = ((time / 2) + time )% 10;
            System.out.println("Heat for " + mins + " minutes " + secs + secss + " seconds");
        }
        else if (item ==3)
        {
            int mins = (time * 2) / 100;
            int secs = (time * 2) / 10 % 10;
            int secss = (time * 2) % 10;
            System.out.println("Heat for " + mins + " minutes " + secs + secss + " seconds");
        }
        else if (item >= 4)
        {
            System.out.println("Heating more than three itens at once is not recommended!");


        }
       
    }
}
