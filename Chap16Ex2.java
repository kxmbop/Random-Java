import java.util.Scanner;  

public class Chap16Ex2
{  
  public static void main ( String[] args )  
  {
    int Total, bolt, nut, washer;
    final int boltPrice = 5;
    final int nutPrice = 3;
    final int  washerPrice = 1;
     
    Scanner in= new Scanner(System.in); 
    
    System.out.print("Number of bolts:\t");  
    bolt = in.nextInt();  
    System.out.print("Number of nuts:\t");  
    nut = in.nextInt();    
    System.out.print("Number of washers:\t");  
    washer = in.nextInt(); 
    in.close();
     
    if (nut < bolt)
    {
        System.out.println("Check the Order: too few nuts");
    }

    if (washer <= bolt * 2)
    {
        System.out.println("Check the Order: too few washers"); 
    }


    Total = (bolt * boltPrice) + (nut * nutPrice) + (washer * washerPrice);
    System.out.println("Total cost: " + Total);
  }
}

