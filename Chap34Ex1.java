import java.util.Scanner;

public class Chap34Ex1
{
    public static void main (String[] Strings)
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String phrase = sc.nextLine();
        sc.close();

        int consonants = 0;
        int vowels = 0;
        int punctuations = 0;
        int spaces = 0;

        for (int i=0; i< phrase.length(); i++)
        {
            switch(phrase.charAt(i))
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels+=1;
                    break;
                case ',':
                case '.':
                case '!':
                case ':':
                    punctuations+=1;
                    break;
                case ' ':
                    spaces+=1;
                    break;
                default:
                    consonants+=1;
            }
            
        }
            System.out.println("Consonants: " + consonants);
            System.out.println("Vowels: " +  vowels);
            System.out.println("Spaces: " + spaces);
            System.out.println("Punctuation Characters: " + punctuations);
    }

}