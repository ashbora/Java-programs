 import java.util.Scanner;
 class DigitSum
 {
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter any number :");
     long num = sc.nextLong();
     int dsum = 0;
     while(num>0)
     {
       int d =(int)(num % 10);
       num=num/10;
       dsum = dsum+d;
     } 
     System.out.print(" The digit sum is "+ dsum);
   }
 }
