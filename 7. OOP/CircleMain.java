import java.util.Scanner;
class Circle
{
   double rad;

   void inputRadius()
   { 
      System.out.print("Enter the radius :");
      rad = (new Scanner(System.in)).nextDouble(); 
   } 
   void area()
   {
      double a = Math.PI*rad*rad;
      System.out.println("Area of  circle :"+a);
   }   
   void circumference()
   {
      double c = 2*Math.PI*rad;
      System.out.println("Circumference of circle :"+c);
   }
}

class CircleMain
{
  public static void main(String [] args)
  {
      Circle c;            //object declaration
      c = new Circle();    //object creation 
      c.inputRadius();
      c.area();
      c.circumference();        
  }
}