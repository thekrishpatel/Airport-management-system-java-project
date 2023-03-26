import java.util.*;

class hotelbooking {
    String ticket_number = "kp011";
    Scanner sc = new Scanner(System.in);
    int total_rooms = 100, temp_room_sb = 1, temp_room_db = 1, temp_room_fb = 1, temp_room_lfb = 1, temp_room_vp = 1;
    int sb_price = 1000, db_price = 1800, fb_price = 2500, lfb_price = 3000, vp_price = 5000;
    String room_number;

    void book_room() {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Enter your ticket number : ");
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

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hotelbooking hb = new hotelbooking();
        hb.book_room();
        sc.close();
    }
}