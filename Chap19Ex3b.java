import java.util.Scanner;

public class Chap19Ex3b
{
    public static void main (String[] args)
    {
        String first, second;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word:");
        first = sc.nextLine();
        System.out.println("Enter second word:");
        second = sc.nextLine();
        sc.close();
        System.out.print(first);
        int a=1;
        int sum = first.length() + second.length();
        int must = 30 - sum;

        while (a <= must)
        {
            System.out.print(".");
            a = a+1;
        }
        System.out.print(second);

    }
    
  
}

