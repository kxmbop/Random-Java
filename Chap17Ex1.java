import java.util.Scanner;
import java.text.DecimalFormat;

public class Chap17Ex1

{
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args)
    {
        String item;
        Double price, total;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the item: ");
        item = sc.nextLine();
        System.out.print("Enter the price: ");
        price = sc.nextDouble();
        System.out.print("Overnght delivery (0==no, 1==yes): ");
        int del = sc.nextInt();
        sc.close();

        if (price < 10)
        {
            if (del == 0) 
            {
                System.out.println("Invoice:");
                System.out.println("\t" + item + "\t$" + price);
                total = price + 2;
                System.out.println("\tDelivery\t$2.00");
                System.out.println("\tTotal\t\t$" + df.format(total));
            }
            else if (del == 1)
            {
                System.out.println("Invoice:");
                System.out.println("\t" + item + "\t$" + price);
                total = price + 5;
                System.out.println("\tDelivery\t$5.00");
                System.out.println("\tTotal\t\t$" + df.format(total));
            }
        else if (price >= 10)
        {
            if (del == 0) 
            {
                System.out.println("Invoice:");
                System.out.println("\t" + item + "\t$" + price);
                System.out.println("\tDelivery\t$FREE");
                System.out.println("\tTotal\t\t$" + df.format(price));
            }
            else if (del == 1)
            {
                System.out.println("Invoice:");
                System.out.println("\t" + item + "\t$" + price);
                total = price + 3;
                System.out.println("\tDelivery\t$3.00");
                System.out.println("\tTotal\t\t$" + df.format(total));
            }
        }
        
        }


        



    }


}