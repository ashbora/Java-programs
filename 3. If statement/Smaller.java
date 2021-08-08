import java.util.Scanner;
class Smaller
{
  public static void main(String [] args)
  {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter first number :");
       int x = sc.nextInt();
       System.out.print("Enter second number :");
       int y = sc.nextInt();
       if(x<y)
         System.out.println("Smaller number is "+x);
       else
         System.out.println("Smaller number is "+y);
  }
}