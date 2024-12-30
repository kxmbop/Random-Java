import java.util.Scanner;
import java.lang.Math;


    public class Chap16Ex6
    {  
      
      public static void main ( String[] args )  
      {
        double v, temp;
    
        Scanner sc= new Scanner(System.in); 
        
        System.out.print("Enter Wind Speed:\t");  
        v = sc.nextDouble();  
        System.out.print("Enter Temperature:\t");  
        temp = sc.nextDouble(); 
        sc.close();

        if (v < 3|| temp > 50)
        {
            System.out.println("Wind Chill: "+ temp);

            
        }
        else
        {
            double windchill = 35.74 + 0.6215*temp - 35.75 * Math.pow(v,0.16) + 0.4275 * temp * Math.pow(v,0.16);
            System.out.println("Wind chill:\t" + windchill);

        }
      }
    }
    
    




