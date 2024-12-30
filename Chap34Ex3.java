import java.util.Scanner;
public class Chap34Ex3
{
  public static void main ( String[] args ) 
  {
    String phrase;
      
    String message = "Phrase is: ";
    
    Scanner scan = new Scanner( System.in );

    System.out.print("Enter Acronym: ");
    phrase = scan.hasNextLine();
 
    switch ( phrase )
    {
      case "LOL":
        message = message + "Laugh Out Loud" ;
        break;
               
      case "BFF":
        message = message + "Best Friends Forever" ;
        break;
               
      case "SO":
        message = message + "Significant Other" ;
        break;
              
      case "THS":                  
      case "THKS":                  
      case "TX":                  
        message = message + "Thanks" ;
        break;
                           
      default:
        message = message + "unknown" ;
            
    }

    System.out.println ( message ) ;
  }
}