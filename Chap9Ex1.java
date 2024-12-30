public class Chap9Ex1
{  
  public static void main ( String[] args )  
  {
    long   hoursWorked = 40;    
    double payRate     = 10.0, taxRate = 0.10;    
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}


/**The problem was detected when I removed the intialization
from the program. Since we concatinated the variable and the
value of it was removed so the result was error.*/
