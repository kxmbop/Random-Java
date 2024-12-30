import java.util.Random;

public class Chap34Ex4
{
    public static void main (String[] args)
    {
        Random in = new Random();
        
        int firstnum = in.nextInt(12) + 1;
        int secondnum = in.nextInt(24) + 13;
        String firstname, secondname;
        switch ()
        {
            case 1:
                firstname = "John"; break;
            case 2:
                firstname = "Chris"; break; 
            case 3:
                firstname = "Drey"; break;
            case 4:
                firstname = "Elias"; break;
            case 5:
                firstname = "Merlin"; break;
            case 6:   
                firstname = "Jake"; break;
            case 7:
                firstname = "Ace"; break;
            case 8:
                firstname = "Levi"; break;
            case 9:
                firstname = "Tobey"; break;
            case 10:
                firstname = "Tom"; break;
            case 11:
                firstname = "Andrew"; break;
            case 12:
                firstname = "Mark"; break;
            case 13:
                secondname = "Parker"; break;
            case 14:
                secondname = "Willies"; break;
            case 15:
                secondname = "Davila"; break;
            case 16:
                secondname = "Rivera"; break;
            case 17:
                secondname = "Brack"; break;
            case 18:
                secondname = "Walsh"; break;
            case 19:
                secondname = "Darby"; break;
            case 20:
                secondname = "Lynch"; break;
            case 21:
                secondname = "Wilson"; break;
            case 22:
                secondname = "Hanley"; break;
            case 23:
                secondname = "Duffy"; break;
            case 24:
                secondname = "Lyons"; break;
        }
        
        System.out.println("Firstname is: " + firstname);
        System.out.println("Secondname is: " + secondname);

    }
}