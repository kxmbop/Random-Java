import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;



public class Number {
   public static final DecimalFormat df = new DecimalFormat("0.000");
   public static void main(String[] args) {
   
      System.out.print("\n\tActivity 1 - Number Java");
      
      Scanner scan = new Scanner (System.in);
      System.out.print("\n\tInput Number: ");
      double a = scan.nextDouble();
      
      Double x = Math.pow(a,0.5);
      Double y = Math.pow(a,2);
      Double z = Math.pow(a,3);
      
      System.out.print("\n\tSquare root is: "+ df.format(x));
      System.out.print("\n\tSquare is: "+ df.format(y));
      System.out.print("\n\tCube is: "+ df.format(z));
      
   }

}