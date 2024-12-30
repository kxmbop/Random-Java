import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Chap34Ex2
{
    public static void main ( String[] args ) throws IOException
    {  
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter file path: ");
        FileReader fileReader = new FileReader(sc.nextLine());
        StringBuffer input = new StringBuffer();
        sc.close();

        int consonants = 0;
        int vowels = 0;
        int punctuations = 0;
        int spaces = 0;

        int data;
        while((data = fileReader.read()) != -1){
            input.append((char)data);
        }
        
        for (int i=0; i < input.toString().length(); i++)
        {
            switch(input.toString().charAt(i))
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
        double total = sc.toString().length();
        double conso = (consonants / total) * 100;
        double vow = vowels / total * 100;
        double spac = spaces / total * 100;
        double punc = punctuations / total * 100;
        
        System.out.println("Consonants: " + consonants + "\t" + conso + "%");
        System.out.println("Vowels: " +  vowels  + "\t" + vow + "%");
        System.out.println("Spaces: " + spaces  + "\t" + spac + "%");
        System.out.println("Punctuation Characters: " + punctuations  + "\t" + punc + "%");
    }

}