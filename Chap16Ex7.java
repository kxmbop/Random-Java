import java.util.Scanner;
    public class Chap16Ex7
    {  
      public static void main ( String[] args )  
      {
        int years, months, days;
        double seconds;
        double percent;
        Scanner sc= new Scanner(System.in); 
        
        System.out.print("Age in years:\t");  
        years = sc.nextInt();  
        System.out.print("Months:\t");  
        months = sc.nextInt(); 
        System.out.print("Days:\t");
        days = sc.nextInt();
        sc.close();

        if (months == 0){
          seconds = (years * 365 * 24 * 60 *60) + days * 24 * 60 * 60; percent = (seconds/2.5) * 0.0000001; 
          System.out.println("Age in seconds: "+ seconds);
          System.out.print("Percentage of Expected lifespan you've lived: " + percent + "%");} 
        else if (months == 1){ months = 31;
          seconds = (years * 365 * 24 * 60 *60) + ((months + days) * 24 * 60 * 60); percent = (seconds/2.5) * 0.0000001; 
          System.out.println("Age in seconds: "+ seconds);
          System.out.print("Percentage of Expected lifespan you've lived: " + percent + "%");} 
        else if (months == 2){ months = 59;
          seconds = (years * 365 * 24 * 60 *60) + ((months + days) * 24 * 60 * 60);  percent = (seconds/2.5) * 0.0000001; 
          System.out.println("Age in seconds: "+ seconds);
          System.out.print("Percentage of Expected lifespan you've lived: " + percent + "%");} 
        else if (months == 3){ months = 90;
          seconds = (years * 365 * 24 * 60 *60) + ((months + days) * 24 * 60 * 60);  percent = (seconds/2.5) * 0.0000001; 
          System.out.println("Age in seconds: "+ seconds);
          System.out.print("Percentage of Expected lifespan you've lived: " + percent + "%");} 
        else if (months == 4){ months = 120;
          seconds = (years * 365 * 24 * 60 *60) + ((months + days) * 24 * 60 * 60); percent = (seconds/2.5) * 0.0000001; 
          System.out.println("Age in seconds: "+ seconds);
          System.out.print("Percentage of Expected lifespan you've lived: " + percent + "%");} 
        else if (months == 5){ months = 151;
          seconds = (years * 365 * 24 * 60 *60) + ((months + days) * 24 * 60 * 60); percent = (seconds/2.5) * 0.0000001; 
          System.out.println("Age in seconds: "+ seconds);
          System.out.print("Percentage of Expected lifespan you've lived: " + percent  + "%");} 
        else if (months == 6){ months = 181;
          seconds = (years * 365 * 24 * 60 *60) + ((months + days) * 24 * 60 * 60); percent = (seconds/2.5) * 0.0000001; 
          System.out.println("Age in seconds: "+ seconds);
          System.out.print("Percentage of Expected lifespan you've lived: " + percent + "%");} 
        else if (months == 7){ months = 212;
          seconds = (years * 365 * 24 * 60 *60) + ((months + days) * 24 * 60 * 60); percent = (seconds/2.5) * 0.0000001; 
          System.out.println("Age in seconds: "+ seconds);
          System.out.print("Percentage of Expected lifespan you've lived: " + percent + "%");} 
        else if (months == 8){ months = 243; 
          seconds = (years * 365 * 24 * 60 *60) + ((months + days) * 24 * 60 * 60); percent = (seconds/2.5) * 0.0000001; 
          System.out.println("Age in seconds: "+ seconds);
          System.out.print("Percentage of Expected lifespan you've lived: " + percent + "%");} 
        else if (months == 9){ months = 273;
          seconds = (years * 365 * 24 * 60 *60) + ((months + days) * 24 * 60 * 60); percent = (seconds/2.5) * 0.0000001; 
          System.out.println("Age in seconds: "+ seconds);
          System.out.print("Percentage of Expected lifespan you've lived: " + percent + "%");} 
        else if (months == 10){ months = 384;
          seconds = (years * 365 * 24 * 60 *60) + ((months + days) * 24 * 60 * 60); percent = (seconds/2.5) * 0.0000001; 
          System.out.println("Age in seconds: "+ seconds);
          System.out.print("Percentage of Expected lifespan you've lived: " + percent + "%");} 
        else if (months == 11){ months = 334;
          seconds = (years * 365 * 24 * 60 *60) + ((months + days) * 24 * 60 * 60); percent = (seconds/2.5) * 0.0000001; 
          System.out.println("Age in seconds: "+ seconds);
          System.out.print("Percentage of Expected lifespan you've lived: " + percent + "%");} 
        else if (months == 12){ months = 365;
          seconds = (years * 365 * 24 * 60 *60) + ((months + days) * 24 * 60 * 60); percent = (seconds/2.5) * 0.0000001; 
          System.out.println("Age in seconds: "+ seconds);
          System.out.print("Percentage of Expected lifespan you've lived: " + percent + "%");} 
        else {}

      }
    }
    
    




