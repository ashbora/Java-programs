class Tester
{
  public static void main(String [] args)
  {
     Cylinder c = new Cylinder();
     c.setRadius(12.56);
     c.setHeight(56.4);
     System.out.println("Volume of cylinder :"+c.volume());
     System.out.println("Surface area of cylinder :"+c.surfaceArea());
  }
}