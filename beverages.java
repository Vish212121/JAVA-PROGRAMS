import java.io.*;
public class beverages extends vegpizza
{
    static int amtbev;    
    static int be;
    static int quanbev;
    static int bee;
    static int bev[]=new int[10];
    static int bevq[]=new int[10];
    int pricebev[]={100,110,150,150,169,170,175,180,185,120,110,100};
    String menubev[]={"Coffee                        ","Tea                           ","Iced Tea                      ","Cold Coffee                   ","Strawberry Milkshake          ","Chocolate Milkshake           ","Oreo Milkshake                ","Fruit Juice                   ","Hot Chocolate                 ","Pepsi                         ","Coke                          ","Thumbs up                     "};
    void Beverages()throws IOException, InterruptedException 
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        beverages  o=new beverages();
        o.load();        
        o.fp("\t\t\t\tWelcome to Beverages corner.\n");
        o.fp("The Menu is as following");
        o.fp("_________________________________________________________________________________");
        o.fp("\tMenu\t\t\t\tPrices");
        o.sp("\t1.Coffee\t\t\tRs.100/-");
        o.sp("\t2.Tea\t\t\t\tRs.110/- ");
        o.sp("\t3.Iced Tea\t\t\tRs.150/-");
        o.sp("\t4.Cold Coffee\t\t\tRs.150/-");
        o.sp("\t5.Strawberry Milkshakes\t\tRs.169/-");
        o.sp("\t6.Chocolate Milkshake\t\tRs.170/-");
        o.sp("\t7.Oreo Milkshake\t\tRs.175/-");
        o.sp("\t8.Fruit Juice\t\t\tRs.180/-");
        o.sp("\t9.Hot Chocolate\t\t\tRs.185/-");
        o.sp("\t10.Pepsi\t\t\tRs.120/-");
        o.sp("\t11.Coke\t\t\t\tRs.110/-");
        o.sp("\t12.Thumbs up\t\t\tRs.100/-");
        o.fp("Enter how many types of beverages would you like to order.");
        bee=Integer.parseInt(in.readLine());
        for(int i=0;i<bee;i++)
        {
            o.fp("Enter the Serial Number of the Beverage you want to order.");
            int b=Integer.parseInt(in.readLine());
            if(b<=12)
            {
                be=b;
            }
            else
            {
                System.out.println("Enter a valid choice.");
                be=Integer.parseInt(in.readLine());
            }
            bev[i]=be-1;
            o.fp("Enter the Quantity of "+menubev[bev[i]]);
            quanbev=Integer.parseInt(in.readLine());
            bevq[i]=quanbev;
            amtbev=amtbev+pricebev[bev[i]]*quanbev;
        }
        o.fp("Thank you for ordering.");
        o.fp("Hope you enjoy your Bevrages.");
        Thread.sleep(1000);
        o.fp("\f");
        o.load();
        o.fp("Press enter to Continue");
        String a=in.readLine();
        CONTROL p=new CONTROL();
        p.start();
    }
}