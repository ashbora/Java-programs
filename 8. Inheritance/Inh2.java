class Circle
{
  double rad;
  void setRadius(double r)
  {
    rad = r;    
  }
  void area()
  {
    double a = Math.PI*rad*rad;
    System.out.println("Area   :"+a);
  }
  void circumference()
  {
    double c = 2 * Math.PI*rad;
    System.out.println("Circumference :"+c);
  }
}
class Cylinder extends Circle
{
  double ht;
  void setHeight(double h)
  {
     ht = h;
  }
  void volume()
  {
    double v = Math.PI*rad*rad*ht;
    System.out.println("Volume      :"+v);
  }
  void surfaceArea()
  {
     double sa = 2*Math.PI*rad*ht;
    System.out.println("Surface area  :"+sa);
  }
}
class Inh2
{
   public static void main(String [] args)
   {
      Cylinder c = new Cylinder();
      c.setRadius(12.5);
      c.setHeight(22.54);
      System.out.println("Base of cylinder\n----------------------");
      c.area();
      c.circumference();
      System.out.println("Body of cylinder\n----------------------");
      c.volume();
      c.surfaceArea();
   }
}