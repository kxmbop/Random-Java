package assignment;
import java.util.Scanner;

public class Chap44Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time, seconds, hour;
		System.out.print("Enter cook time-> ");
		time = sc.nextInt();
		
		seconds = time%100;
		hour = time/100;
		System.out.println("Your time-> " + hour + ":" + seconds);
	}

}
