import java.util.Scanner;
class PositiveOrNegative
{
  public static void main(String [] args)
  {
     Scanner keyin = new Scanner(System.in);
     System.out.print("Enter any number :");
     double num = keyin.nextDouble();
     if(num>=0)
        System.out.println("Number is Positive");
     else
        System.out.println("Number is Negative");
  }
}