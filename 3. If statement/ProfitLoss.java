import java.util.Scanner;
class ProfitLoss
{
  public static void main(String [] args)
  {
     Scanner keyin = new Scanner(System.in);
     float cp,sp;
     System.out.print("Enter the cost price :");
     cp = keyin.nextFloat();
     System.out.print("Enter the selling price :");
     sp = keyin.nextFloat();
     if(sp>cp)
     {
       float profit = sp-cp;
       System.out.println("Profit of Rs."+profit);
     }
     else
       if(cp>sp)
       {
         float loss = cp-sp;
         System.out.println("Loss of Rs."+loss); 
       }
       else
          System.out.println("No profit,no loss"); 
      
  }
}