import java.util.Scanner;

public class Chap19Ex4b
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String phrase;
        System.out.print("Enter a word: ");
        phrase = sc.nextLine();
        sc.close();

        int a=1, count = phrase.length();
        
        while (a <= count)
        {
            a = a+1;
            String letter = phrase.charAt(1);
            
        }
      
  
            String line;    // A line of text, typed in by the user.
            int i;          // Position in line, from 0 to line.length() - 1.
            char ch;        // One of the characters in line.
            boolean didCR;  // Set to true if the previous output was a carriage return.
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a line of text.");
            System.out.print("? ");
            line = sc.nextLine();
            
            System.out.println();
            didCR = true;
            
            for ( i = 0;  i < line.length();  i++ ) {
               ch = line.charAt(i);
               if ( Character.isLetter(ch) ) {
                  System.out.print(ch);
                  didCR = false;
               }
               else {
                  if ( didCR == false ) {
                     System.out.println();
                     didCR = true;
                  }
               }
            }
            
            System.out.println();  // Make sure there's at least one carriage return at the end.
              
       
        

    }
}