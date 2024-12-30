import java.util.Scanner;


public class Chap16Ex5b {

    public static void main(String args [])
    {
            Scanner in = new Scanner(System.in);

            int birth, year;

            System.out.print("Year of Birth: ");
            birth = in.nextInt();
            System.out.print("Current Year: ");
            year = in.nextInt();
            in.close();

            int age = year-birth;

            if(year<20)
                {  
                int lower = year + 2000;
                int age2 = lower - (birth+1900);
                    if(age2 <100)
                    {
                    System.out.println("Your age: "+age2);
                    }
                    else
                    {
                    System.out.println("Your age: "+ (age2-100));
                    }
                 }
        
            else if (birth<20)
                {
                int age3 = year - birth;
                System.out.println("Your age:" + age3); 
                }

            else 
                {
                System.out.println("Your age:" + age);
                }
   }
}