import java.util.Scanner;
class Largest
{
  public static void main(String [] args)
  {
     Scanner keyin = new Scanner(System.in);
     int a,b,c;
     System.out.print("Enter the first number :");
     a = keyin.nextInt();
     System.out.print("Enter the second number :");
     b = keyin.nextInt();
     System.out.print("Enter the third number :");
     c = keyin.nextInt();
     if(a>b && a>c)
       System.out.println("Largest number is "+a);
     else
       if(b>c)
         System.out.println("Largest number is "+b);
       else
         System.out.println("Largest number is "+c);
      
  }
}