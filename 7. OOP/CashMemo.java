import java.util.Scanner;
class CashMemo
{
  int np;
  String discr[];
  float rate[],amt[];
  int qty[];
  float totamt,disc,netamt;
  
  void input()
  {
    Scanner kbin = new Scanner(System.in);
    System.out.print("Enter number of products :");
    np = kbin.nextInt();
    discr = new String[np];
    rate = new float[np];
    qty  = new int[np];
    amt  = new float[np];
    for(int i=0;i<np;i++)
    {
       System.out.println("Product "+(i+1)+"\n-------");
       System.out.print("Discription  :");
       discr[i] = kbin.next();
       System.out.print("Rate         :");
       rate[i] = kbin.nextFloat();
       System.out.print("Quantity     :");
       qty[i] = kbin.nextInt();           
    } 
  }
  void process()
  {
     totamt = 0;
     for(int i=0;i<np;i++)
     {
        amt[i] = rate[i]*qty[i];
        totamt += amt[i];
     }
     disc = totamt*10/100;
     netamt = totamt-disc;
  }
  void output()
  {
     System.out.println("-------------------------------------------------------------------------------------");
     System.out.printf("%-30s %15s %15s %15s\n","Discription","Rate","Qty","Amount");
     System.out.println("-------------------------------------------------------------------------------------");
     for(int i=0;i<np;i++)
        System.out.printf("%-30s %15.2f %15d %15.2f\n",discr[i],rate[i],qty[i],amt[i]);
     System.out.println("-------------------------------------------------------------------------------------");
     System.out.printf("%62s %15.2f\n","Total amount",totamt);
     System.out.printf("%62s %15.2f\n","Discount",disc);
     System.out.printf("%62s %15.2f\n","Nett amount",netamt); 
  }
}
class CashMemoMain
{
  public static void main(String [] args) 
  {
     CashMemo cashmemo = new CashMemo();
     cashmemo.input();
     cashmemo.process();
     cashmemo.output(); 
  }
}