import java.util.*;
class AirportTicket
{
    String city1,city2,ticketclass,airline;
    int p,n,ticket_no,ticket_number;
    long total_price;
    int ticket_count = 1000;
    String airline_id;
    Scanner sc=new Scanner(System.in);
    
    void secondset()
    {
        System.out.println("Which city are you from?");
        city1=sc.nextLine();
        System.out.println("Where do you want to go?");
		city2=sc.nextLine();
        if(city1.equalsIgnoreCase("Ahmedabad")==true &&city2.equalsIgnoreCase("Mumbai")==true)
        {
            
            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if(airline.equalsIgnoreCase("AirIndia")==true||airline.equalsIgnoreCase("1")==true)
            {    
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5000Rs.");
                System.out.println("2.Premium Economy Class=6000Rs.");
                System.out.println("3.Business Class=8000Rs.");
                System.out.println("4.First Class=10000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no=sc.nextInt();
                    total_price=5000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10000 * ticket_no;
                }
            }
            else if(airline.equalsIgnoreCase("SpiceJet")==true ||airline.equalsIgnoreCase("2") == true)
             {    
                    airline_id = "SJ";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=5500Rs.");
                    System.out.println("2.Premium Economy Class=6500Rs.");
                    System.out.println("3.Business Class=8500Rs.");
                    System.out.println("4.First Class=10500Rs.");
                    ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no = sc.nextInt();
                        total_price = 5500 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=6500*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8500*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=10500*ticket_no;
                }
            }
             else if(airline.equalsIgnoreCase("Indigo")==true ||airline.equalsIgnoreCase("3"))
            {    
                    airline_id = "IG";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=5000Rs.");
                    System.out.println("2.Premium Economy Class=6050Rs.");
                    System.out.println("3.Business Class=8050Rs.");
                    System.out.println("4.First Class=10050Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=5000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=6050*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8050*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=10050*ticket_no;
                    }
                }
                else if(airline.equalsIgnoreCase("Vistara")==true ||airline.equalsIgnoreCase("4")==true)
                {    
                    airline_id = "VI";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=5000Rs.");
                    System.out.println("2.Premium Economy Class=6800Rs.");
                    System.out.println("3.Business Class=8800Rs.");
                    System.out.println("4.First Class=11000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=5800*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=6800*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8800*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=11000*ticket_no;
                    }
                }
                System.out.println("total_price="+total_price);
                for(int s =1 ; s<=ticket_no;s++)
                {
                    System.out.println("Ticket number is : "+ airline_id + ticket_count);
                    ticket_count++;
                }
        }

        else if(city1.equalsIgnoreCase("Mumbai")==true &&city2.equalsIgnoreCase("Ahmedabad")==true)
        {
            
            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if(airline.equalsIgnoreCase("AirIndia")==true ||airline.equalsIgnoreCase("1")==true)
            {    
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5000Rs.");
                System.out.println("2.Premium Economy Class=6000Rs.");
                System.out.println("3.Business Class=8000Rs.");
                System.out.println("4.First Class=10000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no=sc.nextInt();
                    total_price=5000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10000 * ticket_no;
                }
            }
            else if(airline.equalsIgnoreCase("SpiceJet")==true ||airline.equalsIgnoreCase("2")==true)
             {    
                airline_id = "SJ";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=5500Rs.");
                    System.out.println("2.Premium Economy Class=6500Rs.");
                    System.out.println("3.Business Class=8500Rs.");
                    System.out.println("4.First Class=10500Rs.");
                    ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no = sc.nextInt();
                        total_price = 5500 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=6500*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8500*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=10500*ticket_no;
                }
            }
             else if(airline.equalsIgnoreCase("Indigo")==true ||airline.equalsIgnoreCase("3")==true)
            {    
                airline_id = "IG";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=5000Rs.");
                    System.out.println("2.Premium Economy Class=6050Rs.");
                    System.out.println("3.Business Class=8050Rs.");
                    System.out.println("4.First Class=10050Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=5000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=6050*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8050*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=10050*ticket_no;
                    }
                }
                else if(airline.equalsIgnoreCase("Vistara")==true ||airline.equalsIgnoreCase("4")==true)
                {    
                    airline_id = "VI";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=5000Rs.");
                    System.out.println("2.Premium Economy Class=6800Rs.");
                    System.out.println("3.Business Class=8800Rs.");
                    System.out.println("4.First Class=11000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=5800*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=6800*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8800*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=11000*ticket_no;
                    }
                }
                System.out.println("total_price="+total_price);
                for(int s =1 ; s<=ticket_no;s++)
                {
                    System.out.println("Ticket number is : "+ airline_id + ticket_count);
                    ticket_count++;
                }
        }
        else if(city1.equalsIgnoreCase("Ahmedabad")==true && city2.equalsIgnoreCase("Delhi")==true)
        {
            
            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if(airline.equalsIgnoreCase("AirIndia")==true ||airline.equalsIgnoreCase("1")==true)
            {    
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5999Rs.");
                System.out.println("2.Premium Economy Class=6590Rs.");
                System.out.println("3.Business Class=8700Rs.");
                System.out.println("4.First Class=11000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no=sc.nextInt();
                    total_price=5999*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6590 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8700 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11000 * ticket_no;
                }
            }
            else if(airline.equalsIgnoreCase("SpiceJet")==true || airline.equalsIgnoreCase("2")==true)
             {    
                airline_id = "SJ";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=6600Rs.");
                    System.out.println("2.Premium Economy Class=7700Rs.");
                    System.out.println("3.Business Class=8500Rs.");
                    System.out.println("4.First Class=12000Rs.");
                    ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no = sc.nextInt();
                        total_price = 6600 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=7700*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8500*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=12000*ticket_no;
                }
            }
             else if(airline.equalsIgnoreCase("Indigo")==true ||airline.equalsIgnoreCase("3")==true)
            {    
                airline_id = "IG";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=5900Rs.");
                    System.out.println("2.Premium Economy Class=7000Rs.");
                    System.out.println("3.Business Class=9050Rs.");
                    System.out.println("4.First Class=13000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=5900*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=7000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=9000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=13000*ticket_no;
                    }
                }
                else if(airline.equalsIgnoreCase("Vistara")==true ||airline.equalsIgnoreCase("4")==true)
                {    
                    airline_id = "VI";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=5000Rs.");
                    System.out.println("2.Premium Economy Class=6800Rs.");
                    System.out.println("3.Business Class=8800Rs.");
                    System.out.println("4.First Class=11000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=6000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=80000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=10000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=15000*ticket_no;
                    }
                }
                System.out.println("total_price="+total_price);
                for(int s =1 ; s<=ticket_no;s++)
                {
                    System.out.println("Ticket number is : "+ airline_id + ticket_count);
                    ticket_count++;
                }
        }
        else if(city1.equalsIgnoreCase("Delhi")==true && city2.equalsIgnoreCase("Ahmedabad")==true)
        {
            
            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if(airline.equalsIgnoreCase("AirIndia")==true ||airline.equalsIgnoreCase("1")==true)
            {    
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5999Rs.");
                System.out.println("2.Premium Economy Class=6590Rs.");
                System.out.println("3.Business Class=8700Rs.");
                System.out.println("4.First Class=11000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no=sc.nextInt();
                    total_price=5999*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6590 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8700 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11000 * ticket_no;
                }
            }
            else if(airline.equalsIgnoreCase("SpiceJet")==true || airline.equalsIgnoreCase("2") == true)
            {    
                airline_id = "SJ";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=6600Rs.");
                    System.out.println("2.Premium Economy Class=7700Rs.");
                    System.out.println("3.Business Class=8500Rs.");
                    System.out.println("4.First Class=12000Rs.");
                    ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no = sc.nextInt();
                        total_price = 6600 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=7700*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8500*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=12000*ticket_no;
                }
            }
             else if(airline.equalsIgnoreCase("Indigo")==true || airline.equalsIgnoreCase("3") ==true)
            {    
                airline_id = "IG";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=5900Rs.");
                    System.out.println("2.Premium Economy Class=7000Rs.");
                    System.out.println("3.Business Class=9050Rs.");
                    System.out.println("4.First Class=13000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=5900*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=7000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=9000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=13000*ticket_no;
                    }
                }
                else if(airline.equalsIgnoreCase("Vistara")==true || airline.equalsIgnoreCase("4")==true)
                {    
                    airline_id = "VI";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=5000Rs.");
                    System.out.println("2.Premium Economy Class=6800Rs.");
                    System.out.println("3.Business Class=8800Rs.");
                    System.out.println("4.First Class=11000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=6000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=10000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=15000*ticket_no;
                    }
                }
                System.out.println("total_price="+total_price);
                for(int s =1 ; s<=ticket_no;s++)
                {
                    System.out.println("Ticket number is : "+ airline_id + ticket_count);
                    ticket_count++;
                }
        }
        else if(city1.equalsIgnoreCase("Ahmedabad")==true && city2.equalsIgnoreCase("KOlkata")==true)
        {
            
            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if(airline.equalsIgnoreCase("AirIndia")==true ||airline.equalsIgnoreCase("1")==true)
            {    
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=7000Rs.");
                System.out.println("2.Premium Economy Class=9000Rs.");
                System.out.println("3.Business Class=11000Rs.");
                System.out.println("4.First Class=13000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no=sc.nextInt();
                    total_price=7000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 9000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 13000 * ticket_no;
                }
            }
            else if(airline.equalsIgnoreCase("SpiceJet")==true || airline.equalsIgnoreCase("2") == true)
             {    
                airline_id = "SJ";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=7300Rs.");
                    System.out.println("2.Premium Economy Class=8300Rs.");
                    System.out.println("3.Business Class=10300Rs.");
                    System.out.println("4.First Class=12300Rs.");
                    ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no = sc.nextInt();
                        total_price = 7300 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=9300*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=10300*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=12300*ticket_no;
                }
            }
             else if(airline.equalsIgnoreCase("Indigo")==true || airline.equalsIgnoreCase("3")==true)
            {    
                airline_id = "IG";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=7500Rs.");
                    System.out.println("2.Premium Economy Class=9500Rs.");
                    System.out.println("3.Business Class=11500Rs.");
                    System.out.println("4.First Class=12500Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=7500*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=9500*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=11500*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=12500*ticket_no;
                    }
                }
                else if(airline.equalsIgnoreCase("Vistara")==true || airline.equalsIgnoreCase("4")==true)
                {    
                    airline_id = "VI";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=8000Rs.");
                    System.out.println("2.Premium Economy Class=10000Rs.");
                    System.out.println("3.Business Class=11000Rs.");
                    System.out.println("4.First Class=13000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=10000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=11000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=13000*ticket_no;
                    }
                }
                System.out.println("total_price="+total_price);
                for(int s =1 ; s<=ticket_no;s++)
                {
                    System.out.println("Ticket number is : "+ airline_id + ticket_count);
                    ticket_count++;
                }

        }
        else if(city1.equalsIgnoreCase("Kolkata")==true && city2.equalsIgnoreCase("Ahmedabad")==true)
        {
            
            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if(airline.equalsIgnoreCase("AirIndia")==true || airline.equalsIgnoreCase("1")==true)
            {    
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=7000Rs.");
                System.out.println("2.Premium Economy Class=9000Rs.");
                System.out.println("3.Business Class=11000Rs.");
                System.out.println("4.First Class=13000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no=sc.nextInt();
                    total_price=7000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 9000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 13000 * ticket_no;
                }
            }
            else if(airline.equalsIgnoreCase("SpiceJet")==true || airline.equalsIgnoreCase("2")==true)
             {    
                airline_id = "SJ";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=7300Rs.");
                    System.out.println("2.Premium Economy Class=8300Rs.");
                    System.out.println("3.Business Class=10300Rs.");
                    System.out.println("4.First Class=12300Rs.");
                    ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no = sc.nextInt();
                        total_price = 7300 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=9300*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=10300*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=12300*ticket_no;
                }
                for(int k=1000;k<=ticket_no;k++)
                {
                            System.out.println("ticket_number=SJ"+k);
                }
            }
             else if(airline.equalsIgnoreCase("Indigo")==true || airline.equalsIgnoreCase("3")==true)
            {    
                airline_id = "IG";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=7500Rs.");
                    System.out.println("2.Premium Economy Class=9500Rs.");
                    System.out.println("3.Business Class=11500Rs.");
                    System.out.println("4.First Class=12500Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=7500*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=9500*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=11500*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=12500*ticket_no;
                    }
                }
                else if(airline.equalsIgnoreCase("Vistara")==true || airline.equalsIgnoreCase("4")==true)
                {    
                    airline_id = "VI";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=8000Rs.");
                    System.out.println("2.Premium Economy Class=10000Rs.");
                    System.out.println("3.Business Class=11000Rs.");
                    System.out.println("4.First Class=13000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=10000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=11000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=13000*ticket_no;
                    }
                }
                System.out.println("total_price="+total_price);
                for(int s =1 ; s<=ticket_no;s++)
                {
                    System.out.println("Ticket number is : "+ airline_id + ticket_count);
                    ticket_count++;
                }
        }
        else if(city1.equalsIgnoreCase("Ahmedabad")==true && city2.equalsIgnoreCase("Tronto")==true)
        {
            
            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if(airline.equalsIgnoreCase("AirIndia")==true || airline.equalsIgnoreCase("1")==true)
            {    
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=100000Rs.");
                System.out.println("2.Premium Economy Class=150000Rs.");
                System.out.println("3.Business Class=200000Rs.");
                System.out.println("4.First Class=250000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no=sc.nextInt();
                    total_price=100000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 150000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 200000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 250000* ticket_no;
                }
            }
            else if(airline.equalsIgnoreCase("SpiceJet")==true || airline.equalsIgnoreCase("2")==true)
             {    
                airline_id = "SJ";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=120000Rs.");
                    System.out.println("2.Premium Economy Class=170000Rs.");
                    System.out.println("3.Business Class=200000Rs.");
                    System.out.println("4.First Class=250000Rs.");
                    ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no = sc.nextInt();
                        total_price = 120000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=170000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=200000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=250000*ticket_no;
                }
                for(int k=1000;k<=ticket_no;k++)
                {
                            System.out.println("ticket_number=SJ"+k);
                }
            }
             else if(airline.equalsIgnoreCase("Indigo")==true || airline.equalsIgnoreCase("3")==true)
            {    
                airline_id = "IG";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=150000Rs.");
                    System.out.println("2.Premium Economy Class=190000Rs.");
                    System.out.println("3.Business Class=210000Rs.");
                    System.out.println("4.First Class=270000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=150000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=190000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=210000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=270000*ticket_no;
                    }
                }
                else if(airline.equalsIgnoreCase("Vistara")==true || airline.equalsIgnoreCase("4"))
                {    
                    airline_id = "VI";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=16000Rs.");
                    System.out.println("2.Premium Economy Class=200000Rs.");
                    System.out.println("3.Business Class=210000Rs.");
                    System.out.println("4.First Class=300000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=160000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=200000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=210000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=300000*ticket_no;
                    }
                }
                System.out.println("total_price="+total_price);
                for(int s =1 ; s<=ticket_no;s++)
                {
                    System.out.println("Ticket number is : "+ airline_id + ticket_count);
                    ticket_count++;
                }
        }
        else if(city1.equalsIgnoreCase("Tronto")==true && city2.equalsIgnoreCase("Ahmedabad")==true)
        {
            
            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if(airline.equalsIgnoreCase("AirIndia")==true || airline.equalsIgnoreCase("1")==true)
            {    
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=100000Rs.");
                System.out.println("2.Premium Economy Class=150000Rs.");
                System.out.println("3.Business Class=200000Rs.");
                System.out.println("4.First Class=250000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no=sc.nextInt();
                    total_price=100000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 150000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 200000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 250000* ticket_no;
                }
            }
            else if(airline.equalsIgnoreCase("SpiceJet")==true || airline.equalsIgnoreCase("2")==true)
             {    
                airline_id = "SJ";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=120000Rs.");
                    System.out.println("2.Premium Economy Class=170000Rs.");
                    System.out.println("3.Business Class=200000Rs.");
                    System.out.println("4.First Class=250000Rs.");
                    ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no = sc.nextInt();
                        total_price = 120000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=170000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=200000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=250000*ticket_no;
                }
                for(int k=1000;k<=ticket_no;k++)
                {
                            System.out.println("ticket_number=SJ"+k);
                }
            }
             else if(airline.equalsIgnoreCase("Indigo")==true || airline.equalsIgnoreCase("3")== true)
            {    
                airline_id = "IG";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=150000Rs.");
                    System.out.println("2.Premium Economy Class=190000Rs.");
                    System.out.println("3.Business Class=210000Rs.");
                    System.out.println("4.First Class=270000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=150000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=190000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=210000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=270000*ticket_no;
                    }
                }
                else if(airline.equalsIgnoreCase("Vistara")==true || airline.equalsIgnoreCase("4")==true)
                {    
                    airline_id = "VI";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=16000Rs.");
                    System.out.println("2.Premium Economy Class=200000Rs.");
                    System.out.println("3.Business Class=210000Rs.");
                    System.out.println("4.First Class=300000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=160000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=200000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=210000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=300000*ticket_no;
                    }
                }
                System.out.println("total_price="+total_price);
                for(int s =1 ; s<=ticket_no;s++)
                {
                    System.out.println("Ticket number is : "+ airline_id + ticket_count);
                    ticket_count++;
                }
        }
        else if(city1.equalsIgnoreCase("Mumbai")==true && city2.equalsIgnoreCase("Benglor")==true)
        {
            
            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if(airline.equalsIgnoreCase("AirIndia")==true || airline.equalsIgnoreCase("1")==true)
            {    
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5000Rs.");
                System.out.println("2.Premium Economy Class=7000Rs.");
                System.out.println("3.Business Class=8000Rs.");
                System.out.println("4.First Class=10000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no=sc.nextInt();
                    total_price=5000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10000* ticket_no;
                }
            }
            else if(airline.equalsIgnoreCase("SpiceJet")==true || airline.equalsIgnoreCase("2"))
             {    
                airline_id = "SJ";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=5500Rs.");
                    System.out.println("2.Premium Economy Class=7500Rs.");
                    System.out.println("3.Business Class=8500Rs.");
                    System.out.println("4.First Class=10500Rs.");
                    ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no = sc.nextInt();
                        total_price = 5500 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=7500*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8500*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=10500*ticket_no;
                }
                for(int k=1000;k<=ticket_no;k++)
                {
                            System.out.println("ticket_number=SJ"+k);
                }
            }
             else if(airline.equalsIgnoreCase("Indigo")==true || airline.equalsIgnoreCase("3")==true)
            {    
                airline_id = "IG";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=5600Rs.");
                    System.out.println("2.Premium Economy Class=7600Rs.");
                    System.out.println("3.Business Class=8600Rs.");
                    System.out.println("4.First Class=10700Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=5600*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=7600*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8600*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=10700*ticket_no;
                    }
                }
                else if(airline.equalsIgnoreCase("Vistara")==true || airline.equalsIgnoreCase("4")==true)
                {    
                    airline_id = "VI";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=6000Rs.");
                    System.out.println("2.Premium Economy Class=8000Rs.");
                    System.out.println("3.Business Class=9000Rs.");
                    System.out.println("4.First Class=11000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=6000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=9000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=11000*ticket_no;
                    }
                }
                System.out.println("total_price="+total_price);
                for(int s =1 ; s<=ticket_no;s++)
                {
                    System.out.println("Ticket number is : "+ airline_id + ticket_count);
                    ticket_count++;
                }
        }
        else if(city1.equalsIgnoreCase("Benglor")==true && city2.equalsIgnoreCase("Mumbai")==true)
        {
            
            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if(airline.equalsIgnoreCase("AirIndia")==true || airline.equalsIgnoreCase("1")==true)
            {    
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5000Rs.");
                System.out.println("2.Premium Economy Class=7000Rs.");
                System.out.println("3.Business Class=8000Rs.");
                System.out.println("4.First Class=10000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no=sc.nextInt();
                    total_price=5000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10000* ticket_no;
                }
            }
            else if(airline.equalsIgnoreCase("SpiceJet")==true || airline.equalsIgnoreCase("2")==true)
             {    
                airline_id = "SJ";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=5500Rs.");
                    System.out.println("2.Premium Economy Class=7500Rs.");
                    System.out.println("3.Business Class=8500Rs.");
                    System.out.println("4.First Class=10500Rs.");
                    ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no = sc.nextInt();
                        total_price = 5500 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=7500*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8500*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=10500*ticket_no;
                }
                for(int k=1000;k<=ticket_no;k++)
                {
                            System.out.println("ticket_number=SJ"+k);
                }
            }
             else if(airline.equalsIgnoreCase("Indigo")==true || airline.equalsIgnoreCase("3")==true)
            {    
                airline_id = "IG";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=5600Rs.");
                    System.out.println("2.Premium Economy Class=7600Rs.");
                    System.out.println("3.Business Class=8600Rs.");
                    System.out.println("4.First Class=10700Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=5600*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=7600*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8600*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=10700*ticket_no;
                    }
                }
                else if(airline.equalsIgnoreCase("Vistara")==true || airline.equalsIgnoreCase("4"))
                {    
                    airline_id = "VI";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=6000Rs.");
                    System.out.println("2.Premium Economy Class=8000Rs.");
                    System.out.println("3.Business Class=9000Rs.");
                    System.out.println("4.First Class=11000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=6000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=8000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=9000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=11000*ticket_no;
                    }
                }
                System.out.println("total_price="+total_price);
                for(int s =1 ; s<=ticket_no;s++)
                {
                    System.out.println("Ticket number is : "+ airline_id + ticket_count);
                    ticket_count++;
                }
        }
        else if(city1.equalsIgnoreCase("Newyork")==true && city2.equalsIgnoreCase("benglor")==true)
        {
            
            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if(airline.equalsIgnoreCase("AirIndia")==true || airline.equalsIgnoreCase("1")==true)
            {    
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=120000Rs.");
                System.out.println("2.Premium Economy Class=140000Rs.");
                System.out.println("3.Business Class=160000Rs.");
                System.out.println("4.First Class=170000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no=sc.nextInt();
                    total_price=120000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 140000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 160000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 170000* ticket_no;
                }
            }
            else if(airline.equalsIgnoreCase("SpiceJet")==true || airline.equalsIgnoreCase("2")==true)
             {    
                airline_id = "SJ";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=13000Rs.");
                    System.out.println("2.Premium Economy Class=150000Rs.");
                    System.out.println("3.Business Class=180000Rs.");
                    System.out.println("4.First Class=200000Rs.");
                    ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no = sc.nextInt();
                        total_price = 130000* ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=150000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=180000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=200000*ticket_no;
                }
                for(int k=1000;k<=ticket_no;k++)
                {
                            System.out.println("ticket_number=SJ"+k);
                }
            }
             else if(airline.equalsIgnoreCase("Indigo")==true || airline.equalsIgnoreCase("3")==true)
            {    
                airline_id = "IG";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=150000Rs.");
                    System.out.println("2.Premium Economy Class=170000Rs.");
                    System.out.println("3.Business Class=190000Rs.");
                    System.out.println("4.First Class=210000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=150000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=170000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=190000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=210000*ticket_no;
                    }
                }
                else if(airline.equalsIgnoreCase("Vistara")==true || airline.equalsIgnoreCase("4")==true)
                {    
                    airline_id = "VI";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=160000Rs.");
                    System.out.println("2.Premium Economy Class=180000Rs.");
                    System.out.println("3.Business Class=200000Rs.");
                    System.out.println("4.First Class=240000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=160000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=180000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=200000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=240000*ticket_no;
                    }
                }
                System.out.println("total_price="+total_price);
                for(int s =1 ; s<=ticket_no;s++)
                {
                    System.out.println("Ticket number is : "+ airline_id + ticket_count);
                    ticket_count++;
                }
        }
        else if(city1.equalsIgnoreCase("Benglor")==true && city2.equalsIgnoreCase("NewYork")==true)
        {
            
            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if(airline.equalsIgnoreCase("AirIndia")==true || airline.equalsIgnoreCase("1")==true)
            {    
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=120000Rs.");
                System.out.println("2.Premium Economy Class=140000Rs.");
                System.out.println("3.Business Class=160000Rs.");
                System.out.println("4.First Class=170000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no=sc.nextInt();
                    total_price=120000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 140000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 160000 * ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 170000* ticket_no;
                }
            }
            else if(airline.equalsIgnoreCase("SpiceJet")==true || airline.equalsIgnoreCase("2")==true)
             {    
                airline_id = "SJ";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=13000Rs.");
                    System.out.println("2.Premium Economy Class=150000Rs.");
                    System.out.println("3.Business Class=180000Rs.");
                    System.out.println("4.First Class=200000Rs.");
                    ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1") == true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no = sc.nextInt();
                        total_price = 130000* ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=150000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=180000*ticket_no;
                }
                else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=200000*ticket_no;
                }
                for(int k=1000;k<=ticket_no;k++)
                {
                            System.out.println("ticket_number=SJ"+k);
                }
            }
             else if(airline.equalsIgnoreCase("Indigo")==true || airline.equalsIgnoreCase("3")==true)
            {    
                airline_id = "IG";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=150000Rs.");
                    System.out.println("2.Premium Economy Class=170000Rs.");
                    System.out.println("3.Business Class=190000Rs.");
                    System.out.println("4.First Class=210000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=150000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=170000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=190000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=210000*ticket_no;
                    }
                }
                else if(airline.equalsIgnoreCase("Vistara")==true || airline.equalsIgnoreCase("4")==true)
                {    
                    airline_id = "VI";
                    System.out.println("What kind of ticket do you want to book?");
                    System.out.println("1.Economy Class=160000Rs.");
                    System.out.println("2.Premium Economy Class=180000Rs.");
                    System.out.println("3.Business Class=200000Rs.");
                    System.out.println("4.First Class=240000Rs.");
                    ticketclass=sc.nextLine();
                    if(ticketclass.equalsIgnoreCase("Economy Class")==true || ticketclass.equalsIgnoreCase("1")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=160000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Premium Economy Class")==true || ticketclass.equalsIgnoreCase("2")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=180000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("Business Classs")==true || ticketclass.equalsIgnoreCase("3")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=200000*ticket_no;
                    }
                    else if(ticketclass.equalsIgnoreCase("First Class")==true || ticketclass.equalsIgnoreCase("4")==true)
                    {
                        System.out.println("How many tickets do you want to book?");
                        ticket_no=sc.nextInt();
                        total_price=240000*ticket_no;
                    }
                }
                System.out.println("total_price="+total_price);
                for(int s =1 ; s<=ticket_no;s++)
                {
                    System.out.println("Ticket number is : "+ airline_id + ticket_count);
                    ticket_count++;
                }
        }
        else
        {
            System.out.println("Sorry! No fligts are available");
        }
    }
      
}
class Main
{
    public static void main (String[] args) 
    {
        AirportTicket a=new AirportTicket();
        
      
       a.secondset();
    }
}