import java.util.Scanner;

public class Chap20Ex1
{
    public static void main (String[] args)
    {
        int total = 0, num, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many integers will be added: ");
        num = sc.nextInt();
        
        while (num > 0)
        {
           
            System.out.print("Enter an interger: ");
            n = sc.nextInt();
            total = total + n;
            num =  num-1;
            
        }
        sc.close();
        System.out.println();
        System.out.print("The sum is " + total);

    }
}