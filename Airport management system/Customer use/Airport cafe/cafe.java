import java.util.*;

class cafe {
    Scanner sc=new Scanner(System.in);
    double a[]={0,90.00, 256.77, 750.99, 55.23, 35.98, 105.56, 70.23, 20.00, 70.23,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    String b[]={" ","Burger"  ,"Pizza", "Hot cake",  "Sandwich",    "Nun Bread ",   "Gtill Sandwich",    "Ice Cream",
                "Cold drinks",   "Tea",  "",  "",  "",  "" };
    int c[]=new int[25];
    int d[]=new int[25];
    int l=10;
    double fix=0;
    double income=0;
    int TC=0;
    String offer;
    double discount;

    void pass()
    {
        income=income+fix;
    }

    int food(int n )
    {
        int p=0;
        if (n == 1)
        {
            if(offer != null)
            {
                System.out.println("      !*********************************!"     );
                System.out.println("           TODAY "+offer+" OFFER IS LIVE"      );
                System.out.println("           "+discount+"% DISCOUNT ANY ITEM"    );
                System.out.println("      !*********************************!"     );

            }
            System.out.println("            *-------MENU--------*                ");
            System.out.println("....................................................");
            System.out.println("Index" + "        " + "Item" + "            " + "price");
            System.out.println("....................................................");
            for(int i = 1; i<l; i++)
            {
                System.out.println(i + "            " +b[i] + "         " +a[i]);
            }
            System.out.println(".....................................................");
            System.out.println("1...order");
            System.out.println("2...Main Menu");
            p=sc.nextInt();
        }


        return p;
    }

    int fooduser(int n )
    {
        int p=0;
        if (n == 67  || n==3 )
        {
            System.out.println("            *-------MENU--------*                ");
            System.out.println("....................................................");
            System.out.println("Index" + "        " + "Item" + "            " + "price");
            System.out.println("....................................................");
            for(int i = 1; i<l; i++)
            {
                System.out.println(i + "            " +b[i] + "         " +a[i]);
            }
            System.out.println(".....................................................");
            System.out.println("1.  Main Menu");
            p=sc.nextInt();
        }


        return p;
    }


    int  order(int n)
    {
        int p=0;
        if(n==1)
        {
            int j=2;
            for(int i=1;i<j ;i++)
            {
                System.out.print("Enter The Food Index Number: ");
                c[i] = sc.nextInt();
                System.out.print("Enter the Quantity:");
                d[i] = sc.nextInt();
                System.out.println("if you add more item");
                System.out.println("1..Yes");
                System.out.println("2..No");
                int d = sc.nextInt();
                if (d == 1)
                {
                    j++;
                }
            }
            double k=0;
            double minus=0;
            System.out.print("Enter Your Name:");
            sc.nextLine();
            String s=sc.nextLine();
            System.out.print("Enter Today Date:");
            int date=sc.nextInt();
            System.out.println("-----------------BILL-----------------");
            System.out.println("name:"+s);
            System.out.println("Date:"+date+"/4/2023");
            System.out.println("------------------------------------");
            for(int i=1;i<j;i++)
            {
                 k=k+ a[c[i]]*d[i];
                System.out.println(c[i]+"    "+d[i]+" * "+b[c[i]]+"     "+a[c[i]]*d[i]  );

            }
            if(discount != 0)
            {
                minus = (k * discount) / 100;
                k=k-minus;
            }
            System.out.println("------------------------------------");
            System.out.println("       Total Amount :"+k+
                             "\n------------------------------------");
            TC++;
            fix=k;
            pass();
            System.out.println("1.  Main Menu");
            p=sc.nextInt();
        }


        return p;
    }

    int admin(int n){
        int ch=0;
        System.out.print("ENTER PASSWORD:");
        int p=sc.nextInt();
        if( p==1234)
        {
            System.out.println("Login succesfull");
            System.out.println("-------------------------------------------------"+
                               "\n1.   New add dish "+"" +
                               "\n2.   Today's Total Income"+
                               "\n3.   List Of Item"+
                               "\n4.   Today's Total No Of customer"+
                               "\n5.   Manage Offer");
            System.out.println("------------------------------------------------");
            System.out.print("Enter your choice:");
            ch=sc.nextInt();

        }
        else
        {
            System.out.println("incorrect details");
        }
        return ch;
    }

    void add(int n)
    {
        int w=0;
        if(n==1)
        {
            System.out.print("Enter Index number:");
            int p=sc.nextInt();
            System.out.print("Enter Item Name:");
            sc.nextLine();
            b[p]=sc.nextLine();
            System.out.print("Enter Item Price:");
            a[p]=sc.nextInt();
            System.out.println("-------------------------------------"+
                               "\n      New Dish add Successfully"+
                               "\n-------------------------------------");
            System.out.println("67. Food List");
            System.out.print("Enter Your Choice otherwise return Main Menu:");
            w=sc.nextInt();
            l++;
        }
        fooduser(w);

    }

    void income(int n)
    {
        if(n==2)
        {
            System.out.println("--------------------------------------------");
            System.out.println("Total Income Today:" + income);
            System.out.println("--------------------------------------------");
        }
    }

   void  customer(int n)
   {
        if (n==4)
        {
            System.out.println("--------------------------------------------");
            System.out.println("TODAY TOTAL NO OF CUSTOMER VISITED ID::"+TC);
            System.out.println("--------------------------------------------");
        }

   }
   void offer(int n)
   {
     if(n==5)
     {
         System.out.print("Today Offer Name:");
         sc.nextLine();
         offer=sc.nextLine();
         System.out.print("\nHow Many Discount Today:");
         discount=sc.nextDouble();
     }
   }
}


class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        cafe cf=new cafe();
        int n=0;
        System.out.println("................................................");
        System.out.println("              Ronny's cafe                      ");
        System.out.println("................................................");
        do {
            System.out.println();
            System.out.println("1....FOOD PART");
            System.out.println("2....ADMIN PANEL");
            System.out.println("3....EXIT");
            System.out.print("Enter Your Choice:");
            n = sc.nextInt();
            if (n == 1)
            {
                int p= cf.food(n);
                cf.order(p);
            }
            if (n == 2)
            {
                int p = cf.admin(n);
                cf.add(p);
                cf.income(p);
                cf.fooduser(p);
                cf.customer(p);
                cf.offer(p);
            }
        }while(n<3);
        System.out.println("I HOPE YOUR DAY IS AS NICE AS YOUR");
        System.out.println("THANK YOU FOR VISIT");
    }

}