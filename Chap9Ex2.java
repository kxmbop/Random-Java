public class Chap9Ex2
{
  public static void main ( String[] args )
  {
    double x = 4, result; 
  
    result = 3 * Math.pow(x,2) - 8 * x + 4;
    System.out.println("At X = " + x + " the value is " + result);
    
    x = 1.5;
    result = 3 * Math.pow(x,2) - 8 * x + 4;
    System.out.println("At X = " + x + " the value is " + result);
   
    x = 12345678;
    result = 3 * Math.pow(x,2) - 8 * x + 4;
    System.out.println("At X = " + x + " the value is " + result);
    
    x = -5;
    result = 3 * Math.pow(x,2) - 8 * x + 4;
    System.out.println("At X = " + x + " the value is " + result);
    
    x = 0;
    result = 3 * Math.pow(x,2) - 8 * x + 4;
    System.out.println("At X = " + x + " the value is " + result);
  
    
  }
}


/**The results of all values are so far are correct.*/

