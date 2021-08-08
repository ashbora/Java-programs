import java.util.Scanner;
class Nelson
{
   public static void main(String [] args)
   {
     Scanner keyin = new Scanner(System.in);
     System.out.print("Enter a three-digit integer number :");
     int num  = keyin.nextInt();
     int d1,d2,d3;
     d1 = num % 10;
     d2 = num % 100 / 10;
     d3 = num / 100;
     if(d1==d2 && d2==d3)
       System.out.print("Number is Nelson");
     else
       System.out.print("Number is not Nelson"); 
   }
}