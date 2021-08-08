import java.util.Scanner;
class Circle
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius of the circle :");
    double rad = sc.nextDouble();
    double a = Math.PI*rad*rad;
    double c = 2*Math.PI*rad;
    System.out.println("Area of circle :"+a+" Circumference of circle :"+c);
  
  }
}