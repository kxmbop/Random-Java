package assignment;

import java.util.Scanner;

public class Chap44Ex6 {

	public static void main(String[] args) {
		 boolean low = false,digits=false,valid=false;
	        while(!valid){
	            System.out.print("Enter password: ");
	            Scanner scanner = new Scanner(System.in);
				String password = scanner.nextLine().trim();
	            String pass= "";
	            if(password.length() >= 7){
	               for(int i =0; i < password.length(); i++) {
	                   if (password.charAt(i) == password.toLowerCase().charAt(i)) {
	                       low = true;
	                       break;
	                   }
	               }
	               if(low){
	                   for(int i =0; i < password.length(); i++) {
	                       switch (password.charAt(i)) {
	                           case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> digits = true;
	                           default -> pass += password.charAt(i);
	                       }
	                   }
	                   if(digits){
	                       for(int i =0; i < pass.length(); i++){
	                           if(pass.charAt(i) == pass.toUpperCase().charAt(i)){
	                               valid=true;
	                           }
	                       }
	                   }
	               }
	            }
	            if(!valid)
	                System.out.println("That password is not acceptable.");
	            else
	                System.out.println("Acceptable password.");
	        }

	
		}

	}


