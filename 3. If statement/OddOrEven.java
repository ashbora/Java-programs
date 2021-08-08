import java.util.Scanner;
class OddOrEven
{
  public static void main(String [] args)
  {
     Scanner keyin = new Scanner(System.in);
     System.out.print("Enter any integer number :");
     int num = keyin.nextInt();
     if(num%2==0)
        System.out.println("Number is Even");
     else
        System.out.println("Number is Odd");
  }
}