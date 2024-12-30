import java.util.Scanner;  

public class Chap16Ex4
{  
  public static void main ( String[] args )  
  {
    int weight;

    Scanner in= new Scanner(System.in); 
    
    System.out.print("Contestan's weight:\t");  
    weight = in.nextInt();  
    in.close();

    if (weight >= 220 && weight <= 280 )
    {
        System.out.println("Participant is allowed to join the contest");
    }

    else
    {
        System.out.println("Participant is not allowed to join the contest"); 
    }

  }
}

