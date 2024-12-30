import java.util.Scanner;

public class Chap19Ex1

{
    public static void main (String[] args)
    {
        int start, end;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start:");
        start = sc.nextInt();
        System.out.println("Enter End:");
        end = sc.nextInt();
        sc.close();

        while (start <= end)
        {
            System.out.println(start);
            start = start + 1;
        }

    }
}