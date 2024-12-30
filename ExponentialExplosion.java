public class ExponentialExplosion
{
  public static void main ( String[] args )
  {
    double value = 1234;
    System.out.println("e to the power value: " +  Math.exp( value ) );
  }
}

/**When running the 2 digit "32", it run correctly. After 
changing the digit to a bigger value, it shows error as
expected since double can only store 16 digits after
decimal.*/