import java.util.*;

class airportbankaccount 
{
    Scanner sc = new Scanner(System.in);
    String Airport_Account_number="AP0123";
    String Airport_account_Name = "Airport Bank account";
    String Airport_PIN = "1234";
    double Airport_bank_balance = 200000000;
    int transiction = 0;
    void account_details()
    {
        System.out.println("Name of the account is : " + Airport_account_Name);
        System.out.println("Account number of the account is : " + Airport_Account_number);
        System.out.println("Balance of the account is : " + Airport_bank_balance);
        System.out.println("Transiction of the account is : " + transiction);
    }
    void bank_services()
    {
        System.out.println("1.Withdraw money 2.Add money");
        String service = sc.nextLine();
        if(service.equalsIgnoreCase("Withdraw money") || service.equalsIgnoreCase("1"))
        {
            System.out.println("How many money do yo want to withdraw : ");
            int amount_withdraw = sc.nextInt();
            if(amount_withdraw<Airport_bank_balance)
            {
                System.out.println("Money successfully withdrawed.");
                Airport_bank_balance = Airport_bank_balance-amount_withdraw;
            }
            else
            {
                System.out.println("Your accound does not have sufficient balance.");
            }
        }
        if(service.equalsIgnoreCase("Add money") || service.equalsIgnoreCase("2"))
        {
            System.out.println("How many money do yo want to Add : ");
            int amount_add = sc.nextInt();
                System.out.println("Money successfully Added.");
                Airport_bank_balance =Airport_bank_balance + amount_add;
        }
    }
}

class Main
{
    public static void main(String[] args) 
    {
        airportbankaccount ab = new airportbankaccount();
        ab.account_details();
        ab.bank_services();
    }
}