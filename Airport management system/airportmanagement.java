import java.util.*;

class airportmanagement extends airportbankaccount {

    Scanner sc = new Scanner(System.in);

    // call function for call all mathods.
    int call() {
        staffdetails sd = new staffdetails();
        System.out.print(
                "1.Flight booking system \n2.Flight information \n3.airportcc \n4.Hotel booking \n5.Cafe \n6.For Staff Usage \n7.Exit \n");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.print("choose option : ");
        int call = sc.nextInt();
        sc.nextLine();
        switch (call) {
            case 1:
                // flight booking mathod
                secondset();
                return 1;
            case 2:
                // flightinformation mathod
                flightinformation();
                return 1;
            case 3:
                // creditcard for airport mathod
                ccdetails();
                return 1;
            case 4:
                // hotel booking mathod
                book_room();
                return 1;
            case 5:
                // airport cafe mathod
                cafe_main();
                return 1;
            case 6:
                // staff use mathod
                int temp_count = 0;
                for (int q = 1; q < 2;) {
                    System.out.print("Enter Official Staff ID : ");
                    String temp_id = sc.nextLine();
                    System.out.print("Enter password : ");
                    String temp_Password = sc.nextLine();
                    if (temp_id.equals(sd.staff_official_id) && temp_Password.equals(sd.password)) {
                        for (int s = 1; s < 2;) {
                            q = 2;
                            System.out.print(
                                    "1.Find emploee details \n2.Airport bank account \n3.Exit \nWhich service do you want to use : ");
                            int service = sc.nextInt();
                            sc.nextLine();
                            switch (service) {
                                case 1:
                                    sd.staffdata();
                                    break;
                                case 2:
                                    for (int b = 1; b < 2;) {
                                        System.out.println(
                                                "--------------------------------------------------------------------------------------");
                                        System.out.print("Enter Account number of the airport bank account : ");
                                        String temp_airport_bank_number = sc.nextLine();
                                        System.out.print("Enter PIN number of the airport bank account : ");
                                        String temp_airport_PIN_number = sc.nextLine();
                                        System.out.println(
                                                "--------------------------------------------------------------------------------------");
                                        for (int y = 1; y < 2;) {
                                            if (temp_airport_bank_number.equalsIgnoreCase(Airport_Account_number)
                                                    || temp_airport_PIN_number.equals(Airport_PIN)) {
                                                System.out.println(
                                                        "--------------------------------------------------------------------------------------");
                                                System.out.println(
                                                        "\n1.Airport bank account details \n2.Airport bank account services \n3.Exit \nWhich service do you want to use : ");
                                                String temp_service = sc.nextLine();
                                                if (temp_service.equalsIgnoreCase("Airport bank account details")
                                                        || temp_service.equalsIgnoreCase("1")) {
                                                    account_details();
                                                } else if (temp_service
                                                        .equalsIgnoreCase("Airport bank account services ")
                                                        || temp_service.equalsIgnoreCase("2")) {
                                                    bank_services();
                                                } else if (temp_service.equalsIgnoreCase("Exit")
                                                        || temp_service.equalsIgnoreCase("3")) {
                                                    y = 2;
                                                    b = 2;
                                                }
                                                System.out.println(
                                                        "--------------------------------------------------------------------------------------");
                                            } else {
                                                System.out.println("Entered account number or password is wrong.");
                                                b = 2;
                                                y = 2;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    s = 2;
                                    break;
                                default:
                                    System.out.println("Select currect option");
                            }
                        }
                    } else {
                        System.out.println(
                                "--------------------------------------------------------------------------------------");
                        if (temp_count < 4) {
                            System.out.println("Entered ID or Password is wrong.  \nPlease try again");
                            temp_count++;
                        } else {
                            System.out.println("Account is blocked for 5 minutes");
                            q = 2;
                        }
                        System.out.println(
                                "--------------------------------------------------------------------------------------");
                    }
                }
                return 1;
            case 7:
                System.out.println("Thank you for using Airport services :)");
                return 2;
            default:
                System.out.println("Select currect option");
        }
        return call;
    }
}

class airportbankaccount extends flightinfo {
    Scanner sc = new Scanner(System.in);
    // official airport account number
    String Airport_Account_number = "AP0123";
    String Airport_account_Name = "Airport Bank account";
    // official airport account pin
    String Airport_PIN = "1234";
    double Airport_bank_balance = 200000000;
    int transiction = 0;

    void account_details() {
        System.out.println("Name of the account is : " + Airport_account_Name);
        System.out.println("Account number of the account is : " + Airport_Account_number);
        System.out.println("Balance of the account is : " + Airport_bank_balance);
        System.out.println("Transiction of the account is : " + transiction);
    }

    void bank_services() {
        System.out.println("1.Withdraw money 2.Add money");
        String service = sc.nextLine();
        if (service.equalsIgnoreCase("Withdraw money") || service.equalsIgnoreCase("1")) {
            System.out.println("How many money do yo want to withdraw : ");
            int amount_withdraw = sc.nextInt();
            if (amount_withdraw < Airport_bank_balance) {
                System.out.println("Money successfully withdrawed.");
                Airport_bank_balance = Airport_bank_balance - amount_withdraw;
            } else {
                System.out.println("Your accound does not have sufficient balance.");
            }
        }
        if (service.equalsIgnoreCase("Add money") || service.equalsIgnoreCase("2")) {
            System.out.println("How many money do yo want to Add : ");
            int amount_add = sc.nextInt();
            System.out.println("Money successfully Added.");
            Airport_bank_balance = Airport_bank_balance + amount_add;
        }
    }
}

class flightinfo extends airportcc {
    int Ahmedabad_flightgate = 1;
    int Mumbai_flightgate = 2;
    int Banglore_flightgate = 3;
    int Canada_flightgate = 4;
    int USA_flightgate = 5;

    void flightinformation() {
        System.out.println("Your Ticket number is : " + ticket_number);
        System.out.println("Your Passport number is : " + passport_number);
        System.out.println("Your Seat class is : " + seat_class);
        if (landing_place.equalsIgnoreCase("Ahmedabad")) {
            System.out.println("Your Flight will arrive at gate number " + Ahmedabad_flightgate);
            System.out.println("You have to go by bus number " + 1);
        }
        if (landing_place.equalsIgnoreCase("Mumbai")) {
            System.out.println("Your Flight will arrive at gate number " + Mumbai_flightgate);
            System.out.println("You have to go by bus number " + 2);
        }
        if (landing_place.equalsIgnoreCase("Banglore")) {
            System.out.println("Your Flight will arrive at gate number " + Banglore_flightgate);
            System.out.println("You have to go by bus number " + 3);
        }
        if (landing_place.equalsIgnoreCase("Canada")) {
            System.out.println("Your Flight will arrive at gate number " + Canada_flightgate);
            System.out.println("You have to go by bus number " + 4);
        }
        if (landing_place.equalsIgnoreCase("USA")) {
            System.out.println("Your Flight will arrive at gate number " + USA_flightgate);
            System.out.println("You have to go by bus number " + 5);
        }
        if (landing_place.equalsIgnoreCase("Canada")) {
            System.out.println("Your Fligh will hold at Dubai for 3 hours");
        }
        if (landing_place.equalsIgnoreCase("USA")) {
            System.out.println("Your Fligh will hold at Mumbai for 1 hour and Dubai for 3 hours");
        }
    }
}

class airportcc extends hotelbooking {
    // default pin for user credit card
    String PIN = "0000";
    String adress = "Ahmedabad";
    int balance = 100000;

    void ccdetails() {
        int temp_count = 0;
        int numberoftransiction = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 2;) {
            System.out
                    .println("--------------------------------------------------------------------------------------");
            System.out.println("Enter your ticket number : ");
            String temp_ticket_number = sc.nextLine();
            System.out.println("Enter your PIN number : ");
            String temp_PIN = sc.nextLine();
            System.out
                    .println("--------------------------------------------------------------------------------------");
            if (temp_ticket_number.equals(ticket_number) && (temp_PIN.equals(PIN))) {
                i = 2;
                System.out.println("Welcome to airport online cashless services :)");
                for (int j = 1; j < 2;) {
                    System.out.println(
                            "1. Withdraw money \n2. Add money \n3. Change PIN \n4. Check Balance \n5. show my account details \n6. Number of transiction \n7. Exit");
                    System.out.print("Which service do you want to use : ");
                    int service = sc.nextInt();
                    switch (service) {
                        case 1:
                            System.out.print("How many Money do you want to withdraw : ");
                            int withdraw_money = sc.nextInt();
                            if (withdraw_money < balance) {
                                balance = balance - withdraw_money;
                                numberoftransiction++;
                                System.out.println("Money successfully withdraw.");
                                break;
                            } else {
                                System.out.println("Your account does not have sufficient balance.");
                                break;
                            }
                        case 2:
                            System.out.print("How many Money do you want to add : ");
                            int add_money = sc.nextInt();
                            balance = balance + add_money;
                            numberoftransiction++;
                            System.out.println("Money successfully added.");
                            break;
                        case 3:
                            System.out.println("Enter your ticket_number : ");
                            String x = sc.nextLine();
                            temp_ticket_number = sc.nextLine();
                            System.out.println("Enter your passport number : ");
                            String temp_passport_number = sc.nextLine();
                            if (temp_ticket_number.equals(ticket_number)
                                    && temp_passport_number.equals(passport_number)) {
                                System.out.println("Enter the new PIN : ");
                                PIN = sc.nextLine();
                                if (PIN.length() == 4 && PIN.matches("[0-9]+")) {
                                    System.out.println("PIN successfully updated.");
                                    break;
                                } else {
                                    System.out.println("Entered PIN does not match conditions.");
                                    break;
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Your Account balance is : " + balance);
                            break;
                        case 5:
                            System.out.println("Your Ticket numbr is : " + ticket_number);
                            System.out.println("Adress of the depositer is : " + adress);
                            System.out.println("Balance of the account is : " + balance);
                            System.out.println("Number of the transictions is : " + numberoftransiction);
                            break;
                        case 6:
                            System.out.println("Number of the transictions is : " + numberoftransiction);
                            break;
                        case 7:
                            j = 2;
                            i = 2;
                            System.out.println("Thanks for using our bank services :)");
                            return;
                    }
                }
            } else {
                if (temp_count < 4) {
                    System.out.println("Entered ticket number or PIN is wrong \nplease try again");
                    temp_count++;
                    i = 1;
                } else {
                    System.out.println("Your account is locked for 15 minutes.");
                    i = 2;
                }
            }
        }
        sc.close();
        System.out.println("--------------------------------------------------------------------------------------");
        return;
    }
}

class hotelbooking extends cafe {
    int total_rooms = 100, temp_room_sb = 1, temp_room_db = 1, temp_room_fb = 1, temp_room_lfb = 1, temp_room_vp = 1;
    int sb_price = 1000, db_price = 1800, fb_price = 2500, lfb_price = 3000, vp_price = 5000;
    String room_number;

    void book_room() {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Enter your last ticket number : ");
        String temp_ticket_number = sc.nextLine();
        if (temp_ticket_number.equals(ticket_number)) {
            System.out.print(
                    " 1.Singal bed \n 2.Double bed \n 3.Family room \n 4.Large family room \n 5.VIP room \n Select bed type : ");
            int selected_type = sc.nextInt();
            switch (selected_type) {
                case 1:
                    System.out.println("Price of the room is : " + sb_price + "\n"
                            + " 1.press 1 for yes \n 2.press 2 for no \n Do you want to buy :");
                    int temp_permission = sc.nextInt();
                    if (temp_permission == 1) {
                        if (temp_room_sb < 31) {
                            if (temp_room_sb < 11) {
                                room_number = "A" + (100 + temp_room_sb);
                                System.out.println("You have alloted room number : " + room_number);
                                temp_room_sb++;
                                System.out.println(
                                        "--------------------------------------------------------------------------------------");
                                return;
                            } else if (temp_room_sb < 21) {
                                room_number = "B" + (100 + temp_room_sb);
                                System.out.println("You have alloted room number : " + room_number);
                                temp_room_sb++;
                                System.out.println(
                                        "--------------------------------------------------------------------------------------");
                                return;
                            } else if (temp_room_sb < 31) {
                                room_number = "C" + (100 + temp_room_sb);
                                System.out.println("You have alloted room number : " + room_number);
                                temp_room_sb++;
                                System.out.println(
                                        "--------------------------------------------------------------------------------------");
                                return;
                            }
                            return;
                        } else {
                            System.out.println("Sorry, All rooms are already full");
                        }
                    } else {
                        System.out.println("Thank you for visit :)");
                    }
                    return;
                case 2:
                    System.out.println("Price of the room is : " + db_price + "\n"
                            + " 1.press 1 for yes \n 2.press 2 for no \n Do you want to buy :");
                    temp_permission = sc.nextInt();
                    if (temp_permission == 1) {
                        if (temp_room_db < 31) {
                            if (temp_room_db < 11) {
                                room_number = "D" + (100 + temp_room_db);
                                System.out.println("You have alloted room number : " + room_number);
                                temp_room_db++;
                                System.out.println(
                                        "--------------------------------------------------------------------------------------");
                                return;
                            } else if (temp_room_db < 21) {
                                room_number = "E" + (100 + temp_room_db);
                                System.out.println("You have alloted room number : " + room_number);
                                temp_room_db++;
                                System.out.println(
                                        "--------------------------------------------------------------------------------------");
                                return;
                            } else if (temp_room_db < 31) {
                                room_number = "F" + (100 + temp_room_db);
                                System.out.println("You have alloted room number : " + room_number);
                                temp_room_db++;
                                System.out.println(
                                        "--------------------------------------------------------------------------------------");
                                return;
                            }
                            return;
                        } else {
                            System.out.println("Sorry, All rooms are already full");
                        }
                    } else {
                        System.out.println("Thank you for visit :)");
                    }
                    return;
                case 3:
                    System.out.println("Price of the room is : " + db_price + "\n"
                            + " 1.press 1 for yes \n 2.press 2 for no \n Do you want to buy :");
                    temp_permission = sc.nextInt();
                    if (temp_permission == 1) {
                        if (temp_room_fb < 21) {
                            if (temp_room_fb < 11) {
                                room_number = "G" + (100 + temp_room_fb);
                                System.out.println("You have alloted room number : " + room_number);
                                temp_room_fb++;
                                System.out.println(
                                        "--------------------------------------------------------------------------------------");
                                return;
                            } else if (temp_room_fb < 21) {
                                room_number = "H" + (100 + temp_room_fb);
                                System.out.println("You have alloted room number : " + room_number);
                                temp_room_fb++;
                                System.out.println(
                                        "--------------------------------------------------------------------------------------");
                                return;
                            }
                            return;
                        } else {
                            System.out.println("Sorry, All rooms are already full");
                        }
                    } else {
                        System.out.println("Thank you for visit :)");
                    }
                    return;
                case 4:
                    System.out.println("Price of the room is : " + db_price + "\n"
                            + " 1.press 1 for yes \n 2.press 2 for no \n Do you want to buy :");
                    temp_permission = sc.nextInt();
                    if (temp_permission == 1) {
                        if (temp_room_lfb < 11) {
                            if (temp_room_lfb < 11) {
                                room_number = "I" + (100 + temp_room_lfb);
                                System.out.println("You have alloted room number : " + room_number);
                                temp_room_lfb++;
                                System.out.println(
                                        "--------------------------------------------------------------------------------------");
                                return;
                            }
                        } else {
                            System.out.println("Sorry, All rooms are already full");
                        }
                    } else {
                        System.out.println("Thank you for visit :)");
                    }
                    return;
                case 5:
                    System.out.print("Price of the room is : " + db_price + "\n"
                            + " 1.press 1 for yes \n 2.press 2 for no \n Do you want to buy :");
                    temp_permission = sc.nextInt();
                    if (temp_permission == 1) {
                        if (temp_room_vp < 11) {
                            if (temp_room_vp < 11) {
                                room_number = "J" + (100 + temp_room_lfb);
                                System.out.println("You have alloted room number : " + room_number);
                                temp_room_vp++;
                                System.out.println(
                                        "--------------------------------------------------------------------------------------");
                                return;
                            }
                        } else {
                            System.out.println("Sorry, All rooms are already full");
                        }
                    } else {
                        System.out.println("Thank you for visit :)");
                    }
                    System.out.println(
                            "--------------------------------------------------------------------------------------");
                    return;
            }
        } else {
            System.out.println("Your ticket number does not match");
        }
        System.out.println("--------------------------------------------------------------------------------------");
        return;
    }
}

class staffdetails {
    String Staff_name;
    int staff_id;
    String staff_role;
    String staff_official_id = "Airport_LJU";
    String password = "LJIET";

    void staffdata() {
        Scanner sc = new Scanner(System.in);
        staffdetails sd[] = new staffdetails[21];
        sd[1] = new staffdetails("Aditi Musunur", 1, "ticket &p assport varificationer");
        sd[2] = new staffdetails("Advitiya Sujeet", 2, "ticket & passport varificationer");
        sd[3] = new staffdetails("Alagesan Poduri", 3, "cafe manager");
        sd[4] = new staffdetails("Amrish Ilyas", 4, "hotel manager");
        sd[5] = new staffdetails("Aprativirya Seshan", 5, "ticket cancellation manage");
        sd[6] = new staffdetails("Asvathama Ponnada", 6, "luggage management head");
        sd[7] = new staffdetails("Avantas Ghosal", 7, "luggage management emploee");
        sd[8] = new staffdetails("Barsati Sandipa", 8, "Air hostest");
        sd[9] = new staffdetails("Avidosa Vaisakhi", 9, "Air hostest");
        sd[10] = new staffdetails("Debasis Sundhararajan", 10, "pilot");
        sd[11] = new staffdetails("Devasru Subramanyan", 11, "pilot");
        sd[12] = new staffdetails("Dharmadhrt Ramila", 12, "pilot");
        sd[13] = new staffdetails("Dhritiman Salim", 13, "pilot");
        sd[14] = new staffdetails("Gopa Trilochana", 14, "pilot");
        sd[15] = new staffdetails("Hardeep Suksma", 15, "Gate 1 Helper");
        sd[16] = new staffdetails("Jayadev Mitali", 16, "Gate 2 Helper");
        sd[17] = new staffdetails("Jitendra Choudhary", 17, "Gate 3 Helper");
        sd[18] = new staffdetails("Kalyanavata Veerender", 18, "Gate 4 Helper");
        sd[19] = new staffdetails("Naveen Tikaram", 19, "Gate 5 Helper");
        sd[20] = new staffdetails("Vijai Sritharan", 20, "Customer care");

        System.out.println("Enter emploee id number : ");
        int id_number = sc.nextInt();
        sd[id_number].display();
        // sc.close();
        return;
    }

    staffdetails() {
    }

    staffdetails(String name, int id, String role) {
        Staff_name = name;
        staff_id = id;
        staff_role = role;
    }

    void display() {
        System.out.println("Name of the emploee is : " + Staff_name);
        System.out.println("ID of the emploee is : " + staff_id);
        System.out.println("Role of the emploee is : " + staff_role);
    }
}

class cafe extends AirportTicket {
    staffdetails sd = new staffdetails();
    Scanner sc = new Scanner(System.in);
    double a[] = { 0, 90.00, 256.77, 750.99, 55.23, 35.98, 105.56, 70.23, 20.00, 70.23,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    String b[] = { " ", "Burger", "Pizza", "Hot cake", "Sandwich", "Nun Bread ", "Gtill Sandwich", "Ice Cream",
            "Cold drinks", "Tea", "", "", "", "" };
    int c[] = new int[25];
    int d[] = new int[25];
    int l = 10;
    double fix = 0;
    double income = 0;
    int TC = 0;
    String offer;
    double discount;

    void pass() {
        income = income + fix;
    }

    int food(int n) {
        int p = 0;
        if (n == 1) {
            if (offer != null) {
                System.out.println("      !*********************************!");
                System.out.println("           TODAY " + offer + " OFFER IS LIVE");
                System.out.println("           " + discount + "% DISCOUNT ANY ITEM");
                System.out.println("      !*********************************!");

            }
            System.out.println("            *-------MENU--------*                ");
            System.out.println("....................................................");
            System.out.println("Index" + "        " + "Item" + "            " + "price");
            System.out.println("....................................................");
            for (int i = 1; i < l; i++) {
                System.out.println(i + "            " + b[i] + "         " + a[i]);
            }
            System.out.println(".....................................................");
            System.out.println("1...order");
            System.out.println("2...Main Menu");
            p = sc.nextInt();
        }

        return p;
    }

    int fooduser(int n) {
        int p = 0;
        if (n == 67 || n == 3) {
            System.out.println("            *-------MENU--------*                ");
            System.out.println("....................................................");
            System.out.println("Index" + "        " + "Item" + "            " + "price");
            System.out.println("....................................................");
            for (int i = 1; i < l; i++) {
                System.out.println(i + "            " + b[i] + "         " + a[i]);
            }
            System.out.println(".....................................................");
            System.out.println("1.  Main Menu");
            p = sc.nextInt();
        }

        return p;
    }

    int order(int n) {
        int p = 0;
        if (n == 1) {
            int j = 2;
            for (int i = 1; i < j; i++) {
                System.out.print("Enter The Food Index Number: ");
                c[i] = sc.nextInt();
                System.out.print("Enter the Quantity:");
                d[i] = sc.nextInt();
                System.out.println("if you add more item");
                System.out.println("1..Yes");
                System.out.println("2..No");
                int d = sc.nextInt();
                if (d == 1) {
                    j++;
                }
            }
            double k = 0;
            double minus = 0;
            System.out.print("Enter Your Name:");
            sc.nextLine();
            String s = sc.nextLine();
            System.out.print("Enter Today Date:");
            int date = sc.nextInt();
            System.out.println("-----------------BILL-----------------");
            System.out.println("name:" + s);
            System.out.println("Date:" + date + "/4/2023");
            System.out.println("------------------------------------");
            for (int i = 1; i < j; i++) {
                k = k + a[c[i]] * d[i];
                System.out.println(c[i] + "    " + d[i] + " * " + b[c[i]] + "     " + a[c[i]] * d[i]);

            }
            if (discount != 0) {
                minus = (k * discount) / 100;
                k = k - minus;
            }
            System.out.println("------------------------------------");
            System.out.println("       Total Amount :" + k +
                    "\n------------------------------------");
            TC++;
            fix = k;
            pass();
            System.out.println("1.  Main Menu");
            p = sc.nextInt();
        }

        return p;
    }

    int admin(int n) {
        int ch = 0;
        System.out.print("ENTER AIRPORT OFFICIAL PASSWORD:");
        sc.nextLine();
        String temp_pass = sc.nextLine();
        if (temp_pass.equals(sd.password)) {
            System.out.println("Login succesfull");
            System.out.println("-------------------------------------------------" +
                    "\n1.   New add dish " + "" +
                    "\n2.   Today's Total Income" +
                    "\n3.   List Of Item" +
                    "\n4.   Today's Total No Of customer" +
                    "\n5.   Manage Offer");
            System.out.println("------------------------------------------------");
            System.out.print("Enter your choice:");
            ch = sc.nextInt();

        } else {
            System.out.println("incorrect details");
        }
        return ch;
    }

    void add(int n) {
        int w = 0;
        if (n == 1) {
            System.out.print("Enter Index number:");
            int p = sc.nextInt();
            System.out.print("Enter Item Name:");
            sc.nextLine();
            b[p] = sc.nextLine();
            System.out.print("Enter Item Price:");
            a[p] = sc.nextInt();
            System.out.println("-------------------------------------" +
                    "\n      New Dish add Successfully" +
                    "\n-------------------------------------");
            System.out.println("67. Food List");
            System.out.print("Enter Your Choice otherwise return Main Menu:");
            w = sc.nextInt();
            l++;
        }
        fooduser(w);

    }

    void income(int n) {
        if (n == 2) {
            System.out.println("--------------------------------------------");
            System.out.println("Total Income Today:" + income);
            System.out.println("--------------------------------------------");
        }
    }

    void customer(int n) {
        if (n == 4) {
            System.out.println("--------------------------------------------");
            System.out.println("TODAY TOTAL NO OF CUSTOMER VISITED ID::" + TC);
            System.out.println("--------------------------------------------");
        }

    }

    void offer(int n) {
        if (n == 5) {
            System.out.print("Today Offer Name:");
            sc.nextLine();
            offer = sc.nextLine();
            System.out.print("\nHow Many Discount Today:");
            discount = sc.nextDouble();
        }
    }

    void cafe_main() {
        int n = 0;
        System.out.println("................................................");
        System.out.println("              Airport's cafe                      ");
        System.out.println("................................................");
        do {
            System.out.println();
            System.out.println("1....FOOD PART");
            System.out.println("2....ADMIN PANEL");
            System.out.println("3....EXIT");
            System.out.print("Enter Your Choice:");
            n = sc.nextInt();
            if (n == 1) {
                int p = food(n);
                order(p);
            }
            if (n == 2) {
                int p = admin(n);
                add(p);
                income(p);
                fooduser(p);
                customer(p);
                offer(p);
            }
        } while (n < 3);
        System.out.println("I HOPE YOUR DAY IS AS NICE AS YOUR");
        System.out.println("THANK YOU FOR VISIT");
    }
}

class AirportTicket {
    String takeoff_place, landing_place, ticketclass, airline, seat_class, passport_number;
    int p, n, ticket_no;
    long total_price;
    int ticket_count = 1000;
    String airline_id, ticket_number;
    Scanner sc = new Scanner(System.in);

    void secondset() {
        System.out.println("Enter your Pasport Number : ");
        passport_number = sc.nextLine();
        System.out.println("Which city are you from?");
        takeoff_place = sc.nextLine();
        System.out.println("Where do you want to go?");
        landing_place = sc.nextLine();
        if (takeoff_place.equalsIgnoreCase("Ahmedabad") == true && landing_place.equalsIgnoreCase("Mumbai") == true) {
            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if (airline.equalsIgnoreCase("AirIndia") == true || airline.equalsIgnoreCase("1") == true) {
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5000Rs.");
                System.out.println("2.Premium Economy Class=6000Rs.");
                System.out.println("3.Business Class=8000Rs.");
                System.out.println("4.First Class=10000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("SpiceJet") == true || airline.equalsIgnoreCase("2") == true) {
                airline_id = "SJ";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5500Rs.");
                System.out.println("2.Premium Economy Class=6500Rs.");
                System.out.println("3.Business Class=8500Rs.");
                System.out.println("4.First Class=10500Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10500 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Indigo") == true || airline.equalsIgnoreCase("3")) {
                airline_id = "IG";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5000Rs.");
                System.out.println("2.Premium Economy Class=6050Rs.");
                System.out.println("3.Business Class=8050Rs.");
                System.out.println("4.First Class=10050Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6050 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8050 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10050 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Vistara") == true || airline.equalsIgnoreCase("4") == true) {
                airline_id = "VI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5000Rs.");
                System.out.println("2.Premium Economy Class=6800Rs.");
                System.out.println("3.Business Class=8800Rs.");
                System.out.println("4.First Class=11000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5800 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6800 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Class") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8800 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11000 * ticket_no;
                }
            }
            System.out.println("total_price=" + total_price);
            for (int s = 1; s <= ticket_no; s++) {
                System.out.println("Ticket number is : " + airline_id + ticket_count);
                ticket_number = airline_id + ticket_count;
                ticket_count++;
            }
        }

        else if (takeoff_place.equalsIgnoreCase("Mumbai") == true
                && landing_place.equalsIgnoreCase("Ahmedabad") == true) {

            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if (airline.equalsIgnoreCase("AirIndia") == true || airline.equalsIgnoreCase("1") == true) {
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5000Rs.");
                System.out.println("2.Premium Economy Class=6000Rs.");
                System.out.println("3.Business Class=8000Rs.");
                System.out.println("4.First Class=10000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("SpiceJet") == true || airline.equalsIgnoreCase("2") == true) {
                airline_id = "SJ";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5500Rs.");
                System.out.println("2.Premium Economy Class=6500Rs.");
                System.out.println("3.Business Class=8500Rs.");
                System.out.println("4.First Class=10500Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10500 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Indigo") == true || airline.equalsIgnoreCase("3") == true) {
                airline_id = "IG";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5000Rs.");
                System.out.println("2.Premium Economy Class=6050Rs.");
                System.out.println("3.Business Class=8050Rs.");
                System.out.println("4.First Class=10050Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6050 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8050 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10050 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Vistara") == true || airline.equalsIgnoreCase("4") == true) {
                airline_id = "VI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5000Rs.");
                System.out.println("2.Premium Economy Class=6800Rs.");
                System.out.println("3.Business Class=8800Rs.");
                System.out.println("4.First Class=11000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5800 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6800 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8800 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11000 * ticket_no;
                }
            }
            System.out.println("total_price=" + total_price);
            for (int s = 1; s <= ticket_no; s++) {
                System.out.println("Ticket number is : " + airline_id + ticket_count);
                ticket_number = airline_id + ticket_count;
                ticket_count++;
            }
        } else if (takeoff_place.equalsIgnoreCase("Ahmedabad") == true
                && landing_place.equalsIgnoreCase("Delhi") == true) {

            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if (airline.equalsIgnoreCase("AirIndia") == true || airline.equalsIgnoreCase("1") == true) {
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5999Rs.");
                System.out.println("2.Premium Economy Class=6590Rs.");
                System.out.println("3.Business Class=8700Rs.");
                System.out.println("4.First Class=11000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5999 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6590 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8700 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("SpiceJet") == true || airline.equalsIgnoreCase("2") == true) {
                airline_id = "SJ";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=6600Rs.");
                System.out.println("2.Premium Economy Class=7700Rs.");
                System.out.println("3.Business Class=8500Rs.");
                System.out.println("4.First Class=12000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6600 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7700 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 12000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Indigo") == true || airline.equalsIgnoreCase("3") == true) {
                airline_id = "IG";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5900Rs.");
                System.out.println("2.Premium Economy Class=7000Rs.");
                System.out.println("3.Business Class=9050Rs.");
                System.out.println("4.First Class=13000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5900 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 9000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 13000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Vistara") == true || airline.equalsIgnoreCase("4") == true) {
                airline_id = "VI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5000Rs.");
                System.out.println("2.Premium Economy Class=6800Rs.");
                System.out.println("3.Business Class=8800Rs.");
                System.out.println("4.First Class=11000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 80000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 15000 * ticket_no;
                }
            }
            System.out.println("total_price=" + total_price);
            for (int s = 1; s <= ticket_no; s++) {
                System.out.println("Ticket number is : " + airline_id + ticket_count);
                ticket_number = airline_id + ticket_count;
                ticket_count++;
            }
        } else if (takeoff_place.equalsIgnoreCase("Delhi") == true
                && landing_place.equalsIgnoreCase("Ahmedabad") == true) {

            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if (airline.equalsIgnoreCase("AirIndia") == true || airline.equalsIgnoreCase("1") == true) {
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5999Rs.");
                System.out.println("2.Premium Economy Class=6590Rs.");
                System.out.println("3.Business Class=8700Rs.");
                System.out.println("4.First Class=11000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5999 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6590 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8700 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("SpiceJet") == true || airline.equalsIgnoreCase("2") == true) {
                airline_id = "SJ";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=6600Rs.");
                System.out.println("2.Premium Economy Class=7700Rs.");
                System.out.println("3.Business Class=8500Rs.");
                System.out.println("4.First Class=12000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6600 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7700 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 12000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Indigo") == true || airline.equalsIgnoreCase("3") == true) {
                airline_id = "IG";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5900Rs.");
                System.out.println("2.Premium Economy Class=7000Rs.");
                System.out.println("3.Business Class=9050Rs.");
                System.out.println("4.First Class=13000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5900 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 9000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 13000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Vistara") == true || airline.equalsIgnoreCase("4") == true) {
                airline_id = "VI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5000Rs.");
                System.out.println("2.Premium Economy Class=6800Rs.");
                System.out.println("3.Business Class=8800Rs.");
                System.out.println("4.First Class=11000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 15000 * ticket_no;
                }
            }
            System.out.println("total_price=" + total_price);
            for (int s = 1; s <= ticket_no; s++) {
                System.out.println("Ticket number is : " + airline_id + ticket_count);
                ticket_number = airline_id + ticket_count;
                ticket_count++;
            }
        } else if (takeoff_place.equalsIgnoreCase("Ahmedabad") == true
                && landing_place.equalsIgnoreCase("KOlkata") == true) {

            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if (airline.equalsIgnoreCase("AirIndia") == true || airline.equalsIgnoreCase("1") == true) {
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=7000Rs.");
                System.out.println("2.Premium Economy Class=9000Rs.");
                System.out.println("3.Business Class=11000Rs.");
                System.out.println("4.First Class=13000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 9000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 13000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("SpiceJet") == true || airline.equalsIgnoreCase("2") == true) {
                airline_id = "SJ";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=7300Rs.");
                System.out.println("2.Premium Economy Class=8300Rs.");
                System.out.println("3.Business Class=10300Rs.");
                System.out.println("4.First Class=12300Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7300 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 9300 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10300 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 12300 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Indigo") == true || airline.equalsIgnoreCase("3") == true) {
                airline_id = "IG";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=7500Rs.");
                System.out.println("2.Premium Economy Class=9500Rs.");
                System.out.println("3.Business Class=11500Rs.");
                System.out.println("4.First Class=12500Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 9500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 12500 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Vistara") == true || airline.equalsIgnoreCase("4") == true) {
                airline_id = "VI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=8000Rs.");
                System.out.println("2.Premium Economy Class=10000Rs.");
                System.out.println("3.Business Class=11000Rs.");
                System.out.println("4.First Class=13000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 13000 * ticket_no;
                }
            }
            System.out.println("total_price=" + total_price);
            for (int s = 1; s <= ticket_no; s++) {
                System.out.println("Ticket number is : " + airline_id + ticket_count);
                ticket_number = airline_id + ticket_count;
                ticket_count++;
            }

        } else if (takeoff_place.equalsIgnoreCase("Kolkata") == true
                && landing_place.equalsIgnoreCase("Ahmedabad") == true) {

            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if (airline.equalsIgnoreCase("AirIndia") == true || airline.equalsIgnoreCase("1") == true) {
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=7000Rs.");
                System.out.println("2.Premium Economy Class=9000Rs.");
                System.out.println("3.Business Class=11000Rs.");
                System.out.println("4.First Class=13000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 9000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 13000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("SpiceJet") == true || airline.equalsIgnoreCase("2") == true) {
                airline_id = "SJ";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=7300Rs.");
                System.out.println("2.Premium Economy Class=8300Rs.");
                System.out.println("3.Business Class=10300Rs.");
                System.out.println("4.First Class=12300Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7300 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 9300 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10300 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 12300 * ticket_no;
                }
                for (int k = 1000; k <= ticket_no; k++) {
                    System.out.println("ticket_number=SJ" + k);
                }
            } else if (airline.equalsIgnoreCase("Indigo") == true || airline.equalsIgnoreCase("3") == true) {
                airline_id = "IG";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=7500Rs.");
                System.out.println("2.Premium Economy Class=9500Rs.");
                System.out.println("3.Business Class=11500Rs.");
                System.out.println("4.First Class=12500Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 9500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 12500 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Vistara") == true || airline.equalsIgnoreCase("4") == true) {
                airline_id = "VI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=8000Rs.");
                System.out.println("2.Premium Economy Class=10000Rs.");
                System.out.println("3.Business Class=11000Rs.");
                System.out.println("4.First Class=13000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 13000 * ticket_no;
                }
            }
            System.out.println("total_price=" + total_price);
            for (int s = 1; s <= ticket_no; s++) {
                System.out.println("Ticket number is : " + airline_id + ticket_count);
                ticket_number = airline_id + ticket_count;
                ticket_count++;
            }
        } else if (takeoff_place.equalsIgnoreCase("Ahmedabad") == true
                && landing_place.equalsIgnoreCase("Tronto") == true) {

            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if (airline.equalsIgnoreCase("AirIndia") == true || airline.equalsIgnoreCase("1") == true) {
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=100000Rs.");
                System.out.println("2.Premium Economy Class=150000Rs.");
                System.out.println("3.Business Class=200000Rs.");
                System.out.println("4.First Class=250000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 100000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 150000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 200000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 250000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("SpiceJet") == true || airline.equalsIgnoreCase("2") == true) {
                airline_id = "SJ";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=120000Rs.");
                System.out.println("2.Premium Economy Class=170000Rs.");
                System.out.println("3.Business Class=200000Rs.");
                System.out.println("4.First Class=250000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 120000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 170000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 200000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 250000 * ticket_no;
                }
                for (int k = 1000; k <= ticket_no; k++) {
                    System.out.println("ticket_number=SJ" + k);
                }
            } else if (airline.equalsIgnoreCase("Indigo") == true || airline.equalsIgnoreCase("3") == true) {
                airline_id = "IG";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=150000Rs.");
                System.out.println("2.Premium Economy Class=190000Rs.");
                System.out.println("3.Business Class=210000Rs.");
                System.out.println("4.First Class=270000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {

                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 150000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 190000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 210000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 270000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Vistara") == true || airline.equalsIgnoreCase("4")) {
                airline_id = "VI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=16000Rs.");
                System.out.println("2.Premium Economy Class=200000Rs.");
                System.out.println("3.Business Class=210000Rs.");
                System.out.println("4.First Class=300000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 160000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 200000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 210000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 300000 * ticket_no;
                }
            }
            System.out.println("total_price=" + total_price);
            for (int s = 1; s <= ticket_no; s++) {
                System.out.println("Ticket number is : " + airline_id + ticket_count);
                ticket_number = airline_id + ticket_count;
                ticket_count++;
            }
        } else if (takeoff_place.equalsIgnoreCase("Tronto") == true
                && landing_place.equalsIgnoreCase("Ahmedabad") == true) {

            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if (airline.equalsIgnoreCase("AirIndia") == true || airline.equalsIgnoreCase("1") == true) {
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=100000Rs.");
                System.out.println("2.Premium Economy Class=150000Rs.");
                System.out.println("3.Business Class=200000Rs.");
                System.out.println("4.First Class=250000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 100000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 150000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 200000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 250000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("SpiceJet") == true || airline.equalsIgnoreCase("2") == true) {
                airline_id = "SJ";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=120000Rs.");
                System.out.println("2.Premium Economy Class=170000Rs.");
                System.out.println("3.Business Class=200000Rs.");
                System.out.println("4.First Class=250000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 120000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 170000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 200000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 250000 * ticket_no;
                }
                for (int k = 1000; k <= ticket_no; k++) {
                    System.out.println("ticket_number=SJ" + k);
                }
            } else if (airline.equalsIgnoreCase("Indigo") == true || airline.equalsIgnoreCase("3") == true) {
                airline_id = "IG";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=150000Rs.");
                System.out.println("2.Premium Economy Class=190000Rs.");
                System.out.println("3.Business Class=210000Rs.");
                System.out.println("4.First Class=270000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 150000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 190000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 210000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 270000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Vistara") == true || airline.equalsIgnoreCase("4") == true) {
                airline_id = "VI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=16000Rs.");
                System.out.println("2.Premium Economy Class=200000Rs.");
                System.out.println("3.Business Class=210000Rs.");
                System.out.println("4.First Class=300000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 160000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 200000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 210000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 300000 * ticket_no;
                }
            }
            System.out.println("total_price=" + total_price);
            for (int s = 1; s <= ticket_no; s++) {
                System.out.println("Ticket number is : " + airline_id + ticket_count);
                ticket_number = airline_id + ticket_count;
                ticket_count++;
            }
        } else if (takeoff_place.equalsIgnoreCase("Mumbai") == true
                && landing_place.equalsIgnoreCase("Benglor") == true) {

            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if (airline.equalsIgnoreCase("AirIndia") == true || airline.equalsIgnoreCase("1") == true) {
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5000Rs.");
                System.out.println("2.Premium Economy Class=7000Rs.");
                System.out.println("3.Business Class=8000Rs.");
                System.out.println("4.First Class=10000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("SpiceJet") == true || airline.equalsIgnoreCase("2")) {
                airline_id = "SJ";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5500Rs.");
                System.out.println("2.Premium Economy Class=7500Rs.");
                System.out.println("3.Business Class=8500Rs.");
                System.out.println("4.First Class=10500Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10500 * ticket_no;
                }
                for (int k = 1000; k <= ticket_no; k++) {
                    System.out.println("ticket_number=SJ" + k);
                }
            } else if (airline.equalsIgnoreCase("Indigo") == true || airline.equalsIgnoreCase("3") == true) {
                airline_id = "IG";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5600Rs.");
                System.out.println("2.Premium Economy Class=7600Rs.");
                System.out.println("3.Business Class=8600Rs.");
                System.out.println("4.First Class=10700Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5600 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7600 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8600 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10700 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Vistara") == true || airline.equalsIgnoreCase("4") == true) {
                airline_id = "VI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=6000Rs.");
                System.out.println("2.Premium Economy Class=8000Rs.");
                System.out.println("3.Business Class=9000Rs.");
                System.out.println("4.First Class=11000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 9000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11000 * ticket_no;
                }
            }
            System.out.println("total_price=" + total_price);
            for (int s = 1; s <= ticket_no; s++) {
                System.out.println("Ticket number is : " + airline_id + ticket_count);
                ticket_number = airline_id + ticket_count;
                ticket_count++;
            }
        } else if (takeoff_place.equalsIgnoreCase("Benglor") == true
                && landing_place.equalsIgnoreCase("Mumbai") == true) {

            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if (airline.equalsIgnoreCase("AirIndia") == true || airline.equalsIgnoreCase("1") == true) {
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5000Rs.");
                System.out.println("2.Premium Economy Class=7000Rs.");
                System.out.println("3.Business Class=8000Rs.");
                System.out.println("4.First Class=10000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("SpiceJet") == true || airline.equalsIgnoreCase("2") == true) {
                airline_id = "SJ";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5500Rs.");
                System.out.println("2.Premium Economy Class=7500Rs.");
                System.out.println("3.Business Class=8500Rs.");
                System.out.println("4.First Class=10500Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8500 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10500 * ticket_no;
                }
                for (int k = 1000; k <= ticket_no; k++) {
                    System.out.println("ticket_number=SJ" + k);
                }
            } else if (airline.equalsIgnoreCase("Indigo") == true || airline.equalsIgnoreCase("3") == true) {
                airline_id = "IG";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=5600Rs.");
                System.out.println("2.Premium Economy Class=7600Rs.");
                System.out.println("3.Business Class=8600Rs.");
                System.out.println("4.First Class=10700Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 5600 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 7600 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8600 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 10700 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Vistara") == true || airline.equalsIgnoreCase("4")) {
                airline_id = "VI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=6000Rs.");
                System.out.println("2.Premium Economy Class=8000Rs.");
                System.out.println("3.Business Class=9000Rs.");
                System.out.println("4.First Class=11000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 6000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 8000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 9000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 11000 * ticket_no;
                }
            }
            System.out.println("total_price=" + total_price);
            for (int s = 1; s <= ticket_no; s++) {
                System.out.println("Ticket number is : " + airline_id + ticket_count);
                ticket_count++;
            }
        } else if (takeoff_place.equalsIgnoreCase("Newyork") == true
                && landing_place.equalsIgnoreCase("benglor") == true) {

            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if (airline.equalsIgnoreCase("AirIndia") == true || airline.equalsIgnoreCase("1") == true) {
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=120000Rs.");
                System.out.println("2.Premium Economy Class=140000Rs.");
                System.out.println("3.Business Class=160000Rs.");
                System.out.println("4.First Class=170000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 120000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 140000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 160000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 170000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("SpiceJet") == true || airline.equalsIgnoreCase("2") == true) {
                airline_id = "SJ";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=13000Rs.");
                System.out.println("2.Premium Economy Class=150000Rs.");
                System.out.println("3.Business Class=180000Rs.");
                System.out.println("4.First Class=200000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 130000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 150000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 180000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 200000 * ticket_no;
                }
                for (int k = 1000; k <= ticket_no; k++) {
                    System.out.println("ticket_number=SJ" + k);
                }
            } else if (airline.equalsIgnoreCase("Indigo") == true || airline.equalsIgnoreCase("3") == true) {
                airline_id = "IG";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=150000Rs.");
                System.out.println("2.Premium Economy Class=170000Rs.");
                System.out.println("3.Business Class=190000Rs.");
                System.out.println("4.First Class=210000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 150000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 170000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 190000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 210000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Vistara") == true || airline.equalsIgnoreCase("4") == true) {
                airline_id = "VI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=160000Rs.");
                System.out.println("2.Premium Economy Class=180000Rs.");
                System.out.println("3.Business Class=200000Rs.");
                System.out.println("4.First Class=240000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 160000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 180000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 200000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 240000 * ticket_no;
                }
            }
            System.out.println("total_price=" + total_price);
            for (int s = 1; s <= ticket_no; s++) {
                System.out.println("Ticket number is : " + airline_id + ticket_count);
                ticket_count++;
            }
        } else if (takeoff_place.equalsIgnoreCase("Benglor") == true
                && landing_place.equalsIgnoreCase("NewYork") == true) {

            System.out.println("Which airline do you want to fly with?");
            System.out.println("1.AirIndia");
            System.out.println("2.SpiceJet");
            System.out.println("3.Indigo");
            System.out.println("4.Vistara");
            airline = sc.nextLine();
            if (airline.equalsIgnoreCase("AirIndia") == true || airline.equalsIgnoreCase("1") == true) {
                airline_id = "AI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=120000Rs.");
                System.out.println("2.Premium Economy Class=140000Rs.");
                System.out.println("3.Business Class=160000Rs.");
                System.out.println("4.First Class=170000Rs");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 120000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 140000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 160000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 170000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("SpiceJet") == true || airline.equalsIgnoreCase("2") == true) {
                airline_id = "SJ";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=13000Rs.");
                System.out.println("2.Premium Economy Class=150000Rs.");
                System.out.println("3.Business Class=180000Rs.");
                System.out.println("4.First Class=200000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 130000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 150000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 180000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 200000 * ticket_no;
                }
                for (int k = 1000; k <= ticket_no; k++) {
                    System.out.println("ticket_number=SJ" + k);
                }
            } else if (airline.equalsIgnoreCase("Indigo") == true || airline.equalsIgnoreCase("3") == true) {
                airline_id = "IG";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=150000Rs.");
                System.out.println("2.Premium Economy Class=170000Rs.");
                System.out.println("3.Business Class=190000Rs.");
                System.out.println("4.First Class=210000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 150000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 170000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 190000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 210000 * ticket_no;
                }
            } else if (airline.equalsIgnoreCase("Vistara") == true || airline.equalsIgnoreCase("4") == true) {
                airline_id = "VI";
                System.out.println("What kind of ticket do you want to book?");
                System.out.println("1.Economy Class=160000Rs.");
                System.out.println("2.Premium Economy Class=180000Rs.");
                System.out.println("3.Business Class=200000Rs.");
                System.out.println("4.First Class=240000Rs.");
                ticketclass = sc.nextLine();
                if (ticketclass.equalsIgnoreCase("Economy Class") == true
                        || ticketclass.equalsIgnoreCase("1") == true) {
                    seat_class = "Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 160000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Premium Economy Class") == true
                        || ticketclass.equalsIgnoreCase("2") == true) {
                    seat_class = "Premium Economy Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 180000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("Business Classs") == true
                        || ticketclass.equalsIgnoreCase("3") == true) {
                    seat_class = "Business Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 200000 * ticket_no;
                } else if (ticketclass.equalsIgnoreCase("First Class") == true
                        || ticketclass.equalsIgnoreCase("4") == true) {
                    seat_class = "First Class";
                    System.out.println("How many tickets do you want to book?");
                    ticket_no = sc.nextInt();
                    total_price = 240000 * ticket_no;
                }
            }
            System.out.println("total_price=" + total_price);
            for (int s = 1; s <= ticket_no; s++) {
                System.out.println("Ticket number is : " + airline_id + ticket_count);
                ticket_number = airline_id + ticket_count;
                ticket_count++;
            }
        } else {
            System.out.println("Sorry! No fligts are available");
        }
    }

}

class Main {
    public static void main(String[] args) {
        airportmanagement ap = new airportmanagement();
        for (int i = 1; i < 2;) {
            i = ap.call();
        }
    }
}