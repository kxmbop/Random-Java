import java.util.Scanner;

public class Chap19Ex4
{
    public static void main (String[] string)
    {
        Scanner sc = new Scanner(System.in);
        String inputString;
        int times, a=1;

        System.out.println("Enter a word: ");
        inputString = sc.nextLine();
        System.out.print("\n");
        sc.close();

        times = inputString.length();
        

        while (a <= times)
        {
            System.out.println(inputString);
            a = a + 1;
        }
    }
}