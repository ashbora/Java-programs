
//Lucky Digit

import java.util.Scanner;
class Nested2
{
   public static void main(String [] args)
   {
       Scanner kb = new Scanner(System.in);
       System.out.print("Enter any number :");
       long num = kb.nextLong();
   
       do
       { 
         int dsum=0;
         while(num>0)
         {
            int d = (int)(num % 10);
            dsum+=d;
            num/=10;
         }
         num=dsum;
       }while(num>=10);
     System.out.println("Lucky Digit :"+num);
   }
}