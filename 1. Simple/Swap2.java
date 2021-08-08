import java.util.Scanner;
class Swap2
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of a :");
    int a = sc.nextInt();
    System.out.print("Enter the vale of b :");
    int b = sc.nextInt();
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("Now the value of a is "+a+" and b is "+b);
  }
}