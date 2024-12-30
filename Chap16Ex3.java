import java.util.Scanner;  

public class Chap16Ex3
{  
  public static void main ( String[] args )  
  {
    int capacity, gage, miles, distance;

    Scanner in= new Scanner(System.in); 
    
    System.out.print("Capacity of the gas tank, gallons:\t");  
    capacity = in.nextInt();  
    System.out.print("Gas Gauge in percent:\t");  
    gage= in.nextInt();    
    System.out.print("Miles per gallon of the car:\t");  
    miles = in.nextInt(); 
    in.close();

    distance = capacity * gage * miles / 100;
     
    if (distance < 200)
    {
        System.out.println("Get Gas!");
    }

    else
    {
        System.out.println("Safe to proceed"); 
    }

  }
}

