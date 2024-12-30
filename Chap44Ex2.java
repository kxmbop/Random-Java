package assignment;

import java.util.Scanner;

public class Chap44Ex2 {

	public static void main(String[] args) {
        String line;    // A line of text, typed in by the user.
        char ch;        // Position in line, from 0 to line.length() - 1.
		int i=0;     		// One of the characters in line.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        line = sc.nextLine();
        sc.close();
        System.out.println();
        while(i < line.length()) {
        	ch = line.charAt(i);
        	System.out.println(ch);
        	i++;
        }

        System.out.println();  // Make sure there's at least one carriage return at the end.

	}

}




