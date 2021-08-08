 import java.util.Scanner;
 class Multiples
 {
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number :");
     int num = sc.nextInt();
     for(int m=1; m<=10;m++)
     {
       int p = num*m;
       System.out.println(p);
     }
   }
 }
