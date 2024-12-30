package assignment;
import java.util.Scanner;

public class Chap44Ex1 {

	public static void main(String[] args) {

		 String input;     
	        int space;        
	        String firstName; 
	        String lastName; 
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your name: ");
	        input = sc.nextLine();
	        
	        space = input.indexOf(' ');
	        firstName = input.substring(0, space);
	        lastName = input.substring(space+1);
	        
	        System.out.println("\n" + firstName + " "
	                                  + lastName.toUpperCase());
	       sc.close();
	}

}
