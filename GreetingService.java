import java.util.Scanner;
interface Igreeting
{
    void greet(String name);
}

class University implements Igreeting
{   
    public void greet(String name)
    {   
        System.out.println("Welcome to the university portal "+name+". Keep exploring, learning, and innovating.");
    }
}
class Restaurant implements Igreeting
{
    public void greet(String name)
    {
        System.out.println("Welcome "+name+"! Discover delicious meals and unforgettable flavors.");
    }
}
class Air_Booking implements Igreeting
{
    public void greet(String name)
    {
    System.out.println("Hello "+name+"! Find the best deals on domestic and international flights.");
    }
}
 class Hotel_and_Stay implements Igreeting
{
    public void greet(String name)
    {
        System.out.println("Welcome "+name+"! Experience comfort, luxury, and relaxation with us.");
    }
}
class Tours_and_Travel implements Igreeting
{
    public void greet(String name)
    {
        System.out.println("Welcome "+name+"! Plan your perfect journey with us.");
    }
}

public class GreetingService
{
    public static void main(String[]args)
    {
        String name;
        
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name:");
        name=sc.nextLine();
        do
        {
            Igreeting i= null;
            System.out.println("Enter your choice:\n1.University\n2.Restaurant\n3.Hotel and Stay\n4.Tours and Travel\n5.Air Booking\n6.Exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    i=new University();
                    break;
                case 2:
                    i=new Restaurant();
                    break;
                case 3:
                    i=new Hotel_and_Stay();
                    break;
                case 4:
                    i=new Tours_and_Travel();
                    break;
                case 5:
                    i=new Air_Booking();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid Choice!!");
                    break;
            }
            if(i!=null)
                i.greet(name);
        }while(ch!=6);
        System.out.println("Goodbye "+name+"! We hope to see you again soon.");
    }
}