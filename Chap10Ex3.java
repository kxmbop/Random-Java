import java.util.*;

public class Chap10Ex3
{
  public static void main ( String[] args )
  {
      double rad = 30 * Math.PI/180, sinx = Math.sin(rad), cosx = Math.cos(rad), sum = Math.pow(sinx,2) + Math.pow(cosx,2);

      System.out.println("radiant: "+ rad +" sine: "+ sinx + " cosine:"+ cosx + " sum of squares: "+sum);
    
  }
}