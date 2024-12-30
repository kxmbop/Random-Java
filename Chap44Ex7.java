package assignment;
import java.util.Scanner;

public class Chap44Ex7 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	

		System.out.print("Enter a word --> ");
		String word = sc.nextLine();
		System.out.println();
		
		int lines = word.length();
	
		
		for(int a=0; a<lines; a++) {
			
			System.out.println(word);
			word = word.replaceFirst(String.valueOf(word.charAt(a)), " ");
			word = word.substring(0, word.length()-1);
			lines--;
		}
		sc.close();
	}	

}
