import java.io.*;
public class CONTROL extends sides
{
    int totalamount=0;
    double gstamount;
    static String name;
    static long phone;
    static int c,c1,c2,c3,c4,c5;
    void welcome()throws IOException, InterruptedException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        CONTROL o=new CONTROL();
        String wel="Welcome to PizzaHut!!!\n";
        System.out.print("\n\n\n\n\n\t\t\t\t\t      ");
        for(int i=0;i<wel.length();i++)
        {
            char ch=wel.charAt(i);
            Thread.sleep(50);
            System.out.print(ch);
        }
        System.out.println();
        o.fp("PIZZA HUT,Inc.,is an Indian multinational pizza restaurent chain founded in 2018. Since 2018\nWe have been serving the best pizzas.\n\nHope you as well enjoy our pizzas.");
        Thread.sleep(5000);
        System.out.println("\f");
        o.fp("Enter the Name of the Customer.");
        name=in.readLine();
        o.fp("Enter Phone Number.");
        int a=0;
        while(a==0)
        {
            try
            {
                phone=Long.parseLong(in.readLine());
                a=1;
            }
            catch(Exception e)
            {
                o.fp("Enter a valid Number.");
            }
        }
        o.f("\f");
        o.load();
    }

    void start()throws IOException, InterruptedException 
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        CONTROL o=new  CONTROL();
        o.fp("Press Enter to order.");
        String b=in.readLine();
        o.fp("\f");
        o.err("Customer name:- "+name+"\nPhone Number:- "+phone);
        o.fp("Hi!! "+name);
        o.fp("Enter 1 for Sides.");
        o.fp("Enter 2 for Beverages.");
        o.fp("Enter 3 for VegPizza.");
        o.fp("Enter 4 for Non-Veg Pizza.");
        o.fp("Enter 5 for Desserts.");
        o.fp("Enter 6 to go forward with Billing Process.");
        int n=Integer.parseInt(in.readLine());
        if(n<=6)
        {
            c=n;
        }
        else
        {
            System.out.println("Enter a valid choice");
            c=Integer.parseInt(in.readLine());
        }
        if(c==1)
        {   
            o.Sides();
            c1=1;
        }
        else if(c==2)
        {
            o.Beverages();
            c2=1;
        }
        else if(c==3)
        {
            o.VegPizza();
            c3=1;
        }
        else if(c==4)
        {
            o.Nonveg();
            c4=1;
        }
        else if(c==5)
        {
            o.Desserts();
            c5=1;
        }
        else if(c==6)
            o.exit();
    }

    void BILL()throws InterruptedException 
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        CONTROL o=new  CONTROL();
        vegpizza p=new vegpizza();
        o.load();
        o.fp("\t\t\t\t    ***************BILL***************\n\n");
        o.fp("\t\t\t\t\t\tPIZZA HUT\n");
        o.fp(" Customer Name:- "+name);
        o.fp(" Phone Number :- "+phone);
        o.fp("____________________________________________________________________________________________________________________");
        o.fp("\tItem bought\t\t\t\t\tQuantity\t\tPrice\t\t\tAmount");
        if(c1==1)
        {
            for(int i=0;i<sii;i++)
            {
                o.fp("\t"+menusid[sid[i]]+"\t\t\t"+sidq[i]+"\t\t\tRs."+pricesid[sid[i]]+"/-\t\tRs."+(sidq[i]*pricesid[sid[i]]));
            }
        }
        if(c2==1)
        {
            for(int i=0;i<bee;i++)
            {
                o.fp("\t"+menubev[bev[i]]+"\t\t\t"+bevq[i]+"\t\t\tRs."+pricebev[bev[i]]+"/-\t\tRs."+(bevq[i]*pricebev[bev[i]]));
            }
        }
        if(c3==1)
        {
            for(int i=0;i<vpp;i++)
            {
                o.fp("\t"+menuvp[veg[i]]+"\t\t\t"+vegq[i]+"\t\t\tRs."+pricevp[veg[i]]+"/-\t\tRs."+(vegq[i]*pricevp[veg[i]]));
            }
        }
        if(c4==1)
        {
            for(int i=0;i<nvv;i++)
            {
                o.fp("\t"+menunvp[nvp[i]]+"\t\t\t"+nvpq[i]+"\t\t\tRs."+pricenvp[nvp[i]]+"/-\t\tRs."+(nvpq[i]*pricenvp[nvp[i]]));
            }
        }
        if(c5==1)
        {
            for(int i=0;i<dee;i++)
            {
                o.fp("\t"+menudes[des[i]]+"\t\t\t"+desq[i]+"\t\t\tRs."+pricedes[des[i]]+"/-\t\tRs."+(desq[i]*pricedes[des[i]]));
            }
        }
        if(c1!=1&&c2!=1&&c3!=1&&c4!=1&&c5!=1)
            o.fp("\t\t\tYOU HAVE NOT ORDERED ANYTHING");
        if(c1==1)
            totalamount=totalamount+amtsi;
        if(c2==1)
            totalamount=totalamount+amtbev;
        if(c3==1)
            totalamount=totalamount+amtvp;
        if(c4==1)
            totalamount=totalamount+amtnvp;
        if(c5==1)
            totalamount=totalamount+amtde;
        o.fp("____________________________________________________________________________________________________________________");
        o.fp("\t\t\t\t\t\t        GST rate is 18%");
        gstamount=totalamount+(totalamount*0.18);
        System.out.println("\t\t\t\tTotal Amount to be paid(including GST) is Rs. "+gstamount+"/-");
        o.fp("Please the amount as convenient to you by cash or card.");
    }

    public static void main()throws IOException, InterruptedException 
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        CONTROL o=new  CONTROL();
        o.welcome();
        o.start();
        o.f("\f");
        o.fp("Press enter to display the bill.");
        String j=in.readLine();
        o.fp("\f");
        o.BILL();
        o.fp("Now press enter to Exit the Program.");
        o.fp("If Wish to Order Further You can re-excute the program.");
        String v=in.readLine();
        o.EXIT();
    }

    void exit()
    {
        System.out.println();
    }

    void EXIT()throws InterruptedException
    {
        CONTROL o=new CONTROL();
        o.fp("\f");
        o.fp("\t\t\t\t\t  Thanks For Coming To PIZZA HUT.");
        o.fp("\t\t\t\t\t\t   VISIT AGAIN!!!");
    }
}