import geometric.Circle;
class UseCircle
{
  public static void main(String [] args)
  {
     Circle c = new Circle();
     c.setRadius(4.5);
     System.out.println("Area  :"+c.area());
     System.out.println("Circumference :"+c.circumference());
  }
}