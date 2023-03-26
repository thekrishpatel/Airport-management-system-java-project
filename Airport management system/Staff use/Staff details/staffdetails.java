import java.util.*;

class staffdetails 
{
    String Staff_name;
    int staff_id;
    String staff_role;

    void staffdata()
    {
        Scanner sc = new Scanner(System.in);
        staffdetails sd[] = new staffdetails[21];
        sd[1] = new staffdetails("Aditi Musunur" , 1 , "ticket &p assport varificationer");
        sd[2] = new staffdetails("Advitiya Sujeet" , 2 , "ticket & passport varificationer");
        sd[3] = new staffdetails("Alagesan Poduri" , 3 , "cafe manager");
        sd[4] = new staffdetails("Amrish Ilyas" , 4 , "hotel manager");
        sd[5] = new staffdetails("Aprativirya Seshan" , 5 , "ticket cancellation manage");
        sd[6] = new staffdetails("Asvathama Ponnada" , 6 , "luggage management head");
        sd[7] = new staffdetails("Avantas Ghosal" , 7 , "luggage management emploee");
        sd[8] = new staffdetails("Barsati Sandipa" , 8 , "Air hostest");
        sd[9] = new staffdetails("Avidosa Vaisakhi" , 9 , "Air hostest");
        sd[10] = new staffdetails("Debasis Sundhararajan" , 10 , "pilot");
        sd[11] = new staffdetails("Devasru Subramanyan" , 11 , "pilot");
        sd[12] = new staffdetails("Dharmadhrt Ramila" , 12 , "pilot");
        sd[13] = new staffdetails("Dhritiman Salim" , 13 , "pilot");
        sd[14] = new staffdetails("Gopa Trilochana" , 14 , "pilot");
        sd[15] = new staffdetails("Hardeep Suksma" , 15 , "Gate 1 Helper");
        sd[16] = new staffdetails("Jayadev Mitali" , 16 , "Gate 2 Helper");
        sd[17] = new staffdetails("Jitendra Choudhary" , 17 , "Gate 3 Helper");
        sd[18] = new staffdetails("Kalyanavata Veerender" , 18 , "Gate 4 Helper");
        sd[19] = new staffdetails("Naveen Tikaram" , 19 , "Gate 5 Helper");
        sd[20] = new staffdetails("Vijai Sritharan" , 20 , "Customer care");
        
        System.out.println("Enter emploee id number : ");
        int id_number = sc.nextInt();
        sd[id_number].display();
        sc.close();
    }

    staffdetails(String name,int id,String role)
    {
        Staff_name =name;
        staff_id = id;
        staff_role = role;
    }
    void display()
    {
        System.out.println("Name of the emploee is : " + Staff_name);
        System.out.println("ID of the emploee is : " + staff_id);
        System.out.println("Role of the emploee is : " + staff_role);
    }
}

class Main
{
    public static void main(String[] args) 
    {
        staffdetails sd = new staffdetails(null, 0, null);
        sd.staffdata();
    }
}