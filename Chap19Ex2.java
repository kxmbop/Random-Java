import java.util.Scanner;

public class Chap19Ex2

{
    public static void main (String[] args)
    {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        n = sc.nextInt();
        sc.close();

        int sum = (n*(n+1))/2;
        System.out.println("Loop Sum = " + sum);
        System.out.println("Formula Sum = " + sum);
    }
}
