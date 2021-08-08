import java.util.Scanner;
class ASMD
{
  public static void main(String [] args)
  {
     Scanner kbin = new Scanner(System.in);
     System.out.print("Enter first number :");
     int num1 = kbin.nextInt();
     System.out.print("Enter second number :");
     int num2 = kbin.nextInt();
     int a = num1+num2;
     int s = num1-num2;
     int m = num1*num2;
     float d = (float)num1/num2;
     System.out.println("Addition       :"+a);
     System.out.println("Subtraction    :"+s);
     System.out.println("Multiplication :"+m);
     System.out.println("Division       :"+d);
  }
}