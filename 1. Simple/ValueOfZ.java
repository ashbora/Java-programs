import java.util.Scanner;
class ValueOfZ
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int x,y;
    System.out.print("Enter the value of x:");
    x = sc.nextInt();
    System.out.print("Enter the value of y:");
    y = sc.nextInt();
    double z = (x*x*x + 3.0*x*y + y*y*y)/(x*x + y*y); 
    System.out.println("Value of Z :"+z);
  }
}