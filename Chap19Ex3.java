import java.util.Scanner;

public class Chap19Ex3
{
    public static void main (String[] args)
    {
        int low, high;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter low:");
        low = sc.nextInt();
        System.out.println("Enter high:");
        high = sc.nextInt();
        sc.close();


        int sum = (high*(high+1))/2;
        int total = sum - (low*(low-1))/2;
        System.out.println("Sum = " + total);

    }
}
