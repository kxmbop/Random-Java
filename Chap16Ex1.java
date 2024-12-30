import java.util.Scanner;  
import java.text.DecimalFormat;

public class Chap16Ex1
{  
  private static final DecimalFormat df = new DecimalFormat("0.00");
  
  public static void main ( String[] args )  
  {
    double amount, discounted;

    Scanner sc= new Scanner(System.in); 
    
    System.out.print("Enter amount of purchases:\t");  
    amount = sc.nextDouble();  
    sc.close();
    discounted = amount - (amount * 0.10);
    System.out.println("Discounted price:\t" + df.format(discounted));
  }
}

