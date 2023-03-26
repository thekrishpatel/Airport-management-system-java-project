import java.util.Scanner;

class airportcc 
{
    String ticket_number = "kp011";
    String PIN = "0000";
    String adress = "Ahmedabad";
    int balance = 1000;
    String passport_number = "p0112004";
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
                            "1. Withdraw money \n2. Add money \n3. Change PIN \n4. Check Balance \n5. show my account details \n6. Number of transiction \n7. Currency exchange  \n8. Exit");
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

                            break;
                        case 8:
                            System.out.println("Thanks for using our bank services :)");
                            j=2;
                            sc.close();
                            break;
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

class Main
{
    public static void main(String[] args) 
    {
        airportcc ac = new airportcc();
        ac.ccdetails();
    }
}