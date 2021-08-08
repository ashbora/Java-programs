import java.util.Scanner;
class Rectangle
{
  public static void main(String [] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the length of rectangle :");
     float len = sc.nextFloat();
     System.out.print("Enter the breadth of rectangle :");
     float br = sc.nextFloat();
     float a = len * br;
     float p = 2*(len+br);
     System.out.println("Area of rectangle :"+a);
     System.out.println("Perimeter of rectangle :"+p);   
  }  
}