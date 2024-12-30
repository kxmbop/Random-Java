import java.util.Scanner;  
import java.text.DecimalFormat;

public class Chap16Ex5a
{  
    private static final DecimalFormat df = new DecimalFormat("0.000000");
  public static void main ( String[] args )  
  {
    double priceA, leanA, priceB, leanB;

    Scanner in= new Scanner(System.in); 
    
    System.out.print("Price per pound package A: \t");  
    priceA = in.nextDouble();  
    System.out.print("Percent lean package A: \t");
    leanA = in.nextDouble(); 
    System.out.print("Price per pound package B: \t");
    priceB = in.nextDouble(); 
    System.out.print("Percent lean package B: \t");
    leanB = in.nextDouble(); 
    in.close();

     double PackageA = priceA / (leanA * 0.01);
     double PackageB = priceB / (leanB * 0.01);

    System.out.println("Package A cost per pound of lean: " + df.format(PackageA));
    System.out.println("Package B cost per pound of lean: " + df.format(PackageB));


    if (PackageA < PackageB)
    {
        System.out.println("Package A is the best value");
    }

    else
    {
        System.out.println("Package B is the best value");
    }

  }
}


