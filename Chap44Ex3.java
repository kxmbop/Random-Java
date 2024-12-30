package assignment;
import java.util.Scanner;

public class Chap44Ex3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		
		while(true) {
			System.out.println("Enter a name:");
			name = sc.nextLine();
			if(name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")) {
				System.out.println("Ms. " + name + "\n");
			}
			else if(name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham")) {
				System.out.println("Mr. " + name + "\n");
			}
			else {
				System.out.println(name);
			}
		
		}
	}
	
}
