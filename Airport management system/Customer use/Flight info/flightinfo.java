import java.util.*;

class flightinfo 
{
    String ticket_number;
    String passport_number;
    String luggage_number;
    String seat_class;
    String seat_number;
    String landing_place = "USA";
    int Ahmedabad_flightgate = 1;
    int Mumbai_flightgate = 2;
    int Banglore_flightgate = 3;
    int Canada_flightgate = 4;
    int USA_flightgate = 5;
    void flightinformation()
    {
        System.out.println("Your Ticket number is : " + ticket_number);
        System.out.println("Your Passport number is : " + passport_number);
        System.out.println("Your Seat Number is : " + seat_number);
        System.out.println("Your Seat class is : " + seat_class);
        System.out.println("Your Luggage number is : " + luggage_number);
        if(landing_place.equals("Ahmedabad"))
        {
            System.out.println("Your Flight will arrive at gate number " + Ahmedabad_flightgate);
            System.out.println("You have to go by bus number " +1);
        }
        if(landing_place.equals("Mumbai"))
        {
            System.out.println("Your Flight will arrive at gate number " + Mumbai_flightgate);
            System.out.println("You have to go by bus number " +2);
        }
        if(landing_place.equals("Banglore"))
        {
            System.out.println("Your Flight will arrive at gate number " + Banglore_flightgate);
            System.out.println("You have to go by bus number " +3);
        }
        if(landing_place.equals("Canada"))
        {
            System.out.println("Your Flight will arrive at gate number " + Canada_flightgate);
            System.out.println("You have to go by bus number " +4);
        }
        if(landing_place.equals("USA"))
        {
            System.out.println("Your Flight will arrive at gate number " + USA_flightgate);
            System.out.println("You have to go by bus number " +5);
        }
        if(landing_place.equals("Canada"))
        {
            System.out.println("Your Fligh will hold at Dubai for 3 hours");
        }
        if(landing_place.equals("USA"))
        {
            System.out.println("Your Fligh will hold at Mumbai for 1 hour and Dubai for 3 hours");
        }
    }
}

class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        flightinfo f = new flightinfo();
        f.flightinformation();
        sc.close();
    }
}